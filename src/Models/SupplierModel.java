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
public class SupplierModel {
        private int ID;
        private String Fname,Mname,Lname,Company_name,Company_Address,Contact;
    
        
        public SupplierModel(int ID,String Fname,String Mname,String Lname,String Company_name,String Company_Address,String Contact){
        this.ID=ID;
        this.Fname=Fname;
        this.Lname=Lname;
        this.Mname=Mname;
        this.Company_name=Company_name;
        this.Company_Address=Company_Address;
        this.Contact=Contact;
    }
        public int getID(){
        return ID;
    }   public String getLname(){
        return Lname;
    }   public String getFname(){
        return Fname;
    }   public String getMname(){
        return Mname;
    }   public String getCompany_name(){
        return Company_name;
    }   public String getCompany_Address(){
        return Company_Address;
    }   public String getContact(){
        return Contact;
    }   public String getFullname(){
         String fullname = Fname + " " + Mname + " " + Lname;
         return fullname;
    }
    
}
