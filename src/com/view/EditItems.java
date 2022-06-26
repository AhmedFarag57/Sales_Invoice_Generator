/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.view;

import com.model.InvoiceLine;
import java.awt.Toolkit;
import java.awt.event.WindowEvent;
import java.util.ArrayList;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;

/**
 *
 * @author ArFz
 */
public class EditItems extends javax.swing.JFrame {

    AddItem addItemFrame;
    static ArrayList<InvoiceLine> invoiceLine;
    static int index;
    DefaultTableModel modelinvoiceItem;

    /**
     * Creates new form EditItems
     */
    public EditItems() {
        initComponents();

        addItemFrame = new AddItem();
        invoiceLine = new ArrayList<InvoiceLine>();
        modelinvoiceItem = (DefaultTableModel) invoiceItem.getModel();
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        edit_items_lable = new javax.swing.JLabel();
        jPanel1 = new javax.swing.JPanel();
        jScrollPane1 = new javax.swing.JScrollPane();
        invoiceItem = new javax.swing.JTable();
        save_btn = new javax.swing.JButton();
        cancle_btn = new javax.swing.JButton();
        add_item_btn = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);
        setTitle("Edit Items");
        setResizable(false);

        edit_items_lable.setFont(new java.awt.Font("Verdana Pro Cond Semibold", 0, 18)); // NOI18N
        edit_items_lable.setText("Invoice Items");

        invoiceItem.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "No.", "Item Name", "Item Price", "Quantity"
            }
        ) {
            boolean[] canEdit = new boolean [] {
                false, true, true, true
            };

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        jScrollPane1.setViewportView(invoiceItem);
        if (invoiceItem.getColumnModel().getColumnCount() > 0) {
            invoiceItem.getColumnModel().getColumn(0).setPreferredWidth(5);
            invoiceItem.getColumnModel().getColumn(1).setPreferredWidth(150);
        }

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jScrollPane1)
                .addContainerGap())
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 224, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        save_btn.setText("Save");
        save_btn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                save_btnActionPerformed(evt);
            }
        });

        cancle_btn.setText("Cancle");
        cancle_btn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cancle_btnActionPerformed(evt);
            }
        });

        add_item_btn.setText("Add Item");
        add_item_btn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                add_item_btnActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(edit_items_lable, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addContainerGap())
            .addGroup(layout.createSequentialGroup()
                .addGap(44, 44, 44)
                .addComponent(save_btn, javax.swing.GroupLayout.PREFERRED_SIZE, 138, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(add_item_btn, javax.swing.GroupLayout.PREFERRED_SIZE, 138, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(cancle_btn, javax.swing.GroupLayout.PREFERRED_SIZE, 138, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(52, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(29, 29, 29)
                .addComponent(edit_items_lable, javax.swing.GroupLayout.PREFERRED_SIZE, 39, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(save_btn, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(cancle_btn, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(add_item_btn, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(30, Short.MAX_VALUE))
        );

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void save_btnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_save_btnActionPerformed

        boolean errorFlag = false;
        String itemName = "";
        float itemPrice = 0;
        int quantity = 0;
        
        ArrayList<InvoiceLine> tempItem = new ArrayList<InvoiceLine>();

        for (int row = 0; row < modelinvoiceItem.getRowCount(); row++) {

            for (int col = 0; col < modelinvoiceItem.getColumnCount(); col++) {

                if (col == 1) {
                    itemName = modelinvoiceItem.getValueAt(row, col).toString();
                } else if (col == 2) {
                    itemPrice = Float.parseFloat(modelinvoiceItem.getValueAt(row, col).toString());
                    if (itemPrice <= 0) {
                        errorFlag = true;
                    }
                } else if (col == 3) {
                    quantity = Integer.parseInt(modelinvoiceItem.getValueAt(row, col).toString());
                    if (quantity <= 0) {
                        errorFlag = true;
                    }
                }

                if (errorFlag) {
                    break;
                }
            }

            if (errorFlag) {
                break;
            }
            
            tempItem.add(new InvoiceLine(index, itemName, itemPrice, quantity));
        }
        
        if(!errorFlag){
            
            
            App.invoiceHeader.get(index).getInvoiceLines().clear();
            
            App.invoiceHeader.get(index).setInvoiceLines(tempItem);
            
            WindowEvent closeWindow = new WindowEvent(this, WindowEvent.WINDOW_CLOSING);
            Toolkit.getDefaultToolkit().getSystemEventQueue().postEvent(closeWindow);
            
            
            
        }
        else{
            JOptionPane.showMessageDialog(null, "You Enter Some invalid data\n\nPlz, check what you type", "Error", JOptionPane.ERROR_MESSAGE);
        }

    }//GEN-LAST:event_save_btnActionPerformed

    private void cancle_btnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cancle_btnActionPerformed

        WindowEvent closeWindow = new WindowEvent(this, WindowEvent.WINDOW_CLOSING);
        Toolkit.getDefaultToolkit().getSystemEventQueue().postEvent(closeWindow);

    }//GEN-LAST:event_cancle_btnActionPerformed

    private void add_item_btnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_add_item_btnActionPerformed

        addItemFrame.setVisible(true);
        
    }//GEN-LAST:event_add_item_btnActionPerformed

    public void setInvoiceLine(ArrayList<InvoiceLine> invoiceLine, int index) {
        this.invoiceLine.addAll(invoiceLine);
        this.index = index;

        int rows = modelinvoiceItem.getRowCount();
        for (int j = rows - 1; j >= 0; j--) {
            modelinvoiceItem.removeRow(j);
        }

        for (int i = 0; i < invoiceLine.size(); i++) {
            modelinvoiceItem.insertRow(modelinvoiceItem.getRowCount(),
                    new Object[]{i + 1,
                        invoiceLine.get(i).getItemName(),
                        invoiceLine.get(i).getItemPrice(),
                        invoiceLine.get(i).getQuantity()});
        }

    }

    /**
     * @param args the command line arguments
     */
    public static void main(String args[]) {
        /* Set the Nimbus look and feel */
        //<editor-fold defaultstate="collapsed" desc=" Look and feel setting code (optional) ">
        /* If Nimbus (introduced in Java SE 6) is not available, stay with the default look and feel.
         * For details see http://download.oracle.com/javase/tutorial/uiswing/lookandfeel/plaf.html 
         */
        try {
            for (javax.swing.UIManager.LookAndFeelInfo info : javax.swing.UIManager.getInstalledLookAndFeels()) {
                if ("Nimbus".equals(info.getName())) {
                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
                    break;
                }
            }
        } catch (ClassNotFoundException ex) {
            java.util.logging.Logger.getLogger(EditItems.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(EditItems.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(EditItems.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(EditItems.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new EditItems().setVisible(true);
            }
        });
        
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton add_item_btn;
    private javax.swing.JButton cancle_btn;
    private javax.swing.JLabel edit_items_lable;
    private javax.swing.JTable invoiceItem;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JButton save_btn;
    // End of variables declaration//GEN-END:variables
}