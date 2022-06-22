/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package com.view;

import java.io.BufferedInputStream;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import javax.swing.JFileChooser;
import javax.swing.JOptionPane;
import javax.swing.filechooser.FileNameExtensionFilter;
import org.apache.poi.xssf.usermodel.XSSFCell;
import org.apache.poi.xssf.usermodel.XSSFRow;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;


/**
 *
 * @author ArFz
 */
public class App extends javax.swing.JFrame {
    
    
    private final JFileChooser fileChooser;

    /**
     * Creates new form main
     */
    public App() {
        initComponents();
        
        fileChooser = new JFileChooser();
        fileChooser.setCurrentDirectory(new File("c:\\temp"));
        fileChooser.setFileFilter(new FileNameExtensionFilter("Excel Files", "xls", "xlsx", "xlsm"));
        fileChooser.setDialogTitle("Select Excel File");
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        jScrollPane1 = new javax.swing.JScrollPane();
        jTable1 = new javax.swing.JTable();
        jPanel2 = new javax.swing.JPanel();
        jScrollPane2 = new javax.swing.JScrollPane();
        jTable2 = new javax.swing.JTable();
        delete_invoice_btn = new javax.swing.JButton();
        create_new_invoice_btn = new javax.swing.JButton();
        invoice_number_lable = new javax.swing.JLabel();
        invoice_date_lable = new javax.swing.JLabel();
        customer_name_lable = new javax.swing.JLabel();
        invoice_total_lable = new javax.swing.JLabel();
        invoice_number = new javax.swing.JLabel();
        invoice_date = new javax.swing.JTextField();
        customer_name = new javax.swing.JTextField();
        invoice_total = new javax.swing.JLabel();
        cancel_btn = new javax.swing.JButton();
        save_btn = new javax.swing.JButton();
        delete_item_btn = new javax.swing.JButton();
        jMenuBar1 = new javax.swing.JMenuBar();
        file_menu = new javax.swing.JMenu();
        load_file_menu_item = new javax.swing.JMenuItem();
        save_file_menu_item = new javax.swing.JMenuItem();
        about_menu = new javax.swing.JMenu();
        instagram = new javax.swing.JMenuItem();
        twitter = new javax.swing.JMenuItem();
        email = new javax.swing.JMenuItem();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("Sales Invoice Generator");
        setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));
        setLocation(new java.awt.Point(0, 0));
        setResizable(false);

        jPanel1.setBorder(javax.swing.BorderFactory.createTitledBorder(""));
        jPanel1.setToolTipText("ahmed");

        jLabel1.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jLabel1.setText("Invoices table");

        jTable1.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
        jTable1.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null}
            },
            new String [] {
                "No.", "Date", "Customer", "Total"
            }
        ));
        jScrollPane1.setViewportView(jTable1);

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                        .addGap(0, 0, Short.MAX_VALUE)
                        .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 418, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap())
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 24, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 361, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        jPanel2.setBorder(javax.swing.BorderFactory.createTitledBorder(null, "Invoice Items", javax.swing.border.TitledBorder.DEFAULT_JUSTIFICATION, javax.swing.border.TitledBorder.DEFAULT_POSITION, new java.awt.Font("Tahoma", 1, 12))); // NOI18N
        jPanel2.setPreferredSize(new java.awt.Dimension(442, 422));

        jTable2.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null, null},
                {null, null, null, null, null},
                {null, null, null, null, null},
                {null, null, null, null, null},
                {null, null, null, null, null},
                {null, null, null, null, null},
                {null, null, null, null, null},
                {null, null, null, null, null},
                {null, null, null, null, null},
                {null, null, null, null, null},
                {null, null, null, null, null},
                {null, null, null, null, null},
                {null, null, null, null, null},
                {null, null, null, null, null}
            },
            new String [] {
                "No.", "Item Name", "Item Price", "Quantity", "Total"
            }
        ));
        jScrollPane2.setViewportView(jTable2);

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jScrollPane2, javax.swing.GroupLayout.DEFAULT_SIZE, 430, Short.MAX_VALUE)
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jScrollPane2, javax.swing.GroupLayout.DEFAULT_SIZE, 252, Short.MAX_VALUE)
        );

        delete_invoice_btn.setText("Delete Invoice");
        delete_invoice_btn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                delete_invoice_btnActionPerformed(evt);
            }
        });

        create_new_invoice_btn.setText("Create New Invoice");
        create_new_invoice_btn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                create_new_invoice_btnActionPerformed(evt);
            }
        });

        invoice_number_lable.setText("Invoice Number");
        invoice_number_lable.setToolTipText("");

        invoice_date_lable.setText("Invoice Date");
        invoice_date_lable.setPreferredSize(new java.awt.Dimension(80, 14));

        customer_name_lable.setText("Customer Name");
        customer_name_lable.setPreferredSize(new java.awt.Dimension(80, 14));

        invoice_total_lable.setText("Invoice Total");
        invoice_total_lable.setPreferredSize(new java.awt.Dimension(80, 14));

        invoice_number.setText("   #");
        invoice_number.setBorder(javax.swing.BorderFactory.createEtchedBorder());

        invoice_date.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                invoice_dateActionPerformed(evt);
            }
        });

        customer_name.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                customer_nameActionPerformed(evt);
            }
        });

        invoice_total.setBorder(javax.swing.BorderFactory.createEtchedBorder());

        cancel_btn.setText("Cancel");
        cancel_btn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cancel_btnActionPerformed(evt);
            }
        });

        save_btn.setText("Save");
        save_btn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                save_btnActionPerformed(evt);
            }
        });

        delete_item_btn.setText("Delete Item");
        delete_item_btn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                delete_item_btnActionPerformed(evt);
            }
        });

        jMenuBar1.setPreferredSize(new java.awt.Dimension(56, 30));

        file_menu.setText("File");
        file_menu.setPreferredSize(new java.awt.Dimension(40, 19));

        load_file_menu_item.setText("Load File");
        load_file_menu_item.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                load_file_menu_itemActionPerformed(evt);
            }
        });
        file_menu.add(load_file_menu_item);

        save_file_menu_item.setText("Save File");
        save_file_menu_item.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                save_file_menu_itemActionPerformed(evt);
            }
        });
        file_menu.add(save_file_menu_item);

        jMenuBar1.add(file_menu);

        about_menu.setText("About");

        instagram.setText("Instgram");
        instagram.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                instagramActionPerformed(evt);
            }
        });
        about_menu.add(instagram);

        twitter.setText("Twitter");
        twitter.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                twitterActionPerformed(evt);
            }
        });
        about_menu.add(twitter);

        email.setText("Email");
        email.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                emailActionPerformed(evt);
            }
        });
        about_menu.add(email);

        jMenuBar1.add(about_menu);

        setJMenuBar(jMenuBar1);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addContainerGap()
                        .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(56, 56, 56)
                        .addComponent(create_new_invoice_btn)
                        .addGap(80, 80, 80)
                        .addComponent(delete_invoice_btn, javax.swing.GroupLayout.PREFERRED_SIZE, 127, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(save_btn, javax.swing.GroupLayout.PREFERRED_SIZE, 127, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(delete_item_btn, javax.swing.GroupLayout.PREFERRED_SIZE, 127, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(26, 26, 26)
                        .addComponent(cancel_btn, javax.swing.GroupLayout.PREFERRED_SIZE, 127, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(invoice_number_lable, javax.swing.GroupLayout.PREFERRED_SIZE, 100, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(invoice_number, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(jPanel2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(invoice_total_lable, javax.swing.GroupLayout.PREFERRED_SIZE, 100, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(invoice_total, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                            .addGroup(layout.createSequentialGroup()
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(invoice_date_lable, javax.swing.GroupLayout.PREFERRED_SIZE, 100, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(customer_name_lable, javax.swing.GroupLayout.PREFERRED_SIZE, 100, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addGap(6, 6, 6)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(invoice_date)
                                    .addComponent(customer_name))))
                        .addGap(0, 0, Short.MAX_VALUE)))
                .addContainerGap())
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(invoice_number_lable, javax.swing.GroupLayout.PREFERRED_SIZE, 28, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(invoice_number, javax.swing.GroupLayout.PREFERRED_SIZE, 28, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(invoice_date_lable, javax.swing.GroupLayout.PREFERRED_SIZE, 28, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(invoice_date, javax.swing.GroupLayout.PREFERRED_SIZE, 28, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(customer_name_lable, javax.swing.GroupLayout.PREFERRED_SIZE, 28, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(customer_name, javax.swing.GroupLayout.PREFERRED_SIZE, 28, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(invoice_total_lable, javax.swing.GroupLayout.PREFERRED_SIZE, 28, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(invoice_total, javax.swing.GroupLayout.PREFERRED_SIZE, 28, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(18, 18, 18)
                        .addComponent(jPanel2, javax.swing.GroupLayout.PREFERRED_SIZE, 276, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(20, 20, 20)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(delete_invoice_btn, javax.swing.GroupLayout.PREFERRED_SIZE, 31, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(create_new_invoice_btn, javax.swing.GroupLayout.PREFERRED_SIZE, 31, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(cancel_btn, javax.swing.GroupLayout.PREFERRED_SIZE, 31, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(save_btn, javax.swing.GroupLayout.PREFERRED_SIZE, 31, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(delete_item_btn, javax.swing.GroupLayout.PREFERRED_SIZE, 31, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(60, Short.MAX_VALUE))
        );

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void load_file_menu_itemActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_load_file_menu_itemActionPerformed
        
        // to show the dialog to select files
        int hasFile = fileChooser.showOpenDialog(this);
        
        // to check if select file or not
        if(hasFile == JFileChooser.APPROVE_OPTION) {
            
            // var to hold the excel file if it's exist
            File excelFile;
            FileInputStream excelFIS = null;
            BufferedInputStream excelBIS= null;
            XSSFWorkbook excelJTable = null;
            
            
            try {
                
                excelFile = fileChooser.getSelectedFile();
                excelFIS = new FileInputStream(excelFile);
                excelBIS = new BufferedInputStream(excelFIS);
                excelJTable = new XSSFWorkbook(excelBIS);
                
                XSSFSheet excelSheet = excelJTable.getSheetAt(0);
                
                for(int row = 0 ; row < excelSheet.getLastRowNum() ; row++) {
                    
                    XSSFRow excelRow = excelSheet.getRow(row);
                    
                    for(int col = 0 ; col < excelRow.getLastCellNum() ; col++) {
                        
                        XSSFCell excelCell = excelRow.getCell(col);
                        System.out.print(" " + excelCell + " ");
                    }
                }
                
            }catch(FileNotFoundException e) {
                JOptionPane.showMessageDialog(null, "File Not Found");
            }catch(IOException e) {
                JOptionPane.showMessageDialog(null, e.getMessage());
            } finally {
                
                try {
                    if(excelFIS != null) {
                        excelFIS.close();
                    }
                    if(excelBIS != null) {
                        excelBIS.close();
                    }
                    if(excelJTable != null) {
                        excelJTable.close();
                    }
                } catch(Exception e) {
                    e.printStackTrace();
                }
                
            }
        
        
        } else {
            JOptionPane.showMessageDialog(null, "File Not Selected");
        }
        
        
    }//GEN-LAST:event_load_file_menu_itemActionPerformed

    private void create_new_invoice_btnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_create_new_invoice_btnActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_create_new_invoice_btnActionPerformed

    private void save_btnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_save_btnActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_save_btnActionPerformed

    private void delete_item_btnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_delete_item_btnActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_delete_item_btnActionPerformed

    private void cancel_btnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cancel_btnActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_cancel_btnActionPerformed

    private void delete_invoice_btnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_delete_invoice_btnActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_delete_invoice_btnActionPerformed

    private void save_file_menu_itemActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_save_file_menu_itemActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_save_file_menu_itemActionPerformed

    private void invoice_dateActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_invoice_dateActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_invoice_dateActionPerformed

    private void customer_nameActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_customer_nameActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_customer_nameActionPerformed

    private void instagramActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_instagramActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_instagramActionPerformed

    private void twitterActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_twitterActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_twitterActionPerformed

    private void emailActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_emailActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_emailActionPerformed

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
            java.util.logging.Logger.getLogger(App.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(App.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(App.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(App.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new App().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JMenu about_menu;
    private javax.swing.JButton cancel_btn;
    private javax.swing.JButton create_new_invoice_btn;
    private javax.swing.JTextField customer_name;
    private javax.swing.JLabel customer_name_lable;
    private javax.swing.JButton delete_invoice_btn;
    private javax.swing.JButton delete_item_btn;
    private javax.swing.JMenuItem email;
    private javax.swing.JMenu file_menu;
    private javax.swing.JMenuItem instagram;
    private javax.swing.JTextField invoice_date;
    private javax.swing.JLabel invoice_date_lable;
    private javax.swing.JLabel invoice_number;
    private javax.swing.JLabel invoice_number_lable;
    private javax.swing.JLabel invoice_total;
    private javax.swing.JLabel invoice_total_lable;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JMenuBar jMenuBar1;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JTable jTable1;
    private javax.swing.JTable jTable2;
    private javax.swing.JMenuItem load_file_menu_item;
    private javax.swing.JButton save_btn;
    private javax.swing.JMenuItem save_file_menu_item;
    private javax.swing.JMenuItem twitter;
    // End of variables declaration//GEN-END:variables
}
