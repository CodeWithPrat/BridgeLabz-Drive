## Write a program SumOfTwoDice that prints the sum of two random integers between 1 and 6 (such as you might get when rolling dice).
```java
import java.util.Random;

public class SumOfTwoDice {
    public static void main(String[] args) {
        // Create an instance of the Random class
        Random rand = new Random();

        // Generate two random integers between 1 and 6 (inclusive) for two dice rolls
        int dice1 = rand.nextInt(6) + 1;
        int dice2 = rand.nextInt(6) + 1;

        // Calculate the sum of two dice rolls
        int sum = dice1 + dice2;

        // Display the results
        System.out.println("Result of rolling two dice:");
        System.out.println("Dice 1: " + dice1);
        System.out.println("Dice 2: " + dice2);
        System.out.println("Sum of two dice rolls: " + sum);
    }
}

```
