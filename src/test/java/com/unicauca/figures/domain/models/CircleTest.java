package com.unicauca.figures.domain.models;

import static org.junit.jupiter.api.Assertions.*;
import org.junit.jupiter.api.Test;

/**
 *
 * @author Libardo
 */
public class CircleTest {

    public CircleTest() {
    }

    /**
     * Test of calculateArea method, of class Circle.
     */
    @Test
    public void testCalculateArea() {
        System.out.println("calculateArea");
        double radius = 1.0;
        Circle circle = new Circle(radius);
        double areaExpected = Math.PI * Math.pow(radius, 2);
        double areaActual = circle.calculateArea();
        assertEquals(areaExpected, areaActual, 0.001);

        radius = 2.7;
        circle.setRadius(radius);
        areaExpected = Math.PI * Math.pow(radius, 2);
        areaActual = circle.calculateArea();
        assertEquals(areaExpected, areaActual, 0.001);
    }

    /**
     * Test of calculatePerimeter method, of class Circle.
     */
    @Test
    public void testCalculatePerimeter() {
        System.out.println("calculatePerimeter");
        double radius = 1.0;
        Circle circle = new Circle(radius);
        double perimeterExpected = 2.0 * Math.PI * radius;
        double perimeterActual = circle.calculatePerimeter();
        assertEquals(perimeterExpected, perimeterActual, 0.001);

        radius = 4.45;
        circle = new Circle(radius);
        perimeterExpected = 2.0 * Math.PI * radius;
        perimeterActual = circle.calculatePerimeter();
        assertEquals(perimeterExpected, perimeterActual, 0.001);

    }

}
