Solution :-

  package assignments;

import java.util.Scanner;

public class PallindromeOrNot {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		System.out.println("Enter any number for Pallindrome :- ");
		int num = sc.nextInt();

		int temp = num;
		// storing the number in temporary variable

		int ans = 0;

		// reversing a number
		while (num != 0) {
			int result = num % 10;
			ans = (ans * 10) + result;
			num = num / 10;
		}

		if (temp == ans) {
			System.out.println("Pallindrome Number");
		} else {
			System.out.println("Not a Pallindrome Number");
		}

	}

}
