### Write a method to check if two strings are equal or not. If the second string’s size is more than the first it returns -1. Else it compares character by character. If equals it returns 0. Else it returns the position wrt the first character where the difference is found.

```java
public class StringComparator {
    public static void main(String[] args) {
        String str1 = "apple";
        String str2 = "banana";

        int result = compareStrings(str1, str2);

        if (result == 0) {
            System.out.println("Strings are equal.");
        } else if (result == -1) {
            System.out.println("Second string's size is greater than the first.");
        } else {
            System.out.println("Strings differ at position: " + result);
        }
    }

    // Method to compare two strings based on given conditions
    public static int compareStrings(String str1, String str2) {
        int len1 = str1.length();
        int len2 = str2.length();

        // Check if the second string's length is greater than the first
        if (len2 > len1) {
            return -1;
        }

        // Compare character by character
        for (int i = 0; i < len2; i++) {
            if (str1.charAt(i) != str2.charAt(i)) {
                return i;
            }
        }

        // Strings are equal up to the length of the smaller string
        if (len1 == len2) {
            return 0;
        }

        // Second string is a substring of the first string
        return len2;
    }
}

```
