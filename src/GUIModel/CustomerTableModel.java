/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package GUIModel;

/**
 *
 * @author Agani's Gaming PC
 */

import BLL.Customer;
import java.util.List;
import javax.swing.table.AbstractTableModel;
        
public class CustomerTableModel extends AbstractTableModel {

    List  <Customer> list;
    String[] cols = {"Nr." , "Emertimi"};
    
    public CustomerTableModel(){}
    
    public CustomerTableModel(List<Customer> list){
        this.list =list;
    }
    public void addList(List<Customer>list){
         this.list =list;
    }
      @Override
    public String getColumnName (int col){
        return cols[col];
    }
    @Override
    public int getRowCount(){
       return list.size();
       
    }
    public void remove(int row){
        list.remove(row);
    }
    
    public Customer getCustomer (int index){
            return list.get(index);
    }
    
    @Override
    public int getColumnCount() {
        return cols.length;
        
    }

    @Override
    public Object getValueAt(int rowIndex, int columnIndex) {
        Customer p=list.get(rowIndex);
        switch(columnIndex){
            case 0:
                return p.getId();
            case 1:
                return p.getEmertimi();
            default:
                return null;
        }
    }
    
}
