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
     private double PricePerGallon,PricePerBottle;
     private String Name;
    
    public WaterTypeModel(int Id,String Name,double PricePerGallon, double PricePerBottle){
    
        this.Id=Id;
        this.Name=Name;
        this.PricePerGallon=PricePerGallon;
        this.PricePerBottle=PricePerBottle;
    
    }
      public int getId(){
        return Id;
    }public String getName(){
        return Name;
    }public double getPricePerGallon(){
        return PricePerGallon;
    }public double getPricePerBottle(){
        return PricePerBottle;
    }
}

//Full texts
//Id	
//Name	
//PricePerGallon Descending 1	
//PricePerBottle	