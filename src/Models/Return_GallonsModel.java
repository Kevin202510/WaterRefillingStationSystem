/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Models;

/**
 *
 * @author KevinCaluag
 */
public class Return_GallonsModel {
    
   private int ID,Customer_Id,Gallon_Quantity;
    private String Date_Return,Gallon_Code;
    private String Customer_Fullname,Gallon_Type;

    
    public Return_GallonsModel(int ID,int Customer_Id,String Gallon_Code,int Gallon_Quantity,String Date_Return){
        this.ID = ID;
        this.Customer_Id = Customer_Id;
        this.Gallon_Code = Gallon_Code;
        this.Gallon_Quantity = Gallon_Quantity;
        this.Date_Return = Date_Return;
    }
    
    public Return_GallonsModel(String CFname,String CMname,String CLname,String Gallon_Type){
        this.Customer_Fullname = CFname + " " + CMname + " " + CLname;
        this.Gallon_Type = Gallon_Type;
    }
    
    public int getID(){
        return ID;
    }public int getCostumer_Id(){
        return Customer_Id;
    }public String getGallon_Code(){
        return Gallon_Code;
    }public int getGallon_Quantity(){
        return Gallon_Quantity;
    }public String getDate_Return(){
        return Date_Return;
    }
    
//    mofify getter
    public String getCustomer_Fullname(){
        return Customer_Fullname;
    }public String getGallon_Type(){
        return Gallon_Type;
    }
}
