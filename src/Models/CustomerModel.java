/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Models;

/**
 *
 * @author ChelseaTorressuper
 */
public class CustomerModel {
        private int ID,isSuki;
        private String Fname,Mname,Lname,Address,Contact;
    
        
        public CustomerModel(int ID,String Fname,String Mname,String Lname,String Address,String Contact,int isSuki){
        this.ID=ID;
        this.Fname=Fname;
        this.Lname=Lname;
        this.Mname=Mname;
        this.Address=Address;
        this.Contact=Contact;
        this.isSuki=isSuki;
        
    }
        
        public int getID(){
        return ID;
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
    }
//    }   public String getisBorrowed_Gallons(){
//        if (isBorrowed_Gallons==1){
//            return "Yes";
//        }
//        else{
//            return "No";
//        }
//    }  public int getGallon_ID(){
//        return Gallon_ID;
//    }  public int getGallon_Quantity(){
//        return Gallon_Quantity;
    public String getisSuki(){
        if (isSuki==1){
            return "Is Suki";
        }
        else{
            return "Not Suki";
        }
    } public String getFullname(){
        String fullname = Fname + " " + Mname + " " + Lname;
        return fullname;
    }public int getSuki(){
       return isSuki;
     }
     
    
}
        
