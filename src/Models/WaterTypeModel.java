/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Models;

/**
 *
 * @author Tricia Gadiaza
 */
public class WaterTypeModel {
     private int Id;
     private String Name;
    
    public WaterTypeModel(int Id,String Name){
    
        this.Id=Id;
        this.Name=Name;
    
    }
      public int getId(){
        return Id;
    }public String getName(){
        return Name;
    }
}

//Full texts
//Id	
//Name	
//PricePerGallon Descending 1	
//PricePerBottle	