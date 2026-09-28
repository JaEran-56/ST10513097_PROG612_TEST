/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.yearlysalesofelectronics;

/**
 *
 * @author Student
 */
import java.util.ArrayList;
import java.util.Scanner;
public class YearlySalesOfElectronics {

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        
        String[] cities = {"CAPE TOWN", "PORT ELIZABETH", "PRETORIA"};
        String[] electronics = {"PS5", "XBOX", "SWITCH"};
        //Two-dimensional arrays
        int[][] sales = {
            {1000, 2000, 3000},
            {2000, 3000, 4000},
            {1500, 1100, 1200},
        };
        //Displaying report
        System.out.println("----------------------------------------------------");
        System.out.println("GAMING CONSOLE REPORT");
        System.out.println("----------------------------------------------------");
        
        //Displaying the information in rows and columns
        System.out.println("\t\tPS5\tXBOX\tSWITCH");
        for (int i = 0; i < sales.length; i++) {
            System.out.print(cities[i] + "\t");
            for (int j = 0; j < sales[i].length; j++) {
                System.out.print(sales[i][j] + "\t");
            }
            System.out.println();
        }
        System.out.println("----------------------------------------------------");
        System.out.println("CONSOLE SALES TOTALS FOR EACH CITY");
        System.out.println("----------------------------------------------------");
        
        int highestSales = 0;
        String highestCity = "";
        
        //Displaying total sales for each city
        int[] totals = new int[cities.length];
        
        for (int row = 0; row < sales.length; row++) {
            int total = 0;
            for (int col = 0; col < sales[row].length; col++) {
                total += sales[row][col];
            }
            
            totals[row] = total;
            System.out.println(cities[row] + "\t" + total);
                
            if (total > highestSales) {
                highestSales = total;
                highestCity = cities[row];
            }
        }
        System.out.println("CITY WITH THE MOST SALES: " + highestCity);
        System.out.println("----------------------------------------------------");
    }
}
