package ServiceLayer;
import DatabaseLayer.CustomerDatabaseConnection;
import Model.MusicMart.CustomerAccount;
public class CustomerService {
    private CustomerDatabaseConnection instance;
    public CustomerService()
    {
        instance=CustomerDatabaseConnection.getSingleDatabaseConnection();
    }
    public boolean AddCustomer(CustomerAccount c)
    {
        boolean status=instance.ExecuteSQLQuery("insert into customerdetails values("+c.CusID+",'"+c.CusName+"','"+c.CusPassword+"','"+c.CusEmail+"','"+c.CusMobile+"');");
        return status;
    }
    
//    public String getCustomer(int id)
//    {
//        return instance.ExecuteSQLQuery("select CusPassword from customerdetails where CusID="+id+"");
//    }
}
