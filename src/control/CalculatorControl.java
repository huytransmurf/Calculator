/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package control;

import common.Calculating;
import common.Check;
import common.Library;
import java.util.ArrayList;
import model.QuadraticEquation;
import model.SuperlativeEquation;
import view.Menu;

/**
 *
 * @author LAPTOP ACER
 */
public class CalculatorControl extends Menu<String> {

    private QuadraticEquation qt;
    private SuperlativeEquation st;
    private static Library lib = new Library();
    private static Calculating cal = new Calculating();
    private static Check ch = new Check();
    private static String[] mc = {"Calculate Superlative Equation", "Calculate Quadratic Equation", "Exit"};

    public CalculatorControl() {
        super("Equation Program", mc);
    }

    @Override
    public void execute(int n) {
        switch (n) {
            case 1:
                doSuperlativeEquation();
                break;
            case 2:
                doQuadraticEquation();
                break;
            case 3:
                System.out.println("Exitting...");
                System.exit(0);
        }
    }

    public void doSuperlativeEquation() {
        ArrayList<Double> numbers = new ArrayList<>();
        double a = lib.getDouble("Enter A");
        double b = lib.getDouble("Enter B");
        numbers.add(a);
        numbers.add(b);
        try {
            numbers.add(cal.getX(a, b));
        } catch (ArithmeticException e) {

        }
        st = new SuperlativeEquation(a, b);
        System.out.println(st);
        doCheck(numbers);
    }

    public void doCheck(ArrayList<Double> numbers) {
        System.out.println("Number is odd: ");
        for (Double num : numbers) {
            if (ch.checkOddNum(num)) {
                System.out.print(num + " ");
            }
        }
        System.out.println();
        System.out.println("Number is even: ");
        for (Double num : numbers) {
            if (!ch.checkOddNum(num)) {
                System.out.print(num + " ");
            }
        }
        System.out.println();
        System.out.println("Number is perfect square: ");
        for (Double num : numbers) {
            if (ch.checkPerfectSquare(num)) {
                System.out.print(num + " ");
            }
        }
        System.out.println(1
        );
    }

    public void doQuadraticEquation() {
        ArrayList<Double> numbers = new ArrayList<>();
        double a = lib.getDouble("Enter A");
        double b = lib.getDouble("Enter B");
        double c = lib.getDouble("Enter C");
        numbers.add(a);
        numbers.add(b);
        numbers.add(c);
        qt = new QuadraticEquation(a, b, c);
        System.out.println(qt);
        if (a == 0) {
            try {
                numbers.add(cal.getX(b, c));
            } catch (ArithmeticException e) {

            }
        } else if (qt.getDelta() >= 0) {
            numbers.add(qt.getSolution()[0]);
            numbers.add(qt.getSolution()[1]);
        }
        doCheck(numbers);
    }

    
}
