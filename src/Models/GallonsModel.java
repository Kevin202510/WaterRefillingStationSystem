/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Models;

/**
 *
 * @author Maria Crystaline
 */
public class GallonsModel {
    
      private int Gallon_Code,Supplier_id,Price,Stocks;
    private String Gallon_Type, Date_delivered,Name,Size,Color;
    
    public GallonsModel(int Gallon_Code,String Name ,String Size ,String Color ,String Gallon_Type,int Supplier_id,String Date_delivered,int Price, int Stocks ){
        this.Gallon_Code=Gallon_Code;
        this.Name=Name;
        this.Size=Size;
        this.Color=Color;
        this.Gallon_Type=Gallon_Type;
        this.Supplier_id=Supplier_id;
        this. Date_delivered=Date_delivered;
        this.Price=Price;
        this.Stocks=Stocks;
    }
    
    public int getGallon_Code(){
        return Gallon_Code;
    }public int getSupplier_id(){
        return Supplier_id;
    }public String getName(){
        return Name;
    }public String getSize(){
        return Size;
    }public String getColor(){
        return Color;
    }public String getGallon_Type(){
        return Gallon_Type;
    }public String getDate_delivered(){
        return Date_delivered;
    }public int getPrice(){
        return Price;
    }public int getStocks(){
        return Stocks;
        
    
   
    }
    
}
