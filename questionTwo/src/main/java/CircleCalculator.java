/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

/**
 *
 * @author GLORIA
 */
import java.util.Scanner;
public class CircleCalculator {
    public static void main(String[] args) {
        // Prompt the user to enter the radius
        try (Scanner scanner = new Scanner(System.in)) {
            // Prompt the user to enter the radius
            System.out.print("Enter the radius of the circle: ");
            double radius = scanner.nextDouble();
            // Create a Circle object
            Circle circle = new Circle(radius);
            // Calculate area and circumference
            double area = circle.calculateArea();
            double circumference = circle.calculateCircumference();
            // Display the results
            System.out.printf("Area of the circle: %.2f\n", area);
            System.out.printf("Circumference of the circle: %.2f\n", circumference);
            // Close the scanner
        }
    }
}
    

