package Utilities;
import DatabaseLayer.CustomerDatabaseConnection;
import Model.SendEmail;
import Model.Report;


public class main {

   public static void main(String[] args) throws Exception {

               String emsg = SendEmail.SendEmail("nimshisulakshana@gmail.com");
               System.out.println(emsg);
////              Email e=new Email();
////              CustomerDatabaseConnection d = new CustomerDatabaseConnection();
//////              d.ExecuteSQLQuery("insert into customerdetails values(466,null,null,null,null);");
//   Report r = new Report();
//   r.setAccessories();
//   r.setInstruments();
//   r.getInstrument();
//   r.getAccessories();
            



    }
}
