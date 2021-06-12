import Model.OrderAccessories;
import org.junit.jupiter.api.*;
public class Order_accessories_unit_test {
    static OrderAccessories a1;
    double val;
    @BeforeAll
    public static void createSub()
    {
        a1= new OrderAccessories(1,"Drumset Chair",15000,2);
    }
    
    @BeforeEach
    public void setSub()
    {
        val=30000;
    }
    @Test
    public void testSub()
    {
        Assertions.assertEquals(val,a1.calAccTotal());
    }
    @AfterEach
    public void cleanvariable()
    {
        val=0;
    }
    @AfterAll
    public static void DeleteSub()
    {
        a1=null;
    }
    
}
