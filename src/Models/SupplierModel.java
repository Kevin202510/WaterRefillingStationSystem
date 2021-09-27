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
        private int Id;
        private String Fname,Mname,Lname,Company_name;
    
        
        public SupplierModel(int Id,String Fname,String Mname,String Lname,String Company_name){
        this.Id=Id;
        this.Fname=Fname;
        this.Lname=Lname;
        this.Mname=Mname;
        this.Company_name=Company_name;
        
    }
        public int getId(){
        return Id;
    }   public String getLname(){
        return Lname;
    }   public String getFname(){
        return Fname;
    }   public String getMname(){
        return Mname;
    }   public String getCompany_name(){
        return Company_name;
    }   public String getFullname(){
         String fullname = Fname + " " + Mname + " " + Lname;
         return fullname;
    }
    
}
