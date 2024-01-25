/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package common;

/**
 *
 * @author LAPTOP ACER
 */
public class Check {
    public boolean checkOddNum(double num){
        return ((int)num!=num);
    }
   
    public boolean checkPerfectSquare(double num){
        return (Math.pow((int)Math.sqrt(num), 2) == num );
    }
}
