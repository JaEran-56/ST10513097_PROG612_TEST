/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.runapplication;

/**
 *
 * @author Student
 */
//Cosolesales class that extends the Console class
public class ConsoleSales extends Console {

    public ConsoleSales(String consoleType, String storeName, int totalSales) {
        super(consoleType, storeName, totalSales);
    }    

    @Override
    public String getStore() {
        if (storeName == null) {
            System.out.println("Please enter the store name.");
        } else {
            System.out.println("Enter the store: " + getStoreName());
        }
        return null;
    }

    @Override
    public int getTotalsales() {
        System.out.println("Enter total sales: ");
        return 0;
    }
    
    public void printReport() {
        System.out.println("Enter console type: " + getConsoleType());
        System.out.println("Enter store name: " + getStoreName());
        System.out.println("Enter total sales for the store: " + getTotalSales());
    }
}
