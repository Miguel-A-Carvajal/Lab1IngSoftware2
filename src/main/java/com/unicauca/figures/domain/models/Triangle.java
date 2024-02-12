package com.unicauca.figures.domain.models;

import static java.lang.Math.sqrt;

/**
 *
 * @author shadi
 */
public class Triangle extends Figure{
    private double sidea;
    private double sideb;
    private double base;

    public Triangle(double sidea, double sideb, double base) {
        this.sidea = sidea;
        this.sideb = sideb;
        this.base = base;
    }
    public Triangle() {
        this.sidea = 0;
        this.sideb = 0;
        this.base = 0;
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

    public double getBase() {
        return base;
    }

    public void setBase(double base) {
        this.base = base;
    }

    @Override
    public double calculateArea() {
        //s = semierimetro (formula de heron)
        double s = (sidea+sideb+base)/2;
        return sqrt(s*(s-sidea)*(s-sideb)*(s-base));
        //return (base*(sqrt(Math.pow(sidea, 2) - Math.pow(base, 2))))/2;
    }

    @Override
    public double calculatePerimeter() {
        return sidea+sideb+base;
    }
    
}
