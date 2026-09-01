/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/UnitTests/JUnit4TestClass.java to edit this template
 */
package com.mycompany.markcalculator;

//Imports the @Test annotation from JUnit4
//@Test tells JUnit that a method is a unit test
import org.junit.Test;

//Imports the assertEquals method 
//assertEquals compares the expected answer with the actual answer returned by the method 
import static org.junit.Assert.*;

//This class containts the unit tests for the MarkCalculator class.
public class MarkCalculatorTest {
    //Marks the method below as a JUnit test.
    @Test
    public void calculateTotal_WithValidMarks_ReturnsCorrectTotal () {
        MarkCalculator calculator = new MarkCalculator();
        
        int actual = calculator.calculateTotal(40,50);
        
        int expected = 90;
        
        assertEquals(expected, actual);
    }
    @Test
    public void calculateAverage_withValidMarks_returnsAverage () {
        
        //Arrange
        //Create the an object of the class that we want to test.
        MarkCalculator calculator = new MarkCalculator ();
        
        //Act
        //Calls calculatorAverage using 60 and 80
        //The answer returned by the method is a stored in actual.
        double actual = calculator.calculateAverage(40, 50);
        
        //Arrange
        //Stores the answer that we expect the method to produce.
        double expected = 45.0;
        
        //Assert 
        //Compares the expected answer with the actual answer.
        //0.001 is the allowed difference between the two decimal values
        assertEquals(expected,actual, 0.001);
    } //ends the test method 
    
} //ends the MarkCalculatorTest class
    

