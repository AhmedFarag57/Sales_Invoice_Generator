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
import javax.swing.JOptionPane;
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
        
        FileOperations fileOpe = new FileOperations();
        
        ArrayList<InvoiceHeader> temp = new ArrayList<InvoiceHeader>();
        
        temp = fileOpe.readFile();
        
        
        if (temp != null){
            for(int i = 0 ; i <  temp.size() ; i++) {

                System.out.println("Invoice #" + temp.get(i).getInvoiceNum() + "\n{");
                System.out.println("Invoice Date : " + temp.get(i).getInvoiceDate() +", Customer Name : " + temp.get(i).getCustomerName());

                for(int j = 0 ; j < temp.get(i).getInvoiceLines().size(); j++) {

                    System.out.print(temp.get(i).getInvoiceLines().get(j).getItemName() + " , ");
                    System.out.print(temp.get(i).getInvoiceLines().get(j).getItemPrice() + " , ");
                    System.out.println(temp.get(i).getInvoiceLines().get(j).getQuantity());
                }

                System.out.println("}\n\n");
            }

            System.out.println("Done");
        }
        else {
            JOptionPane.showMessageDialog(null, "Plz, restart the app and select a right files", "Error", JOptionPane.ERROR_MESSAGE);
        }
        
    }
    
    
    public ArrayList<InvoiceHeader> readFile() {
        
        // ArrayList for invoice header -> customers
        ArrayList<InvoiceHeader> invoiceHeader = new ArrayList<InvoiceHeader>();
        
        // ArrayList for invoice line -> item
        ArrayList<InvoiceLine> invoiceLine = new ArrayList<InvoiceLine>();
        
        
        // for I can choose the file I want to be printed
        JFileChooser openFileChooser = new JFileChooser();
        openFileChooser.setDialogTitle("Open File");
        openFileChooser.removeChoosableFileFilter(openFileChooser.getFileFilter());
        FileNameExtensionFilter filter = new FileNameExtensionFilter("Excel Files", "xlsx");
        openFileChooser.setFileFilter(filter);
        
        // Message to tell the user to choose the "InvoiceLine" file.
        JOptionPane.showMessageDialog(null, "Plz, choose the \"InvoiceLine\".\n(The file that contains the invoice information)\n"
                + "<Invoice number, Item name, the price per unit, quantity>");
        
        File inputFile = null;
        
        
        if(openFileChooser.showOpenDialog(null) == JFileChooser.APPROVE_OPTION) {

            
            inputFile = openFileChooser.getSelectedFile();

            try(FileInputStream ins = new FileInputStream(inputFile)){

                XSSFWorkbook importedfile = new XSSFWorkbook(ins);
                XSSFSheet sheet = importedfile.getSheetAt(0);


                Iterator<Row> rowIterator = sheet.iterator();

                while(rowIterator.hasNext()){

                    int invoiceNumber = 0;
                    int quantity = 0;
                    float price = 0;
                    String itemName = "";

                    Row row = rowIterator.next();
                    Iterator<Cell> cellIterator = row.cellIterator();

                    while(cellIterator.hasNext()){

                        Cell cell = cellIterator.next();

                        if(cell.getColumnIndex() == 0){
                            invoiceNumber = (int) cell.getNumericCellValue();
                        }
                        else if(cell.getColumnIndex() == 1){
                            itemName = cell.getStringCellValue();
                        }
                        else if(cell.getColumnIndex() == 2){
                            price = (float)cell.getNumericCellValue();
                        }
                        else if(cell.getColumnIndex() == 3){
                            quantity = (int)cell.getNumericCellValue();
                        }

                    }

                    invoiceLine.add(new InvoiceLine(invoiceNumber, itemName, price, quantity));

                }

                ins.close();


            }catch(Exception e){
                e.printStackTrace();
            }



            // Message to tell the user to choose the "InvoiceHeader" file.
            JOptionPane.showMessageDialog(null, "Plz, choose the \"InvoiceHeader\".\n(The file that contains the invoice header)\n"
                    + "<Invoice number, Invoice date, Invoice customer>");

            if(openFileChooser.showOpenDialog(null) == JFileChooser.APPROVE_OPTION) {


                inputFile = openFileChooser.getSelectedFile();

                try(FileInputStream ins = new FileInputStream(inputFile)){

                    XSSFWorkbook importedfile = new XSSFWorkbook(ins);
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

                    ins.close();


                }catch(Exception e){
                    e.printStackTrace();
                }
            }
            else {
                return null;
            }

            ArrayList<InvoiceLine> temp = new ArrayList<InvoiceLine>();

            // for insert the invoice line to invoice header
            int counter = 0;
            int numOfLine = 0;
            while(counter < invoiceLine.size()){

                temp.add(invoiceLine.get(counter));

                if((counter+1) == invoiceLine.size() || temp.get(numOfLine).getInvoiceNumber() != invoiceLine.get(counter+1).getInvoiceNumber()){

                    for(int j = 0 ; j < invoiceHeader.size(); j++){

                        if(invoiceHeader.get(j).getInvoiceNum() == temp.get(numOfLine).getInvoiceNumber()){
                            // we found the invoice header and set the invoice line
                            invoiceHeader.get(j).setInvoiceLines(temp);
                            temp.clear();
                            numOfLine = -1;
                            break;
                        }
                    }
                }

                numOfLine++;
                counter++;
            }


            return invoiceHeader;
        }
        
        // if we select a wrong files
        return null;
    }    
    
    public void writeFile(ArrayList<InvoiceHeader> invoiceHeader) {
        

    }
    
}
