package Controllers;


import java.awt.Component;
import javax.swing.JTable;
import javax.swing.table.TableCellRenderer;
import javax.swing.table.TableColumn;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author KevinCaluag
 */
public class CellRenderer implements TableCellRenderer {
    JTable TableToRender;
    
    public CellRenderer(JTable TableToRender){
        this.TableToRender = TableToRender;
    }
 
        @Override
        public Component getTableCellRendererComponent(JTable table,
                Object value,
                boolean isSelected,
                boolean hasFocus,
                int row,
                int column) {
 
            TableColumn tb = TableToRender.getColumnModel().getColumn(2);
            tb.setMaxWidth(60);
            tb.setMinWidth(60);
 
            TableToRender.setRowHeight(60);
 
            return (Component) value;
        }
 
    }
