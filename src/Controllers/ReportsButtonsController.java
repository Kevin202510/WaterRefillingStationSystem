/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Controllers;

import Views.BARGLogs;
import Views.SalesReport;
import Views.TransactionLogs;
import javax.swing.JButton;
import javax.swing.JPanel;

/**
 *
 * @author KevinCaluag
 */
public class ReportsButtonsController {
    JPanel lalagyananReportspanel;
    
    public ReportsButtonsController(JPanel lalagyananReportspanel){
        this.lalagyananReportspanel = lalagyananReportspanel;
    }
    
   public void SalesReport(JButton salesReport){
        new ContainerController(lalagyananReportspanel,new SalesReport(lalagyananReportspanel));
    }
   public void TransactionLogsReport(JButton tlReport){
        new ContainerController(lalagyananReportspanel,new TransactionLogs(lalagyananReportspanel));
    }
   public void BorrowAndReturnGallonLogsReport(JButton brReport){
        new ContainerController(lalagyananReportspanel,new BARGLogs(lalagyananReportspanel));
    }
}
