Write a program “PrintFriendsNames” that takes 3 friends’ names as input
arguments and prints out “Hi” to these friends in the reverse of the order given. It
also adds “and “ before the last name.
For example:
Input Arguments : Mahesh, Suresh, Devesh
Output : “Hi Devesh, Suresh and Mahesh”
# Printing Friends' Names in Java

This program takes three friends' names as input and prints out a greeting to these friends in reverse order, adding "Hi" before the last name.

## Java Code

```java
import java.util.Scanner;

public class PrintFriendsNames {
    // Method to print friends' names in reverse order with proper formatting
    public static void printFriendsNames(String name1, String name2, String name3) {
        // Concatenate the names in reverse order with proper formatting
        String output = String.format("Hi %s, %s and %s", name3, name2, name1);
        System.out.println(output); // Print the formatted output
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in); // Initialize Scanner to take user input

        // Taking input of 3 friends' names
        System.out.print("Enter first friend's name: ");
        String friend1 = scanner.nextLine(); // Read the first friend's name

        System.out.print("Enter second friend's name: ");
        String friend2 = scanner.nextLine(); // Read the second friend's name

        System.out.print("Enter third friend's name: ");
        String friend3 = scanner.nextLine(); // Read the third friend's name

        // Call the function with the provided names
        printFriendsNames(friend1, friend2, friend3); // Call the method to print formatted names

        scanner.close(); // Close the Scanner to release system resources
    }
}
