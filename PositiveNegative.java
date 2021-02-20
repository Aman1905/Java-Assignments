
package assignments;

import java.util.Scanner;

public class PositiveNegative {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		System.out.println("Enter the Integer :-");
		int a = sc.nextInt();

		if (a > 0) {
			System.out.println(a + " is Positive Integer");
		} else {
			System.out.println(a + " is Negative Integer");
		}

	}

}
