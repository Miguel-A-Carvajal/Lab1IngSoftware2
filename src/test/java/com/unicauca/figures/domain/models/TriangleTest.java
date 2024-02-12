package com.unicauca.figures.domain.models;

import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.AfterAll;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

/**
 *
 * @author shadi
 */
public class TriangleTest {
    
    public TriangleTest() {
    }
    

   

    /**
     * Test of calculateArea method, of class Triangle.
     */
    @Test
    public void testCalculateArea() {
        System.out.println("calculate Area");
        Triangle instance = new Triangle(3,4,5);
        double expResult = 6.0;
        double result = instance.calculateArea();
        assertEquals(expResult, result, 0.01);
    }

    /**
     * Test of calculatePerimeter method, of class Triangle.
     */
    @Test
    public void testCalculatePerimeter() {
        System.out.println("calculatePerimeter");
        Triangle instance = new Triangle(3,4,5);
        double expResult = 12.0;
        double result = instance.calculatePerimeter();
        assertEquals(expResult, result, 0.001);
    }
    
}
