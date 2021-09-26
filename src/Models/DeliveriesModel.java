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
public class DeliveriesModel {
     private int Id,Customer_Id,Quantity,Promo_Id,Status,User_Id;
    private String Date_Delivered,Customer_Fname,Customer_Mname,Customer_Lname,User_Fname,User_Mname,User_Lname,Promo_Description;
    
    public DeliveriesModel(int Id,int Customer_Id,String Date_Delivered,int Quantity,int Promo_Id,int Status,int User_Id,
                           String User_Fname,String User_Mname,String User_Lname,String Promo_Description,String Customer_Fname,String Customer_Mname,String Customer_Lname){
        this.Id = Id;
        this.Customer_Id = Customer_Id;
        this.Date_Delivered = Date_Delivered;
        this.Quantity = Quantity;
        this.Promo_Id = Promo_Id;
        this.Status = Status;
        this.User_Id = User_Id;
        this.Customer_Fname = Customer_Fname;
        this.Customer_Mname = Customer_Mname;
        this.Customer_Lname = Customer_Lname;
        this.User_Fname = User_Fname;
        this.User_Mname = User_Mname;
        this.User_Lname = User_Lname;
        this.Promo_Description = Promo_Description;   
    }
    public DeliveriesModel(int Id,int Customer_Id,String Date_Delivered, int Quantity ,int Promo_Id, int Status, int User_Id){
        this.Id = Id;
        this.Customer_Id = Customer_Id;
        this.Date_Delivered = Date_Delivered;
        this.Quantity = Quantity;
        this.Promo_Id = Promo_Id;
        this.Status = Status;
        this.User_Id = User_Id;
    }
    
    public int getId(){
        return Id;
    } public int getCustomer_Id(){
        return Customer_Id;
    } public String getDate_Delivered(){
        return Date_Delivered;
    } public int getQuantity(){
        return Quantity;
    } public int getPromo_Id(){
        return Promo_Id;
    } public int getStatus(){
        return Status;
    }public String getStat(){
        if (Status==0) {
            return "Pending";
        }return "Delivered";
    }
    public int getUser_Id(){
        return User_Id;
    }
    
//    Customers
    public String getCustomer_Fullname(){
        return Customer_Fname + " " + Customer_Mname + " " + Customer_Lname;
    }
    
//    Users
    public String getUser_Fullname(){
        return User_Fname + " " + User_Mname + " " + User_Lname;
    }public String getPromo_Description(){
        return Promo_Description;
    }
    
    
}
