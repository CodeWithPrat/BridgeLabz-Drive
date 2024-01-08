import java.util.Scanner;

public class QuadraticRoots {
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);

		System.out.println("Enter the values of a, b, and c for the quadratic equation ax^2 + bx + c = 0:");
		System.out.print("Enter the value of a: ");
		double a = scanner.nextDouble();

		System.out.print("Enter the value of b: ");
		double b = scanner.nextDouble();

		System.out.print("Enter the value of c: ");
		double c = scanner.nextDouble();

		double delta = b * b - 4 * a * c; // Calculate delta

		if (delta > 0) {
			// Calculate roots when delta is positive
			double root1 = (-b + Math.sqrt(delta)) / (2 * a);
			double root2 = (-b - Math.sqrt(delta)) / (2 * a);
			System.out.println("Root 1 of x = " + root1);
			System.out.println("Root 2 of x = " + root2);
		} else if (delta == 0) {
			// Calculate roots when delta is zero (both roots are same)
			double root = -b / (2 * a);
			System.out.println("Both roots are equal: Root 1 and Root 2 of x = " + root);
		} else {
			// When delta is negative, roots are complex numbers
			double realPart = -b / (2 * a);
			double imaginaryPart = Math.sqrt(-delta) / (2 * a);
			System.out.println("Root 1 of x = " + realPart + " + " + imaginaryPart + "i");
			System.out.println("Root 2 of x = " + realPart + " - " + imaginaryPart + "i");
		}

		scanner.close();

	}
}
