/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package financeapp;

import javax.swing.table.DefaultTableModel;

/**
 *
 * @author Zack
 */
public class Account {
    private String name;
    DefaultTableModel model;

    Account(String name) {
        this.name = name;
        model = new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "Date", "Type", "Category", "Comments/Payee", "Ammount", "Balance"
            }
        ) {
            Class[] types = new Class [] {
                java.lang.String.class, java.lang.String.class, java.lang.String.class, java.lang.String.class, java.lang.String.class, java.lang.String.class
            };
            boolean[] canEdit = new boolean [] {
                false, false, false, false, false, false
            };

            public Class getColumnClass(int columnIndex) {
                return types [columnIndex];
            }

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        };
    }
    
    @Override
    public String toString(){
        return name;
    }
    
    //Setters
    public void setName(String name){
        this.name = name;
    }
    
    //Getters
    public String getName(){
        return name;
    }
    
}

