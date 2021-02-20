
package assignments;

import java.util.Scanner;

public class SumOfNaturalNumbers {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int res = 0;

		System.out.println("Enter the Range :-");
		int num = sc.nextInt();

		for (int i = 1; i <= num; i++) {
			res = res + i;
		}
		System.out.println("Sum of " + num + " natural numbers is " + res);
	}

}
