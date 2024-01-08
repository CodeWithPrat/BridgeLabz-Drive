### Given a sorted array of n integers and a target value, determine if the target exists in the array using the binary search algorithm. If the target exists in the array, print the index of it.

```java
public class BinarySearchExample {
    public static void main(String[] args) {
        int[] array1 = {2, 3, 5, 7, 9};
        int target1 = 7;
        int result1 = binarySearch(array1, target1);
        printResult(result1, target1);

        int[] array2 = {1, 4, 5, 8, 9};
        int target2 = 7;
        int result2 = binarySearch(array2, target2);
        printResult(result2, target2);
    }

    public static int binarySearch(int[] arr, int target) {
        int left = 0;
        int right = arr.length - 1;

        while (left <= right) {
            int mid = left + (right - left) / 2;

            if (arr[mid] == target) {
                return mid;
            }

            if (arr[mid] < target) {
                left = mid + 1;
            } else {
                right = mid - 1;
            }
        }
        return -1;
    }

    public static void printResult(int result, int target) {
        if (result != -1) {
            System.out.println("Element found at Index " + result);
        } else {
            System.out.println("Element Not Found for target value " + target);
        }
    }
}

```
