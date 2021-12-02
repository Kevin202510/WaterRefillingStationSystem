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
    
    private int ID,IdInit,Customer_Id,Gallon_Id,Gallon_Quantity,ServiceType,Status,User_Id,Transaction_Id,PaymentStatus;
    private double Total_Amount;
        private String Transaction_Date,Transaction_Time;
        private String Customer_Fullname,Gallon_Name,User_Fullname,PromoName;
    
        
        public Transactions_LogsModel(int ID,int Transaction_Id,double Total_Amount,int PaymentStatus,String Transaction_Date,String Transaction_Time){
        this.ID=ID;
        this.Transaction_Id = Transaction_Id;
        this.Total_Amount=Total_Amount;
        this.PaymentStatus = PaymentStatus;
        this.Transaction_Date=Transaction_Date;
        this.Transaction_Time=Transaction_Time;
}
        public Transactions_LogsModel(String Customer_Fname,String Customer_Mname,String Customer_Lname,String Gallon_Name,int GallonQuantity,int Status,String PromoName,int ServiceType,String User_Fname,String User_Mname,String User_Lname){
        this.Customer_Fullname = Customer_Fname + " " + Customer_Mname + " " + Customer_Lname;
        this.Gallon_Name = Gallon_Name;
        this.PromoName = PromoName;
        this.Gallon_Quantity = GallonQuantity;
        this.ServiceType = ServiceType;
        this.Status = Status;
        this.User_Fullname = User_Fname + " " + User_Mname + " " + User_Lname;
    }
        
        public Transactions_LogsModel(int IdInit){
            this.IdInit = IdInit;
        }
        
    
           public int getID(){
            return ID;
         }public int getCustomer_Id(){
            return Customer_Id;
         }public int getGallon_Id(){
            return Gallon_Id;
         }public int getGallon_Quantity(){
            return Gallon_Quantity;
         }public int getStatus(){
            return Status;
         }public int getUser_Id(){
            return User_Id;
         }public int getServiceType(){
            return ServiceType;
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
        }public String getPromoName(){
            if(PromoName==null){
                PromoName = "No Promo";
            }
            return PromoName;
        }public String getServiceTypeVal(){
            String sval;
            if(ServiceType==0){
                sval = "Deliver";
            }else{
                sval = "Walk In";
            }
            return sval;
         }public String getStatusVal(){
            String statval;
            if(Status==0){
                statval = "Pending";
            }else{
                if (ServiceType==0) {
                    statval = "Delivered Sucessfully";
                }else{
                    statval = "Pick Up Sucessfully";
                }
            }
            return statval;
         }
         
         public int getTransactions_Id(){
             return Transaction_Id;
         }public int getPaymentStatus(){
             return PaymentStatus;
         }public double getTotalAmount(){
             return Total_Amount;
         }public String getpaymentStatVal(){
             String paymentStatVal;
             if (PaymentStatus==1) {
                paymentStatVal = "Pending";
            }else{
                 paymentStatVal = "Paid";
             }
             return paymentStatVal;
         }
         
             public int getIdInit(){
             return IdInit;
         }
         
         
}