
package assignments;

import java.util.Scanner;

public class Swapping {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		System.out.println("Enter the 1st number :- ");
		int a = sc.nextInt();

		System.out.println("Enter the 2nd number :- ");
		int b = sc.nextInt();

		int swap = a;
		a = b;
		b = swap;

		System.out.println("1st Number after Swapping is " + a);
		System.out.println("2nd Number after Swapping is " + b);
	}

}
