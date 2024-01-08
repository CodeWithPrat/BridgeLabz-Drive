## Write a program Quadratic to find the roots of the equation a*x*x + b*x + c. Since the equation is x*x, hence there are 2 roots. The 2 roots of the equation can be found using a formula
- delta = b * b - 4*a*c
- Root 1 of x = (-b + sqrt(delta))/(2*a)
- Root 2 of x = (-b - sqrt(delta))/(2*a)
- Take a, b, and c as input values to find the roots of x.

# Quadratic Equation Roots Calculator

This Java program calculates the roots of a quadratic equation of the form ax^2 + bx + c = 0 using the quadratic formula.

## Program Overview

The program performs the following steps:

1. **Input Values**:
   - It prompts the user to enter the values of `a`, `b`, and `c` for the quadratic equation.
   - These values are taken as input using the `Scanner` class.

2. **Calculating Roots**:
   - It calculates the discriminant `delta` using the formula: `delta = b*b - 4*a*c`.
   - Based on the value of `delta`, the program determines the nature of the roots:
     - If `delta` is positive, it calculates two real and distinct roots using the formulas:
       - `Root 1 of x = (-b + sqrt(delta))/(2*a)`
       - `Root 2 of x = (-b - sqrt(delta))/(2*a)`
     - If `delta` is zero, it calculates both roots to be equal using the formula:
       - `Root 1 and Root 2 of x = -b / (2*a)`
     - If `delta` is negative, it calculates roots as complex numbers with real and imaginary parts:
       - `Root 1 of x = -b / (2*a) + sqrt(-delta) / (2*a) * i`
       - `Root 2 of x = -b / (2*a) - sqrt(-delta) / (2*a) * i`

3. **Displaying Roots**:
   - The program displays the calculated roots based on the value of `delta` and the nature of the roots.

## Running the Program

To execute the program:
- Compile the `QuadraticRoots.java` file.
- Run the compiled Java class.
- Enter the values of `a`, `b`, and `c` when prompted.
- The program will calculate and display the roots of the quadratic equation based on the provided values.

This program helps users find the roots of a quadratic equation by taking input values for `a`, `b`, and `c` and determining the nature of the roots using the quadratic formula.
