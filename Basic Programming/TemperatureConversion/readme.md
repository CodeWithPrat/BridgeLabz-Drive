## Write a TemperatureConversion program, given the temperature in Fahrenheit as input outputs the temperature in Celsius or vice versa using the formula
- Celsius to Fahrenheit: (°C × 9/5) + 32 = °F
- Fahrenheit to Celsius: (°F − 32) x 5/9 = °C.

# Temperature Conversion Program

This Java program converts temperatures between Fahrenheit and Celsius based on the user's input choice.

## Program Overview

The program performs the following steps:

1. **Menu Selection**:
   - It presents a menu to the user with two options:
     - Fahrenheit to Celsius conversion
     - Celsius to Fahrenheit conversion
   - The user is prompted to enter their choice (1 or 2) for the type of temperature conversion.

2. **Conversion Logic**:
   - If the user selects option 1:
     - It prompts the user to input a temperature in Fahrenheit.
     - It calculates and displays the equivalent temperature in Celsius using the formula: `(°F − 32) × 5/9 = °C`.
   - If the user selects option 2:
     - It prompts the user to input a temperature in Celsius.
     - It calculates and displays the equivalent temperature in Fahrenheit using the formula: `(°C × 9/5) + 32 = °F`.

3. **Handling Invalid Choices**:
   - If the user enters a choice other than 1 or 2, the program displays an error message indicating an invalid choice.

## Running the Program

To execute the program:
- Compile the `TemperatureConversion.java` file.
- Run the compiled Java class.
- Choose the desired conversion type by entering either 1 or 2.
- Enter the temperature value in the specified unit (Fahrenheit or Celsius) as prompted.
- The program will perform the conversion and display the equivalent temperature in the other unit based on the input provided.

This program assists users in converting temperatures between Fahrenheit and Celsius by allowing them to choose the conversion type and providing the converted temperature value accordingly.
