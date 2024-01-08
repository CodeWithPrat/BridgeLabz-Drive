### Write a program that takes a range of numbers as input and outputs the Prime Numbers in that range.
# Prime Numbers within a Range

This Java program finds and prints the prime numbers within a specified range of numbers.

## Program Overview

The program performs the following steps:

1. **Input Range**:
   - It prompts the user to enter the starting and ending numbers of the range within which prime numbers need to be found.

2. **Prime Number Checking Method**:
   - The program defines a method named `isPrime` that checks if a number is prime.
   - The `isPrime` method:
     - Returns `false` for numbers less than or equal to 1.
     - Iterates from 2 up to the square root of the number and checks for divisors. If any divisor other than 1 and the number itself exists, it returns `false`; otherwise, it returns `true`.

3. **Finding and Printing Prime Numbers**:
   - The program defines another method named `findAndPrintPrimes` that finds and prints prime numbers within the specified range.
   - It iterates through each number within the range and calls the `isPrime` method for each number.
   - If a number is prime, it is printed.

4. **Output**:
   - The program displays the prime numbers found within the specified range.

## Running the Program

To execute the program:
- Compile the `PrimeNumbersInRange.java` file.
- Run the compiled Java class.
- Enter the starting and ending numbers of the range when prompted.
- The program will find and display the prime numbers within the specified range.

This program helps users find and identify prime numbers within a specified range, demonstrating prime number checking and printing functionality.
