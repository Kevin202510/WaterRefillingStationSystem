/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Controllers;

import Views.Authentication.Authentication;
import Views.Authentication.OwnerCredentials.OwnerCredentials;
import java.awt.HeadlessException;
import java.io.BufferedReader;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JFrame;
import javax.swing.JOptionPane;

/**
 *
 * @author KevinCaluag
 */
public class SystemInformationSetupController {
    
    String path = System.getProperty("user.dir");
    
    private void createFile(){
        try {
            File filetocreate = new File(path + "/SystemInformationSetup.txt");
            filetocreate.createNewFile();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
    
    public void checkSystemInformationSetupFile(){
        File file = new File(path + "/SystemInformationSetup.txt");
        if(file.exists()){
            new Authentication().setVisible(true);
        }else{
            new OwnerCredentials().setVisible(true);
        }
    }
    
     public String readFileContent(){
        File file = new File(path + "/SystemInformationSetup.txt");
        FileInputStream fileToRead = null;
        try {
            fileToRead = new FileInputStream(file);
        } catch (FileNotFoundException ex) {
            Logger.getLogger(SystemInformationSetupController.class.getName()).log(Level.SEVERE, null, ex);
        }
        BufferedReader reader = new BufferedReader(new InputStreamReader(fileToRead));
        String content="";
        String contents="";
        try {
            while ((contents = reader.readLine()) != null)  {
                content = contents;
                break;
            }
        } catch (HeadlessException | IOException e) {
            JOptionPane.showMessageDialog(null,e);
        }
        return content;
    }
    
    public void insertSystemInformationSetup(JFrame auth,String systemName,String Address,String Contact,String OwnerName){
        FileWriter fwrite;
        FileInputStream fileToRead;
        
        try {
            createFile();
            fwrite = new FileWriter (path + "/SystemInformationSetup.txt");
            fwrite.append(systemName + "\n");
            fwrite.append(Address + "\n");
            fwrite.append(Contact + "\n");
            fwrite.append(OwnerName + "\n");
            fwrite.close();
            auth.dispose();
            new Authentication().setVisible(true);
        }catch (IOException ex) {
            JOptionPane.showMessageDialog(null,ex);
        }
    }
    
    public static void main(String[] args) {
        SystemInformationSetupController sisc = new SystemInformationSetupController();
        sisc.checkSystemInformationSetupFile();
    }
    
}
