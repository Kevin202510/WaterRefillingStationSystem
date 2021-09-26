/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Models;

/**
 *
 * @author Kevin Felix Caluag
 */
public class UserModel {
    private int Id,Role_id;
    private String Role_displayname,Fname,Mname,Lname,Address,DOB,Contact,Username,Password,Profile;
    
    public UserModel(int Id,int Role_id,String Profile,String Fname,String Mname,String Lname,String DOB,String Address,String Contact,String Username,String Password){
        this.Id=Id;
        this.Role_id=Role_id;
        this.Fname=Fname;
        this.Mname=Mname;
        this.Lname=Lname;
        this.Address=Address;
        this.DOB=DOB;
        this.Contact=Contact;
        this.Username=Username;
        this.Password=Password; 
        this.Profile=Profile;
    }
    
    public int getId(){
        return Id;
    }public int getRole_id(){
        return Role_id;
    }public String getProfile(){
        if (Profile == null) {
           Profile = "sampleuser.jpg";
        }
        return Profile;
    }public String getFname(){
        return Fname;
    }public String getMname(){
        return Mname;
    }public String getLname(){
        return Lname;
    }public String getAddress(){
        return Address;
    }public String getDOB(){
        return DOB;
    }public String getContact(){
        return Contact;
    }public String getUsername(){
        return Username;
    }public String getPassword(){
        return Password;
    }public String getFullname(){
        String fullname = Fname + " " + Mname + " " + Lname;
        return fullname;
    }
    
    public String getrole_displayname(){
        
        if (Role_id==1) {
            Role_displayname = "Developer";
        }else if(Role_id==2) {
            Role_displayname = "Owner";
        }else{
            Role_displayname = "Employee";
        }
        return Role_displayname;
        
    }
}
