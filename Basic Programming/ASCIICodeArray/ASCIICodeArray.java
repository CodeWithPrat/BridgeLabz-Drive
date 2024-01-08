import java.util.Scanner;

public class ASCIICodeArray {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter a string: ");
        String input = scanner.nextLine();

        // Create an array to store ASCII values
        int[] asciiArray = new int[input.length()];

        // Convert each character to its ASCII value and store in the array
        for (int i = 0; i < input.length(); i++) {
            char currentChar = input.charAt(i);
            int asciiValue = (int) currentChar; // Convert character to ASCII value
            asciiArray[i] = asciiValue; // Store ASCII value in the array
        }

        // Print the ASCII values stored in the array
        System.out.println("ASCII values of each character in the input string:");
        for (int value : asciiArray) {
            System.out.print(value + " ");
        }

        scanner.close();
    }
}
