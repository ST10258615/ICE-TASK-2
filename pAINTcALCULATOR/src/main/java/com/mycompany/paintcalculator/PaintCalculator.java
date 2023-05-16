/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.paintcalculator;

import javax.swing.JOptionPane;

/**
 *
 * @author lab_services_student
 */
public class PaintCalculator {

    public static void main(String[] args) {
        double length = Double.parseDouble(JOptionPane.showInputDialog("Please enter the length of the room"));
        double height = Double.parseDouble(JOptionPane.showInputDialog("Please enter the height of the room"));
        double width = Double.parseDouble(JOptionPane.showInputDialog("Please enter the width of the room"));
        
        JOptionPane.showMessageDialog(null, "Final Price:   "+ Area(length, height, width));
    }
    
    private static double Area(double l, double h, double w)
        {
            double area = w*l*h;
            double gallons = Gallons(area);
            System.out.println("Gallons needed:\t" + gallons);
            double price = gallons*32;
            price = Math.round(price*100.0)/100.0;
            return price;
        }
    private static double Gallons(double a)
    {
        double gallons = a/350;
        return gallons;
    }
}
