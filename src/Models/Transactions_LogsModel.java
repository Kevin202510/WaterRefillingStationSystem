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
public class Transactions_LogsModel {
    
    private int ID,Customer_Id,Gallon_Id,Gallon_Quantity,Total_Amount,Status,User_Id;
        private String Transaction_Date,Transaction_Time;
        private String Customer_Fullname,Gallon_Name,User_Fullname;
    
        
        public Transactions_LogsModel(int ID,int Customer_Id,int Gallon_Id,int Gallon_Quantity,int Total_Amount,int Status,int User_Id ,String Transaction_Date,String Transaction_Time){
        this.ID=ID;
        this.Customer_Id=Customer_Id;
        this.Gallon_Id=Gallon_Id;
        this.Gallon_Quantity=Gallon_Quantity;
        this.Total_Amount=Total_Amount;
        this.Status=Status;
        this.User_Id=User_Id;
        this.Transaction_Date=Transaction_Date;
        this.Transaction_Time=Transaction_Time;
        
        
        
   
}
        public Transactions_LogsModel(String Customer_Fname,String Customer_Mname,String Customer_Lname,String Gallon_Name,String User_Fname,String User_Mname,String User_Lname){
        this.Customer_Fullname = Customer_Fname + " " + Customer_Mname + " " + Customer_Lname;
        this.Gallon_Name = Gallon_Name;
        this.User_Fullname = User_Fname + " " + User_Mname + " " + User_Lname;
    }
    
           public int getID(){
            return ID;
         }public int getCustomer_Id(){
            return Customer_Id;
         }public int getGallon_Id(){
            return Gallon_Id;
         }public int getGallon_Quantity(){
            return Gallon_Quantity;
         }public int getTotal_Amount(){
            return Total_Amount;
         }public int getStatus(){
            return Status;
         }public int getUser_Id(){
            return User_Id;
         }public String getTransaction_Date(){
            return Transaction_Date;  
         }public String getTransaction_Time(){
            return Transaction_Time;
         }public String getCustomer_Fullname(){
            return Customer_Fullname;
         }public String getUser_Fullname(){
            return User_Fullname;
         }public String getGallon_Name(){
            return Gallon_Name;
   }
         
}