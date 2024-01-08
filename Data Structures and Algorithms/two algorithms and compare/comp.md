## Write a program to sort data using two algorithms and compare the performance.
- a. Generate 100,000 random floating point numbers 1.0 to 100.0 Keep these numbers in an array.
- b. Sort this array using Selection Sort and
- c. Sort with Quick Sort.
- d. Compute the time of execution for both the algorithms in mili-seconds.
- e. Check which one is faster and by what percentage?
- f. Number generation, Sorting algos and performance comparisons should be different methods.

```java
import java.util.Arrays;
import java.util.Random;

public class SortingComparison {
    public static void main(String[] args) {
        int size = 100000;
        double[] numbers = generateRandomNumbers(size);

        double[] selectionSortArray = numbers.clone();
        double[] quickSortArray = numbers.clone();

        // Perform Selection Sort and calculate execution time
        long startTimeSelectionSort = System.currentTimeMillis();
        selectionSort(selectionSortArray);
        long endTimeSelectionSort = System.currentTimeMillis();
        long executionTimeSelectionSort = endTimeSelectionSort - startTimeSelectionSort;

        // Perform Quick Sort and calculate execution time
        long startTimeQuickSort = System.currentTimeMillis();
        quickSort(quickSortArray, 0, quickSortArray.length - 1);
        long endTimeQuickSort = System.currentTimeMillis();
        long executionTimeQuickSort = endTimeQuickSort - startTimeQuickSort;

        // Display execution times for both sorting methods
        System.out.println("Execution Time (milliseconds):");
        System.out.println("Selection Sort: " + executionTimeSelectionSort);
        System.out.println("Quick Sort: " + executionTimeQuickSort);

        // Compare performance
        double percentage = ((double) (executionTimeSelectionSort - executionTimeQuickSort) / executionTimeSelectionSort) * 100;
        String fasterAlgorithm = (executionTimeSelectionSort > executionTimeQuickSort) ? "Quick Sort" : "Selection Sort";
        System.out.println("\n" + fasterAlgorithm + " is faster by " + Math.abs(percentage) + "%.");
    }

    // Method to generate an array of random floating-point numbers
    public static double[] generateRandomNumbers(int size) {
        double[] numbers = new double[size];
        Random random = new Random();

        for (int i = 0; i < size; i++) {
            numbers[i] = 1.0 + (random.nextDouble() * 99.0);
        }
        return numbers;
    }

    // Method to perform Selection Sort
    public static void selectionSort(double[] arr) {
        int n = arr.length;

        for (int i = 0; i < n - 1; i++) {
            int minIndex = i;
            for (int j = i + 1; j < n; j++) {
                if (arr[j] < arr[minIndex]) {
                    minIndex = j;
                }
            }
            if (minIndex != i) {
                double temp = arr[minIndex];
                arr[minIndex] = arr[i];
                arr[i] = temp;
            }
        }
    }

    // Method to perform Quick Sort
    public static void quickSort(double[] arr, int low, int high) {
        if (low < high) {
            int pi = partition(arr, low, high);

            quickSort(arr, low, pi - 1);
            quickSort(arr, pi + 1, high);
        }
    }

    public static int partition(double[] arr, int low, int high) {
        double pivot = arr[high];
        int i = low - 1;

        for (int j = low; j < high; j++) {
            if (arr[j] < pivot) {
                i++;

                double temp = arr[i];
                arr[i] = arr[j];
                arr[j] = temp;
            }
        }

        double temp = arr[i + 1];
        arr[i + 1] = arr[high];
        arr[high] = temp;

        return i + 1;
    }
}

```
