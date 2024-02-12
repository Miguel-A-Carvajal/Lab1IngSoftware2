package com.unicauca.figures.domain.models;

/**
 *
 * @author shadi
 */
public class Rectangle extends Figure{
    private double sidea;
    private double sideb;

    public Rectangle(double sidea, double sideb) {
        this.sidea = sidea;
        this.sideb = sideb;
    }
    public Rectangle() {
        this.sidea = 0;
        this.sideb = 0;
    }

    public double getSidea() {
        return sidea;
    }

    public void setSidea(double sidea) {
        this.sidea = sidea;
    }

    public double getSideb() {
        return sideb;
    }

    public void setSideb(double sideb) {
        this.sideb = sideb;
    }
    
    
    @Override
    public double calculateArea() {
        return sidea*sideb;
    }

    @Override
    public double calculatePerimeter() {
        return (2*sidea)+(2*sideb);
    }
    
}
