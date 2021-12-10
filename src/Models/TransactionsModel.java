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
    int transactionId,Customer_Id,Quantity,Promo_Id,ServiceType,Status,User_Id,waterType,isBorrowed_Gallons,paymentOption;
    String DOorDR,Gallon_Id,DDorDP;
    double salePrice,totalAmount,unitPrice;
    
    public TransactionsModel(int transactionId,int Customer_Id, String DOorDR, String DDorDP,double salePrice,int waterType,String Gallon_Id,double unitPrice, int Quantity, int Promo_Id, int ServiceType, int Status, int User_Id){
        this.transactionId = transactionId;
        this.Customer_Id = Customer_Id;
        this.DOorDR = DOorDR;
        this.unitPrice = unitPrice;
        this.DDorDP = DDorDP;
        this.Gallon_Id = Gallon_Id;
        this.Quantity = Quantity;
        this.Promo_Id = Promo_Id;
        this.ServiceType = ServiceType;
        this.Status = Status;
        this.User_Id = User_Id;
        this.salePrice = salePrice;
        this.waterType = waterType;
    }
    
    
    public TransactionsModel(int isBorrowed_Gallons){
        this.isBorrowed_Gallons = isBorrowed_Gallons;
    }
    
    public TransactionsModel(double totalAmount,int paymentOption){
        this.totalAmount = totalAmount;
        this.paymentOption = paymentOption;
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
    }public Double getSalePrice(){
        return salePrice;
    }public int getwaterType(){
        return waterType;
    }public int isBorrowed_Gallons(){
        return isBorrowed_Gallons;
    }
    public double gettotalAmount(){
        return totalAmount;
    }public double getunitPrice(){
        return unitPrice;
    }public int getpaymentOption(){
        return paymentOption;
    }public int gettransactionId(){
        return transactionId;
    }
}
