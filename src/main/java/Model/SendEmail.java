
package Model;

import java.util.Properties;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.mail.Message;
import javax.mail.PasswordAuthentication;
import javax.mail.Session;
import javax.mail.Transport;
import javax.mail.internet.AddressException;
import javax.mail.internet.*;
import javax.mail.internet.MimeMessage;

public class SendEmail {

    public static void SendEmail(String recepient) throws Exception{
        System.out.println("Preparing to send Email");
        Properties props = new Properties();
        props.put("mail.smtp.auth", true);
        props.put("mail.smtp.starttls.enable", true);
        props.put("mail.smtp.host", "smtp.gmail.com");
        props.put("mail.smtp.port", "587");
        props.setProperty("mail.smtp.ssl.trust", "smtp.gmail.com");
        String myAccountEmail = "musicmart53@gmail.com";
        String Password = "music@123";

        Session session = Session.getInstance(props, new javax.mail.Authenticator() {
            @Override
            protected PasswordAuthentication getPasswordAuthentication() {
                return new PasswordAuthentication(myAccountEmail, Password);
            }
        });
        Message message = prepareMessage(session, myAccountEmail,recepient);
        Transport.send(message);
        System.out.println("Message sent Successfully");
    }

    public static Message prepareMessage(Session session, String myAccountEmail,String recepient) {
        try {
            Message message = new MimeMessage(session);
            message.setFrom(new InternetAddress(myAccountEmail));//ur email
            message.setRecipients(Message.RecipientType.TO,InternetAddress.parse(recepient));//u will send to
            message.setSubject("Order Details");
            message.setText("Dear Customer,\nYour order is Successful.\nThank You");
            return message;
        } catch (Exception ex) {
            Logger.getLogger(SendEmail.class.getName()).log(Level.SEVERE, null, ex);
        }
        return null;

    }

}
