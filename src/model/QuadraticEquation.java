/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package model;

import common.Calculating;

/**
 *
 * @author LAPTOP ACER
 */
public class QuadraticEquation extends SuperlativeEquation {

    private double c;
    private Calculating cal = new Calculating();

    public QuadraticEquation() {
    }

    public QuadraticEquation(double a, double b, double c) {
        super(a, b);
        this.c = c;
    }

    public double getC() {
        return c;
    }

    public void setC(double c) {
        this.c = c;
    }

    public double getDelta() {
        return Math.pow(b, 2) - 4 * a * c;
    }

    public double[] getSolution() {
        double[] x = new double[2];
        x[0] = (-b - Math.sqrt(getDelta())) / (2 * a);
        x[1] = (-b + Math.sqrt(getDelta())) / (2 * a);
        return x;
    }

    @Override
    public String toString() {
        if (a == 0) {
            if (a != 0) {
                return "Solution: x = " + cal.getX(b, c);
            } else if (a == 0 && b != 0) {
                return "There is no solution!";
            } else {
                return "The equation has infinitely many solutions!";
            }
        } else {
            double cond = getDelta();
            if (cond >= 0) {
                return "Solution: x1 = " + getSolution()[0] + " and x2 = " + getSolution()[1];
            } else {
                return "There is no solution!";
    
            }
        }
    }
}
