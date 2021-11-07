/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Controllers;

import java.text.DateFormat;
import java.text.SimpleDateFormat;
import javax.swing.JOptionPane;

/**
 *
 * @author CALUAG FAMILY
 */
public class PublicFunctions {
    
    public String toUpperCase1stLetter(String word){
        String firstLetter = word.substring(0, 1);
        String remainingLetters = word.substring(1, word.length());
        firstLetter = firstLetter.toUpperCase();
        word = firstLetter + remainingLetters;
        return word;
    }
    
    public void formatDate(){
         DateFormat df = new SimpleDateFormat("yyyy-MM-dd");
     }
}
