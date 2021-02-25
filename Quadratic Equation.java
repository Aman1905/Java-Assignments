Solution :-
  
package assignments;

import java.util.Scanner;

public class QuadEqnRoots {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		System.out.println("The form of equation will be Ax^2 + Bx +C");

		System.out.println("Enter the value of A :-");
		double a = sc.nextDouble();

		System.out.println("Enter the value of B :-");
		double b = sc.nextDouble();

		System.out.println("Enter the value of C :-");
		double c = sc.nextDouble();

		double root1, root2;

		// determinant = b^2 - 4ac
		double det = b * b - 4 * a * c;

		if (det > 0) {
			// two real and distinct roots

			root1 = (-b + Math.sqrt(det)) / 2 * a;
			root2 = (-b - Math.sqrt(det)) / 2 * a;

			System.out.println("Root1 of the Quadratic Equation is :- " + root1);
			System.out.println("Root2 of the Quadratic Equation is :- " + root2);
		} else if (det == 0) {
			// two real and equal roots

			root1 = root2 = -b / (2 * a);
			System.out.println("Both the Roots of the Quadratic Equation are :- " + root1);
		} else {
			// roots are complex and imaginary

			double real = -b / (2 * a);
			double imaginary = Math.sqrt(-det) / (2 * a);

			System.out.format("Root 1 of Quadratic Equation is %.2f + %.2fi", real, imaginary);
			System.out.format("\nRoot 2 of Quadratic Equation is %.2f - %.2fi", real, imaginary);
		}
	}

}
