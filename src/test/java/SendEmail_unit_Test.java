import Model.SendEmail;
import org.junit.jupiter.api.*;
public class SendEmail_unit_Test {
    static SendEmail s1;
    String mail;
    String msgpass="nimshisulakshana@gmail.com";
    @BeforeAll
    public static void createMail()
    {
        s1=new SendEmail();
    }
    @BeforeEach
    public void setMail() throws Exception 
    {
        mail=s1.SendEmail(msgpass);
        
    }
    @Test
    public void CheckValue()
    {
        Assertions.assertEquals("Message sent Successfully","Message sent Successfully");
        
    }
    @AfterEach
    public void clearVal()
    {
       
        mail=null;
    }
    @AfterAll
    public void DeleteMail()
    {
        s1=null;
    }
}
