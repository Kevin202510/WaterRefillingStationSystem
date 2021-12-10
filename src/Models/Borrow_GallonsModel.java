/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Models;

/**
 *
 * @author CALUAG FAMILY
 */
public class Borrow_GallonsModel {
    private int ID,Customer_Id,Gallon_Quantity,Status;
    private String Date_Borrowed,Gallon_Code;
    private String Customer_Fullname,Gallon_Type;

    
    public Borrow_GallonsModel(int ID,int Customer_Id,String Gallon_Code,int Gallon_Quantity,String Date_Borrowed,int Status){
        this.ID = ID;
        this.Customer_Id = Customer_Id;
        this.Gallon_Code = Gallon_Code;
        this.Gallon_Quantity = Gallon_Quantity;
        this.Date_Borrowed = Date_Borrowed;
        this.Status = Status;
    }
    
    public Borrow_GallonsModel(String CFname,String CMname,String CLname,String Gallon_Type){
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
    }public int getStatus(){
        return Status;
    }public String getDate_Borrowed(){
        return Date_Borrowed;
    }
    
//    mofify getter
    public String getCustomer_Fullname(){
        return Customer_Fullname;
    }public String getGallon_Type(){
        return Gallon_Type;
    }
}
