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
    private String Date_Delivered;
    
    public DeliveriesModel(int Id,int Customer_Id,String Date_Delivered,int Quantity,int Promo_Id,int Status,int User_Id){
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
    } public int getUser_Id(){
        return User_Id;
    }
    
}
