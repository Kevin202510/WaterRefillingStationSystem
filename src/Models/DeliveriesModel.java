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
    private String Date_Delivered,Date_Order,Gallon_Id;
    private String Customer_Fullname,Gallon_Name,Promo_Description,User_Fullname;
    
    public DeliveriesModel(int Id,int Customer_Id,String Date_Order,String Date_Delivered,String Gallon_Id,int Quantity,int Promo_Id,int Status,int User_Id){
        this.Id = Id;
        this.Customer_Id = Customer_Id;
        this.Date_Delivered = Date_Delivered;
        this.Date_Order = Date_Order;
        this.Gallon_Id = Gallon_Id;
        this.Quantity = Quantity;
        this.Promo_Id = Promo_Id;
        this.Status = Status;
        this.User_Id = User_Id;
    }
    
    public DeliveriesModel(String Customer_Fname,String Customer_Mname,String Customer_Lname,String Gallon_Name,String Promo_Description,String User_Fname,String User_Mname,String User_Lname){
        this.Customer_Fullname = Customer_Fname + " " + Customer_Mname + " " + Customer_Lname;
        this.Gallon_Name = Gallon_Name;
        this.Promo_Description = Promo_Description;
        this.User_Fullname = User_Fname + " " + User_Mname + " " + User_Lname;
    }
    
    public DeliveriesModel(int id,int status){
        this.Id = id;
        this.Status = status;
    }
    
    public int getId(){
        return Id;
    } public int getCustomer_Id(){
        return Customer_Id;
    } public String getDate_Delivered(){
        return Date_Delivered;
    } public String getDate_Order(){
        return Date_Order;
    } public int getQuantity(){
        return Quantity;
    }public String getGallon_Id(){
        return Gallon_Id;
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
    
//    modify 
    
   public String getCustomer_Fullname(){
       return Customer_Fullname;
   }public String getUser_Fullname(){
       return User_Fullname;
   }public String getGallon_Name(){
       return Gallon_Name;
   }public String getPromo_Description(){
       if (Promo_Description==null){
           Promo_Description = "No Available";
       }
       return Promo_Description;
   }
}
