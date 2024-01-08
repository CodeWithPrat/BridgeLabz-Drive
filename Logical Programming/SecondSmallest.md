```java
// Java program to find smallest and 
// second smallest element in array 
import java.io.*; 
class GFG { 
	public static void main(String args[]) 
	{ 
		int arr[] = { 12, 13, 1, 10, 34, 1 }; 
		int n = arr.length; 
		int smallest = Integer.MAX_VALUE; 
		// traversing the array to find 
		// smallest element. 
		for (int i = 0; i < n; i++) { 
			if (arr[i] < smallest) { 
				smallest = arr[i]; 
			} 
		} 
		System.out.println("smallest element is: "
						+ smallest); 

		int second_smallest = Integer.MAX_VALUE; 

		// traversing the array to find second smallest 
		// element 
		for (int i = 0; i < n; i++) { 
			if (arr[i] < second_smallest 
				&& arr[i] > smallest) { 
				second_smallest = arr[i]; 
			} 
		} 
		System.out.println("second smallest element is: "
						+ second_smallest); 
	} 
} 

// This code is contributed by Lovely Jain

```
## second approach
```java
/*package whatever //do not write package name here */

import java.io.*; 
import java.util.*; 

class GFG { 
	// Java simple approach to print smallest 
	// and second smallest element. 

	// Driver Code 
	public static void main(String args[]) 
	{ 
		int arr[] = { 111, 13, 25, 9, 34, 1 }; 
		int n = arr.length; 

		// sorting the array using 
		// in-built sort function 
		Arrays.sort(arr); 

		// printing the desired element 
		System.out.println("smallest element is " + arr[0]); 
		System.out.println("second smallest element is "
						+ arr[1]); 
	} 
} 

// This code is contributed by shinjanpatra

```
