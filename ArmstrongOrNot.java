Solution :-
  
package assignments;

import java.util.Scanner;

public class ArmstrongOrNot {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		int c = 0, a, temp;

		System.out.println("Enter any number :-");
		int n = sc.nextInt();
		// It is the number to check armstrong
		temp = n;
		while (n > 0) {
			a = n % 10;
			n = n / 10;
			c = c + (a * a * a);
		}
		if (temp == c)
			System.out.println("It is an Armstrong number");
		else
			System.out.println("It is Not an Armstrong number");

	}

}
