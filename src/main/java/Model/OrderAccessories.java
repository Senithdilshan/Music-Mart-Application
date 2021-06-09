package Model;

public class OrderAccessories extends MusicMart {

    public int AccID;
    public String AccName;
    public float AccPrice;
    public int AccQuantity;

    public OrderAccessories(int AccID, String AccName, float AccPrice, int AccQuantity) {
        this.AccID = AccID;
        this.AccName = AccName;
        this.AccPrice = AccPrice;
        this.AccQuantity = AccQuantity;
    }

    public OrderAccessories() {

        this.AccID = 0;
        this.AccName = null;
        this.AccPrice = 0.0f;
        this.AccQuantity = 0;

    }

    public float calAccTotal() {
        float AccTotal = (float) AccQuantity * AccPrice;
        return AccTotal;    
    }

//    @Override
//    public String getForm() {
//        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
//    }

}
