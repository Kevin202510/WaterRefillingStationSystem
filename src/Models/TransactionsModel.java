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
public class TransactionsModel {
    int Customer_Id,Quantity,Promo_Id,ServiceType,Status,User_Id;
    String DOorDR,Gallon_Id,DDorDP;
    
    public TransactionsModel(int Customer_Id, String DOorDR, String DDorDP, String Gallon_Id, int Quantity, int Promo_Id, int ServiceType, int Status, int User_Id){
        this.Customer_Id = Customer_Id;
        this.DOorDR = DOorDR;
        this.DDorDP = DDorDP;
        this.Gallon_Id = Gallon_Id;
        this.Quantity = Quantity;
        this.Promo_Id = Promo_Id;
        this.ServiceType = ServiceType;
        this.Status = Status;
        this.User_Id = User_Id;
    }
    
    public int getCustomer_Id(){
        return Customer_Id;
    }public int getQuantity(){
        return Quantity;
    }public int getPromo_Id(){
        return Promo_Id;
    }public int getServiceType(){
        return ServiceType;
    }public int getStatus(){
        return Status;
    }public int getUser_Id(){
        return User_Id;
    }public String getDDorDR(){
        return DOorDR;
    }public String getDDorDP(){
        return DDorDP;
    }public String getGallonCode(){
        return Gallon_Id;
    }
    
}
