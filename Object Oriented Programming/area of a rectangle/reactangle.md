## Write a program to compute the area of a rectangle by creating a class named 'Rectangle' having two methods. First method named as 'setDim' takes length and breadth of the rectangle as parameters and the second method named as 'getArea' returns the area of the rectangle. Length and breadth of rectangle are entered through the keyboard. Plan creating 2 rectangle objects, provide dimensions of them and then check which one has the higher area.
```java
import java.util.Scanner;

public class Rectangle {
    private double length;
    private double breadth;

    // Method to set the dimensions (length and breadth) of the rectangle
    public void setDim(double length, double breadth) {
        this.length = length;
        this.breadth = breadth;
    }

    // Method to calculate and return the area of the rectangle
    public double getArea() {
        return length * breadth;
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Create two Rectangle objects
        Rectangle rectangle1 = new Rectangle();
        Rectangle rectangle2 = new Rectangle();

        // Input dimensions for the first rectangle
        System.out.println("Enter dimensions for rectangle 1:");
        System.out.print("Length: ");
        double length1 = scanner.nextDouble();
        System.out.print("Breadth: ");
        double breadth1 = scanner.nextDouble();

        // Set dimensions for the first rectangle
        rectangle1.setDim(length1, breadth1);

        // Input dimensions for the second rectangle
        System.out.println("\nEnter dimensions for rectangle 2:");
        System.out.print("Length: ");
        double length2 = scanner.nextDouble();
        System.out.print("Breadth: ");
        double breadth2 = scanner.nextDouble();

        // Set dimensions for the second rectangle
        rectangle2.setDim(length2, breadth2);

        // Calculate areas of both rectangles
        double area1 = rectangle1.getArea();
        double area2 = rectangle2.getArea();

        // Compare areas and display the rectangle with higher area
        if (area1 > area2) {
            System.out.println("\nArea of rectangle 1 is larger: " + area1);
        } else if (area2 > area1) {
            System.out.println("\nArea of rectangle 2 is larger: " + area2);
        } else {
            System.out.println("\nBoth rectangles have equal area: " + area1);
        }

        scanner.close();
    }
}

```
