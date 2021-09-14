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
                 private int Id,Suki;
                 private String Fname,Mname,Lname,Address,Contact_num;
    
        
        public CustomerModel(int Id,String Fname,String Mname,String Lname,String Address,String Contact_num,int Suki){
        this.Id=Id;
        this.Fname=Fname;
        this.Lname=Lname;
        this.Mname=Mname;
        this.Address=Address;
        this.Contact_num=Contact_num;
        this.Suki=Suki;
        
    }
        public int getId(){
        return Id;
    }   public String getLname(){
        return Lname;
    }   public String getFname(){
        return Fname;
    }   public String getMname(){
        return Mname;
    }   public String getAddress(){
        return Address;
    }   public String getContact_num(){
        return Contact_num;
    }   public int Suki(){
        return Suki;
    }
    
}
