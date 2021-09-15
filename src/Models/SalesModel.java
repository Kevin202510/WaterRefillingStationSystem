/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Models;

/**
 *
 * @author ChelseaTorres
 */
public class SalesModel {
    private int Id,Quantity,Gallon_Id,User_Id,Customer_Id;
    private String Purchase_date;
    
    
     
        public SalesModel(int Id,String Purchase_date,int Quantity,int Gallon_Id,int User_Id,int Customer_Id){
        this.Id=Id;
        this.Purchase_date=Purchase_date;
        this.Quantity=Quantity;
        this.Gallon_Id=Gallon_Id;
        this.User_Id=User_Id;
        this.Customer_Id=Customer_Id;
       
    
}

    
        public int getId(){
        return Id;
    }    public String getPurchase_date(){
        return Purchase_date;
    }
        public int getQuantity(){
        return Quantity;
    }
        public int getGallon_Id(){
        return Gallon_Id;
    }
        public int getUser_Id(){
        return User_Id;
    }
        public int getCustomer_Id(){
        return Customer_Id;
    }
}
