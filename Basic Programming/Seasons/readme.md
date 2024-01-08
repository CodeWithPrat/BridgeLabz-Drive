# Checking Seasons Based on Month Number

This Java program checks the season based on a provided month number. It ensures correct data type and valid input within the range of 1 to 12 for the month number.

## Java Code Explanation

The program follows these steps:

1. **Importing Required Libraries**: It imports the `java.util.Scanner` class to take user input.

2. **Main Method and Input Validation Loop**:
   - The main method initializes a `Scanner` object to receive input.
   - It sets a boolean variable `validInput` to `false` initially to ensure the input validation loop runs.
   - The program uses a `while` loop to continuously prompt the user for a month number until valid input is entered (`validInput` becomes `true`).
   - Inside the loop:
     - It prompts the user to enter a month number.
     - Checks if the input is an integer using `scanner.hasNextInt()`.
     - If it's an integer, checks if it falls within the range of 1 to 12.
     - If the input is valid, `validInput` becomes `true`, and it proceeds to determine the season based on the entered month number.
     - If the input is invalid, error messages are displayed accordingly.

3. **Season Determination Method**:
   - The program defines a method named `getSeason(int month)` that takes an integer argument representing the month number.
   - Using a `switch` statement, it associates the entered month number with the corresponding season based on predefined criteria.
   - It returns a `String` value indicating the season for the given month number.

## Running the Program

- Run the Java program in an IDE or compile and execute it in a terminal.
- Enter a month number when prompted (1 to 12).
- The program validates the input and displays the corresponding season for the entered month number.

This Java program ensures valid input and provides the corresponding season based on the entered month number, helping users identify the season associated with a particular month.
