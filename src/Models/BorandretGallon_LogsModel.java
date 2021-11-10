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
public class BorandretGallon_LogsModel {
    
      private int ID,Customer_Id,Gallon_Id,Gallon_Quantity;
        private String Transaction_Time,Transaction_Date;
    
        
        public BorandretGallon_LogsModel(int ID,int Customer_Id,int Gallon_Id,int Gallon_Quantity, String Transaction_Time,String Transaction_Date){
        this.ID=ID;
        this.Customer_Id=Customer_Id;
        this.Gallon_Id=Gallon_Id;
        this.Gallon_Quantity=Gallon_Quantity;
        this.Transaction_Time=Transaction_Time;
        this.Transaction_Date=Transaction_Date;
   
}
         public int getID(){
            return ID;
         }public int getCustomer_Id(){
            return Customer_Id;
         }public int getGallon_Id(){
            return Gallon_Id;
         }public int getGallon_Quantity(){
            return Gallon_Quantity;
         }public String getTransaction_Time(){
            return Transaction_Time;
         }public String getTransaction_Date(){
            return Transaction_Date;
         
    }
}