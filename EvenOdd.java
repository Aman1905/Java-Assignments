Solution :-
	
	
package assignments;

import java.util.Scanner;

public class EvenOdd {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		System.out.println("Enter the Integer :-");
		int a = sc.nextInt();

		if (a % 2 == 0) {
			System.out.println(a + " is Even Number");
		} else {
			System.out.println(a + " is Odd Number");
		}

	}

}
