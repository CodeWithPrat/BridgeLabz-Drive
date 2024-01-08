# Powers of 2 Table Generator

This Java program, `PowerOf2.java`, generates a table of powers of 2 up to a given exponent `n`.

## Program Overview

The program performs the following steps:

1. **Command-line Arguments**:
   - It expects a single command-line argument `n` representing the desired exponent for the powers of 2 table.
   - The program validates the command-line argument:
     - If no argument is provided or more than one argument is provided, it displays usage instructions and exits.
     - If the provided argument is less than 0, it prompts the user to enter a non-negative number and exits.

2. **Generating Powers of 2**:
   - It generates and prints a table of powers of 2 from 2^0 up to 2^n inclusive.
   - It uses a `for` loop to calculate and display each power of 2 using the `Math.pow()` method.

## Running the Program

### Execution Steps:
1. **Compilation**:
   - Ensure you have Java installed on your system.
   - Open a terminal or command prompt.
   - Navigate to the directory containing `PowerOf2.java` using the `cd` command.
   - Compile the Java file by entering the following command:
     ```
     javac PowerOf2.java
     ```
   - This will compile the Java file and generate a `PowerOf2.class` file.

2. **Execution**:
   - After successful compilation, run the program by typing:
     ```
     java PowerOf2 5
     ```
     Replace `5` with any positive integer value for which you want to generate the table of powers of 2.

3. **Output**:
   - The program will display a table of powers of 2 less than or equal to the value specified. For instance, if you used `java PowerOf2 5`, it will show the powers of 2 up to 2^5.

Ensure the command-line argument `n` is a non-negative integer value. Adjust the value of `n` in the command to generate the table for different powers of 2.
