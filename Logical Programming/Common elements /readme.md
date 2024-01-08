```java
import java.util.ArrayList;
import java.util.Arrays;

public class CommonElementsArrays {
    public static void main(String[] args) {
        // Two string arrays
        String[] array1 = {"apple", "orange", "banana", "kiwi", "grape"};
        String[] array2 = {"banana", "mango", "apple", "grapefruit", "orange"};

        // Finding common elements between array1 and array2
        String[] commonElements = findCommonElements(array1, array2);

        // Displaying common elements
        System.out.println("Common elements between array1 and array2:");
        System.out.println(Arrays.toString(commonElements));
    }

    // Method to find common elements between two string arrays
    public static String[] findCommonElements(String[] array1, String[] array2) {
        ArrayList<String> commonList = new ArrayList<>();

        for (String element : array1) {
            if (Arrays.asList(array2).contains(element) && !commonList.contains(element)) {
                commonList.add(element);
            }
        }

        return commonList.toArray(new String[0]);
    }
}

```

```java
import java.util.Arrays;

public class CommonElementsArrays {
    public static void main(String[] args) {
        // Two string arrays
        String[] array1 = {"apple", "orange", "banana", "kiwi", "grape"};
        String[] array2 = {"banana", "mango", "apple", "grapefruit", "orange"};

        // Finding common elements between array1 and array2
        String[] commonElements = findCommonElements(array1, array2);

        // Displaying common elements
        System.out.println("Common elements between array1 and array2:");
        System.out.println(Arrays.toString(commonElements));
    }

    // Method to find common elements between two string arrays
    public static String[] findCommonElements(String[] array1, String[] array2) {
        // Initialize a new array to store common elements
        String[] tempArray = new String[Math.min(array1.length, array2.length)];
        int count = 0;

        // Nested loop to compare elements in array1 and array2
        for (String element1 : array1) {
            for (String element2 : array2) {
                if (element1.equals(element2)) {
                    // If a common element is found, add it to tempArray
                    tempArray[count] = element1;
                    count++;
                    break; // Break the inner loop as the element is found
                }
            }
        }

        // Create a new array with exact length to store common elements
        String[] commonElements = new String[count];
        System.arraycopy(tempArray, 0, commonElements, 0, count);

        return commonElements;
    }
}

```
