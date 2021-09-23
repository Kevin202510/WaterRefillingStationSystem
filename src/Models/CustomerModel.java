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
public class CustomerModel {
                 private int Id,isSuki,Gallon_Id,Gallon_Quantity,isBorrowed_Gallons;
                 private String Fname,Mname,Lname,Address,Contact;
    
        
        public CustomerModel(int Id,String Fname,String Mname,String Lname,String Address,String Contact,int isBorrowed_Gallons,int Gallon_Id,int Gallon_Quantity,int isSuki){
        this.Id=Id;
        this.Fname=Fname;
        this.Lname=Lname;
        this.Mname=Mname;
        this.Address=Address;
        this.Contact=Contact;
        this.isBorrowed_Gallons=isBorrowed_Gallons;
        this.Gallon_Id=Gallon_Id;
        this.Gallon_Quantity=Gallon_Quantity;
        this.isSuki=isSuki;
        
    }
        
        public int getId(){
        return Id;
    }   public String getFname(){
        return Fname;
    }   public String getMname(){
        return Mname;
    }   public String getLname(){
        return Lname;
    }   public String getAddress(){
        return Address;
    }   public String getContact(){
        return Contact;
    }   public String getisBorrowed_Gallons(){
        if (isBorrowed_Gallons==1){
            return "true";
        }
        else{
            return "false";
        }
    }  public int getGallon_Id(){
        return Gallon_Id;
    }  public int getGallon_Quantity(){
        return Gallon_Quantity;
    }  public String getisSuki(){
        if (isSuki==1){
            return "true";
        }
        else{
            return "false";
        }
    } public String getFullname(){
        String fullname = Fname + " " + Mname + " " + Lname;
        return fullname;
    }
    
     public int getBorrowed_Gallons(){
       return isBorrowed_Gallons;
     }
     
     public int getSuki(){
       return isSuki;
     }
     
    
}
        
