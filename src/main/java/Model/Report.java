package Model;
//Nimshi

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.*;

public class Report {
    private double instruments_price;
    private double accessories_price;
    private double repairjob_price;
    static private double cost=300000;
    static private double wage=100000;
    static private double supplies=40000;
    static private double rent=40000;
    static private double utilities=10000;
    static private double repCost=20000;
    static private double revenue;
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
      
        try {
            Connection con = null;
            Class.forName("com.mysql.cj.jdbc.Driver");//com.microsoft.sqlserver.jdbc.SQLServerDriver
            con = DriverManager.getConnection("jdbc:mysql://127.0.0.1:3306/music_mart", "root", "");
            String query = "select sum(TotalPrice) from inspurchase where day(PDate) BETWEEN 1 and 30";
            PreparedStatement pst = con.prepareStatement(query);
            ResultSet rs = pst.executeQuery();
            if (rs.next()) {
                float TotalIns = rs.getFloat("sum(TotalPrice)");
                instruments_price=TotalIns;
            }
        }catch(Exception e)
                    {
                    
                    }
    }
    public double getInstrument()
    {
        return instruments_price;
    }
    public void setAccessories()
    {
         try {
            Connection con = null;
            Class.forName("com.mysql.cj.jdbc.Driver");//com.microsoft.sqlserver.jdbc.SQLServerDriver
            con = DriverManager.getConnection("jdbc:mysql://127.0.0.1:3306/music_mart", "root", "");
            String query = "SELECT sum(TotalPrice)from asspurchase where day(PDate) BETWEEN 1 and 30";
            PreparedStatement pst = con.prepareStatement(query);
            ResultSet rs = pst.executeQuery();
            if (rs.next()) {
                float TotalIns = rs.getFloat("sum(TotalPrice)");
                accessories_price=TotalIns;
            }
        }catch(Exception e)
                    {
                    
                    }
    }
    
    public double getAccessories()
    {
        return accessories_price;
    }
    public void setRepairJob()
    {
        try {
            Connection con = null;
            Class.forName("com.mysql.cj.jdbc.Driver");//com.microsoft.sqlserver.jdbc.SQLServerDriver
            con = DriverManager.getConnection("jdbc:mysql://127.0.0.1:3306/music_mart", "root", "");
            String query = "SELECT sum(Cost)from jobdetails where day(RepairDoneDate) BETWEEN 1 and 30";
            PreparedStatement pst = con.prepareStatement(query);
            ResultSet rs = pst.executeQuery();
            if (rs.next()) {
                float TotalIns = rs.getFloat("sum(Cost)");
                repairjob_price=TotalIns;
            }
        }catch(Exception e)
                    {
                    
                    }
    }
    public double getRepaireJob()
    {
        return repairjob_price;
    }
    public double Total()
    {
        return revenue-expenses;
    }
    public double getcost()
    {
        return cost;
    }
    public double getwage()
    {
        return wage;
    }
    public double getRepairstCost()
    {
        return repCost;
    }
    public double getrent()
    {
        return rent;
    }
    public double getsupply()
    {
        return supplies;
    }
    public double getutility()
    {
        return utilities;
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

