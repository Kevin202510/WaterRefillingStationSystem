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
public class PromosModel {
    private int Id;
    private String Name,Description,Date_Started,Date_End;
    
    public PromosModel(int Id,String Name,String Description,String Date_Started,String Date_End){
        this.Id = Id;
        this.Name = Name;
        this.Description = Description;
        this.Date_Started = Date_Started;
        this.Date_End = Date_End;
    
    }
    public int getId(){
        return Id;
    } public String getName(){
        return Name;
    } public String getDescription(){
        return Description;
    } public String getDate_Started(){
        return Date_Started;
    } public String getDate_End(){
        return Date_End;
    }
    
}
