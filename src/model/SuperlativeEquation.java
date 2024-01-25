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
public class SuperlativeEquation {
    protected double a;
    protected double b;
    private static Calculating cal = new Calculating();
    public SuperlativeEquation() {
    }

    public SuperlativeEquation(double a, double b) {
        this.a = a;
        this.b = b;
    }

    public double getA() {
        return a;
    }

    public double getB() {
        return b;
    }

    public void setA(double a) {
        this.a = a;
    }

    public void setB(double b) {
        this.b = b;
    }

    @Override
    public String toString() {
        if (a!=0) {
            return "Solution: x = " + cal.getX(a,b);
        } else if (a==0 && b!= 0){
            return "There is no solution!";
        } else return "The equation has infinitely many solutions!";        
    }
    
}
