import Model.MusicMart;
import ServiceLayer.CustomerService;
import org.junit.jupiter.api.*;
public class CustomerService_unit_test {
    static CustomerService c1;
    static MusicMart m1;
    boolean val;
    @BeforeAll
    public static void createService()
    {
        c1=new CustomerService();
        m1=new MusicMart();
      
    }
    @BeforeEach
    public void setService()
    {
        MusicMart.CustomerAccount a1= m1.new CustomerAccount(435,"sfgdd","123","sfsfsdfg","12345"); 
        val=c1.AddCustomer(a1);
    }
    @Test
    public void testService()
    {
        Assertions.assertTrue(val);
    }
    @AfterEach
    public void cleanService()
    {
        val=false;
    }
    @AfterAll
    public static void DeleteService()
    {
        c1=null;
        m1=null;
    }
    
}
