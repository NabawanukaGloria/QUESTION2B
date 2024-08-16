/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

/**
 *
 * @author GLORIA
 */


public class Circle {
   
    private final double radius;
    private final double PI = 22.0 / 7.0; // Using 22/7 for π

    // Constructor to initialize the radius
    public Circle(double radius) {
        this.radius = radius;
    }

    // Method to calculate the area
    public double calculateArea() {
        return PI * radius * radius;
    }

    // Method to calculate the circumference
    public double calculateCircumference() {
        return 2 * PI * radius;
    }
}


    
    

