### Write a program to where it takes 10 integer numbers from a user, puts them in an array and then through Bubble sort, sorts this array. Input taking and forming an array should be one method and sorting should be other method.
```java
import java.util.Scanner;

public class BubbleSortExample {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Taking input and forming an array
        int[] array = getInputArray(scanner);

        // Sorting the array using Bubble Sort
        bubbleSort(array);

        // Displaying the sorted array
        System.out.println("Sorted Array:");
        displayArray(array);

        scanner.close();
    }

    // Method to take input and form an array
    public static int[] getInputArray(Scanner scanner) {
        int[] inputArray = new int[10];
        System.out.println("Enter 10 integer numbers:");

        for (int i = 0; i < 10; i++) {
            inputArray[i] = scanner.nextInt();
        }
        return inputArray;
    }

    // Method to perform Bubble Sort on the array
    public static void bubbleSort(int[] array) {
        int n = array.length;
        for (int i = 0; i < n - 1; i++) {
            for (int j = 0; j < n - i - 1; j++) {
                if (array[j] > array[j + 1]) {
                    // Swap elements if they are in the wrong order
                    int temp = array[j];
                    array[j] = array[j + 1];
                    array[j + 1] = temp;
                }
            }
        }
    }

    // Method to display the array elements
    public static void displayArray(int[] array) {
        for (int value : array) {
            System.out.print(value + " ");
        }
        System.out.println();
    }
}

```
