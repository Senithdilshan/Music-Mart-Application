package Model;

public class OrderInstrument extends MusicMart {

    public int InsID;
    public String InsName;
    public float InsPrice;
    public int InsQuantity;

    public OrderInstrument(int InsID, String InsName, float InsPrice, int InsQuantity) {
        this.InsID = InsID;
        this.InsName = InsName;
        this.InsPrice = InsPrice;
        this.InsQuantity = InsQuantity;
    }

    public OrderInstrument() {
        this.InsID = 0;
        this.InsName = null;
        this.InsPrice = 0.0f;
        this.InsQuantity = 0;
    }
    public float ShowPrice() {
        return InsPrice;
    }
    public float CalTotal() {
        float InsTotal = InsQuantity * InsPrice;
        return InsTotal;
    }
    public void Ins(int InsID, String InsName, float InsPrice, int InsQuantity)
    {
        OrderInstrument Order=new OrderInstrument(InsID,InsName,InsPrice,InsQuantity);
    }
    
    @Override
    public String getForm() {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }
    
}
