Solution :-

  package assignments;

import java.util.Scanner;

public class HCF {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		// in hcf or gcd calc we will be having a dividend and a divisor all we need to
		// do is to keep calculating it till remainder = 0
		// using long division method is preferable as it will take less iterations to
		// execute
		// last divisor will be our answer

		System.out.println("Enter 1st number :-");
		int n1 = sc.nextInt();

		System.out.println("Enter 2nd number :-");
		int n2 = sc.nextInt();

		while (n1 % n2 != 0) {
			int rem = n1 % n2;
			n1 = n2;
			n2 = rem;
		}
		System.out.println(n2);

	}

}
