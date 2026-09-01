/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.markcalculator;

/**
 *
 * @author Student
 */

//This contains a method that calculates the average of two student marks.
public class MarkCalculator {
    
   //This method receives two integer marks.
    
    public int calculateTotal(int markOne, int markTwo) {
        int total = markOne + markTwo;
        return total;
    }
   //It calculates and returns their average.
   public double calculateAverage(int markOne, int markTwo)
   {
       //Adds two marks together
       int total = markOne + markTwo;
       
       //Divides the total by 2.0
       double average = total/2.0;
       
       //Returns the average
       return average;
   }
}
       
              

