package Model;

public  class MusicMart {

    private String AdminName ;
    private String AdminPassword ;
    public MusicMart(String AdminName,String AdminPassword)
    {
        this.AdminName=AdminName;
        this.AdminPassword=AdminPassword;
    }
    public MusicMart()
    {
        this.AdminName=null;
        this.AdminPassword=null;
    }

    public class CustomerAccount {
       
        public int CusID;
        public String CusName;
        public String CusPassword;
        public String CusEmail;
        public String CusMobile;

        public CustomerAccount(int CusID, String CusName, String CusPassword, String CusEmail, String CusMobile) {
            this.CusID = CusID;
            this.CusName = CusName;
            this.CusPassword = CusPassword;
            this.CusEmail = CusEmail;
            this.CusMobile = CusMobile;
        }
        

        public CustomerAccount() {
            this.CusID = 0;
            this.CusName = null;
            this.CusPassword = null;
            this.CusEmail = null;
            this.CusMobile = null;

        }
         
    }

    
    
   // public abstract String getForm();
    
    public String getAdmin()
    {
        return AdminName+AdminPassword;
    }

    public class RepairistAcc {

        private int RepID;
        private String RepName;
        private String RepPassword;
        public RepairistAcc(int RepID, String RepName,String RepPassword)
        {
            this.RepID = RepID;
            this.RepName = RepName;
            this.RepPassword =RepPassword;
        }
        public RepairistAcc()
        {
            this.RepID = 0;
            this.RepName = null;
            this.RepPassword = null;
        }
    }
    
    public class SupplierAcc{
        private int SupID;
        private String SupName;
        private String SupPassword;
        public SupplierAcc(int SupID, String SupName,String SupPassword)
        {
            this.SupID = SupID;
            this.SupName = SupName;
            this.SupPassword =SupPassword;
        }
        public SupplierAcc()
        {
            this.SupID = 0;
            this.SupName = null;
            this.SupPassword = null;
        }
        
    }

}
