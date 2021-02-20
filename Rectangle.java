Solution :-
	
	
package assignments;

import java.util.Scanner;

public class Rectangle {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		System.out.println("Enter the Length of Rectangle :- ");
		float len = sc.nextFloat();

		System.out.println("Enter the Breadth of Rectangle :- ");
		float br = sc.nextFloat();

		float area = len*br;
		System.out.println("Area of Rectangle = "+ area);
		
		float perimeter = 2*(len + br);
		System.out.println("Perimeter of Rectangle = "+perimeter);
		
	}

}
