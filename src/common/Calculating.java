/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package common;

/**
 *
 * @author LAPTOP ACER
 */
public class Calculating {
    public double getX(double a, double b){
         return -b/a;
    }
     public double[] getSolution(double a, double b, double delta){
        double[] x = new double[2];
        x[0] = (-b - Math.sqrt(delta))/(2*a);
        x[1] = (-b + Math.sqrt(delta))/(2*a);
        return x;
    }
}
