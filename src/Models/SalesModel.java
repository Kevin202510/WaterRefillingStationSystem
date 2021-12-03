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
    private int Id,Amount,User_Id;
    private String Sales_Date;
    
     
        public SalesModel(int Id,String Sales_Date,int Amount,int User_Id){
        this.Id=Id;
        this.Sales_Date=Sales_Date;
        this.Amount=Amount;
        this.User_Id=User_Id;
  
       
    
}

    
        public int getId(){
        return Id;
    }    public String getSales_Date(){
        return Sales_Date;
    }
        public int getAmount(){
        return Amount;
    }
        public int getUser_Id(){
        return User_Id;
    }
}
