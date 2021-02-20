
package assignments;

import java.util.Scanner;

public class ReverseNumber {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		System.out.println("Enter the Number you want to Reverse :-");
		int num = sc.nextInt();

		int ans = 0;

		while (num != 0) {
			int result = num % 10;
			ans = (ans * 10) + result;
			num = num / 10;
		}
		System.out.println("Reversed Number :- " + ans);
	}

}
