
package assignments;

import java.util.Scanner;

public class Circle {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		System.out.println("Enter the Radius of Circle :- ");
		float rad = sc.nextFloat();

		float area = (float) ((Math.PI) * rad * rad);
		System.out.println("Area of Circle = " + area);

		float perimeter = (float) (2 * (Math.PI) * rad);
		System.out.println("Perimeter of Circle = " + perimeter);

	}

}
