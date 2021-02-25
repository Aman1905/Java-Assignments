Solution :-
  
  
package assignments;

import java.util.Scanner;

public class Exponential {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		System.out.println("Enter any Number :-");
		int num = sc.nextInt();

		System.out.println("Enter the Power :- ");
		int pow = sc.nextInt();

		int base = num;

		for (int i = 1; i < pow; i++) {
			base *= num;
		}
		System.out.println("Exponent value of the given number is :-" + base);

	}

}
