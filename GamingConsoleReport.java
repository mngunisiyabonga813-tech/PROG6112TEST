/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.gamingconsolereport;

/**
 *
 * @author Student
 */
public class GamingConsoleReport {

    public static void main(String[] args) {
        System.out.println("-----------------------------------------------------------------------------");
        System.out.println("GAMING CONSOLE REPORT");
        System.out.println("-----------------------------------------------------------------------------");
        
    String[] categories = {"CAPE TOWN", "PORT ELIZABETH", "PRETORIA"};
    String[] headers = {"PS5", "XBOX", "SWITCH"};
    
    int[][] value = {
        {1000, 2000, 3000},
        {2000, 3000, 4000},
        {1500, 1100, 1200}
    };       
    System.out.printf("%-15s","");
    for (String header : headers) {
        System.out.printf("%12s", header);
    }
    
    System.out.println();
    System.out.println("-----------------------------------------------------------------------------");
    
    for (int i = 0; i < categories.length; i++){
       System.out.printf("%15s", categories[i]);
       for (int j = 0; j < value[i].length; j++) {
          System.out.printf("%12d", value[i][j]);
       }
        System.out.println();       
    }
    System.out.println("-----------------------------------------------------------------------------");
        System.out.println("CONSOLE SALES TOTALS FOR EACH CITY");
        System.out.println("-----------------------------------------------------------------------------");
   
     String[] categories2 = {"Value"};
       int[][] headers2 = {
           {6000},
           {9000},
           {3800}
       };
    }
     System.out.println("-----------------------------------------------------------------------------");
     
    System.out.printf("%-15s","");
     for (String header : headers2) {
        System.out.printf("%12s", header);
     
     for (int i = 0; i < categories.length; i++){
       System.out.printf("%15s", categories[i]);
       for (int j = 0; j < value[i].length; j++) {
          System.out.printf("%12d", value[i][j]);
       }
        System.out.println();       
    }
   }
}
