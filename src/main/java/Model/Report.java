package Model;
//Nimshi
public class Report {
    private double instruments_price;
    private double accessories_price;
    private double repairjob_price;
    private double cost;
    private double wage;
    private double supplies;
    private double rent;
    private double utilities;
    private double revenue;
    private double expenses;
    
    public Report()
    {
        this.instruments_price=0.0;
        this.accessories_price=0.0;
        this.repairjob_price=0.0;
    }
//need to take the outputs from the database
    public void setInstruments()
    {
        instruments_price= 23234;//get the instrument value from the database
    }
    public double getInstrument()
    {
        return instruments_price;
    }
    public void setAccessories()
    {
        accessories_price=4332;//get accessories value from the database
    }
    public double getAccessories()
    {
        return accessories_price;
    }
    public void setRepairJob()
    {
        repairjob_price=343;//get repair job price from database
    }
    public double getRepaireJob()
    {
        return repairjob_price;
    }
    public double Total()
    {
        return revenue-expenses;
    }
    public void setcost()
    {
        cost=434;//get cost from the database (add all the instruments and accessories cost)
    }
    public double getcost()
    {
        return cost;
    }
     public void Expenses()
    {
        expenses=cost+wage+supplies+rent+utilities;
    }
    public double getExpenses()
    {
        return expenses;
    }
    public void Revenue()
    {
        revenue=instruments_price+accessories_price+repairjob_price;
        
    }
    public double getRevenue()
    {
        return revenue;
    }
    
    
}
