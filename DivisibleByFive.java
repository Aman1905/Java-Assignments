Solution :-
	

package assignments;

import java.util.Scanner;

public class DivisibleByFive {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		System.out.println("Enter any Integer :- ");
		float num = sc.nextFloat();

		if (num % 5 == 0) {
			System.out.println("Yes !! " + num + " is divisible by 5");
		} else {
			System.out.println("Nope !! " + num + " is not divisible by 5");
		}
	}

}

