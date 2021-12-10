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
    
   private int ID,Customer_Id,Gallon_Return_Quantity,borrowedGallonsId;
    private String Date_Return,Gallon_Code;
    private String Customer_Fullname,Gallon_Type;

    
    public Return_GallonsModel(int ID,int borrowedGallonsId,int Gallon_Return_Quantity,String Date_Return){
        this.ID = ID;
        this.borrowedGallonsId = borrowedGallonsId;
        this.Gallon_Return_Quantity = Gallon_Return_Quantity;
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
    }public int getGallon_Return_Quantity(){
        return Gallon_Return_Quantity;
    }public int getborrowedGallonsId(){
        return borrowedGallonsId;
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
