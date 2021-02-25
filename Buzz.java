Solution :-
  
package assignments;

import java.util.Scanner;

public class BuzzOrNot {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		System.out.println("Enter the number :- ");
		int num = sc.nextInt();

		if (num % 7 == 0 || num % 10 == 7) {
			System.out.println(num + " is a Buzz.");
		} else {
			System.out.println(num + " is not a Buzz");
		}

	}

}
