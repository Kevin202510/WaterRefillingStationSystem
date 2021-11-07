/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Models;

import Controllers.PublicFunctions;

/**
 *
 * @author ChelseaTorres
 */
public class SupplierModel {
    
    PublicFunctions publicFunction = new PublicFunctions();
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
    }public String getLname(){
        return publicFunction.toUpperCase1stLetter(Lname);
    }public String getFname(){
        return publicFunction.toUpperCase1stLetter(Fname);
    }public String getMname(){
        return publicFunction.toUpperCase1stLetter(Mname);
    }public String getCompany_name(){
        return publicFunction.toUpperCase1stLetter(Company_name);
    }public String getCompany_Address(){
        return publicFunction.toUpperCase1stLetter(Company_Address);
    }public String getContact(){
        return Contact;
    }   
    
//    modify getter()
    
    public String getFullname(){
        String fullname = Fname + " " + Mname + " " + Lname;
        return fullname;
    }
    
}
