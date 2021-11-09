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
    
    private int Supplier_id,Stocks;
    private double PurchasePrice;
    private String Code,Size,Color,Gallon_Type, Date_delivered,SupplierFullname;
    
    public GallonsModel(String Code,String Size ,String Color ,String Gallon_Type,int Supplier_id,String Date_delivered,double PurchasePrice, int Stocks ){
        this.Code=Code;
        this.Size=Size;
        this.Color=Color;
        this.Gallon_Type=Gallon_Type;
        this.Supplier_id=Supplier_id;
        this. Date_delivered=Date_delivered;
        this.PurchasePrice=PurchasePrice;
        this.Stocks=Stocks;
    }
    
    public GallonsModel(String SupplierFullname){
        this.SupplierFullname = SupplierFullname;
    }
    
    public String getCode(){
        return Code;
    }public String getSize(){
        return Size;
    }public String getColor(){
        return Color;
    }public String getGallon_Type(){
        return Gallon_Type;
    }public int getSupplier_id(){
     return Supplier_id;
    }public String getDate_delivered(){
      return Date_delivered;
    }public String getSupplierFullname(){
      return SupplierFullname;
    }public double getPurchasePrice(){
        return PurchasePrice;
    }public int getStocks(){
        return Stocks;
    }
    
}
