/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package com.model;

import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Date;

/**
 *
 * @author ArFz
 */
public class InvoiceHeader {
    
    
    private int invoiceNum;
    private String invoiceDate;
    private String customerName;
    private ArrayList<InvoiceLine> InvoiceLines;

    public InvoiceHeader(int invoiceNum, Date invoiceDate, String customerName, ArrayList<InvoiceLine> InvoiceLines) {
        String pattern = "dd/MM/YYYY";
        SimpleDateFormat simpleDateFormat = new SimpleDateFormat(pattern);
        
        this.invoiceNum = invoiceNum;
        this.invoiceDate = simpleDateFormat.format(invoiceDate);
        this.customerName = customerName;
        this.InvoiceLines = InvoiceLines;
    }
    
    public InvoiceHeader(int invoiceNum, Date invoiceDate, String customerName) {
        String pattern = "dd/MM/YYYY";
        SimpleDateFormat simpleDateFormat = new SimpleDateFormat(pattern);
        
        this.invoiceNum = invoiceNum;
        this.invoiceDate = simpleDateFormat.format(invoiceDate);
        this.customerName = customerName;
        this.InvoiceLines = new ArrayList<InvoiceLine>();
    }
    
    public InvoiceHeader(int invoiceNum, String invoiceDate, String customerName) {
        this.invoiceNum = invoiceNum;
        this.invoiceDate = invoiceDate;
        this.customerName = customerName;
        this.InvoiceLines = new ArrayList<InvoiceLine>();
    }
    
    public int getInvoiceNum() {
        return invoiceNum;
    }

    public void setInvoiceNum(int invoiceNum) {
        this.invoiceNum = invoiceNum;
    }

    public String getInvoiceDate() {
        return invoiceDate;
    }

    public void setInvoiceDate(String invoiceDate) {
        this.invoiceDate = invoiceDate;
    }

    public String getCustomerName() {
        return customerName;
    }

    public void setCustomerName(String customerName) {
        this.customerName = customerName;
    }

    public ArrayList<InvoiceLine> getInvoiceLines() {
        return InvoiceLines;
    }

    public void setInvoiceLines(ArrayList<InvoiceLine> InvoiceLines) {
        this.InvoiceLines.addAll(InvoiceLines);
    } 
    
}
