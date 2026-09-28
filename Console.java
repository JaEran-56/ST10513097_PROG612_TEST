/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.runapplication;

/**
 *
 * @author Student
 */
//Public Interface
interface IConsoles {
    String getConsoleType();
    String getStore();
    int getTotalsales();
}
//Abstract class that implements the IConsoles interface
abstract class Console implements IConsoles {
    
    private String consoleType;
    String storeName;
    int totalSales;
    
   //Constructors that accepts the methods as parameters
    public Console(String consoleType, String storeName, int totalSales) {
        
        this.consoleType = consoleType;
        this.storeName = storeName;
        this.totalSales = totalSales;
    }
    
    public String getConsoleType() {
        return consoleType;
    }
    
    public String getStoreName() {
        return storeName;
    }
    
    public int getTotalSales() {
        return totalSales;
    }
    
}
