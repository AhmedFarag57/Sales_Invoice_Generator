/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package com.model;


import java.io.File;
import java.io.FileFilter;
import java.io.FileInputStream;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Date;
import java.util.Iterator;
import javax.swing.JFileChooser;
import javax.swing.filechooser.FileNameExtensionFilter;
import org.apache.poi.ss.usermodel.Cell;
import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;


/**
 *
 * @author ArFz
 */
public class FileOperations {
    
    // This path for test the Excel sheet & read it & print it
    // This file uploaded with the source code .. 
    // Put the file anywhere you want & change the path var here to the real path
    private static final String InvoiceHeaderPath = "";
    private static final String InvoiceLinePath = "C:/Users/ArFz/Documents/InvoiceLine.xlsx";
    
    
    
    
    public static void main(String[] args) {
        
        
        ArrayList<InvoiceHeader> temp = readFile();
        
        for(int i = 0 ; i <  temp.size() ; i++) {
            
            System.out.println("Invoice #" + temp.get(i).getInvoiceNum() + "\n{");
            System.out.println("Invoice Date " + temp.get(i).getInvoiceDate() +", Customer Name : " + temp.get(i).getCustomerName());
            
            /*for(int j = 0 ; j < 10 ; j++) {
                System.out.println("Item1Name, Item1Price, Count1");
            }*/
            
            System.out.println("}\n\n");
        }
        
        
        
        System.out.println("Done");
        
    }
    
    
    public static ArrayList<InvoiceHeader> readFile() {
        
        ArrayList<InvoiceHeader> invoiceHeader = new ArrayList<InvoiceHeader>();
        
        
        JFileChooser openFileChooser = new JFileChooser();
        openFileChooser.setDialogTitle("Open File");
        openFileChooser.removeChoosableFileFilter(openFileChooser.getFileFilter());
        FileNameExtensionFilter filter = new FileNameExtensionFilter("Excel Files", "xlsx");
        openFileChooser.setFileFilter(filter);
        
        
        if(openFileChooser.showOpenDialog(null) == JFileChooser.APPROVE_OPTION) {
            File inputFile = openFileChooser.getSelectedFile();
            
            try(FileInputStream in = new FileInputStream(inputFile)){
                
                XSSFWorkbook importedfile = new XSSFWorkbook(in);
                XSSFSheet sheet = importedfile.getSheetAt(0);
                
                
                Iterator<Row> rowIterator = sheet.iterator();
                
                while(rowIterator.hasNext()){
                    
                    int number = 0;
                    Date date = null;
                    String name = "";
                    
                    Row row = rowIterator.next();
                    Iterator<Cell> cellIterator = row.cellIterator();
                    
                    while(cellIterator.hasNext()){
                        
                        Cell cell = cellIterator.next();
                        
                        if(cell.getColumnIndex() == 0){
                            number = (int) cell.getNumericCellValue();
                        }
                        else if(cell.getColumnIndex() == 1){
                            date = cell.getDateCellValue();
                        }
                        else if(cell.getColumnIndex() == 2){
                            name = cell.getStringCellValue();
                        }
                    }
                    
                    invoiceHeader.add(new InvoiceHeader(number, date, name));

                }
                
                in.close();
                
                
            }catch(Exception e){
                e.printStackTrace();
            }
        }
        
        
        return invoiceHeader;
    }
    
    
    
    public void writeFile(ArrayList<InvoiceHeader> invoiceHeader) {
        

    }
    
}
