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
