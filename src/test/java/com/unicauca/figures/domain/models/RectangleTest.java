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
public class RectangleTest {
    
    public RectangleTest() {
    }

    /**
     * Test of calculateArea method, of class Rectangle.
     */
    @org.junit.jupiter.api.Test
    public void testCalculateArea() {
        System.out.println("calculate Area");
        Rectangle instance = new Rectangle(1,2);
        double expResult = 2.0;
        double result = instance.calculateArea();
        assertEquals(expResult, result, 0.01);
        // TODO review the generated test code and remove the default call to fail.
    }

    /**
     * Test of calculatePerimeter method, of class Rectangle.
     */
    @org.junit.jupiter.api.Test
    public void testCalculatePerimeter() {
        System.out.println("calculate Perimeter");
        Rectangle instance = new Rectangle(1,2);
        double expResult = 6.0;
        double result = instance.calculatePerimeter();
        assertEquals(expResult, result, 0.001);
        // TODO review the generated test code and remove the default call to fail.
    }
    
}
