Solution :-
	
	
package assignments;

import java.util.Scanner;

public class GradingSystem {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		System.out.println("Enter your Percentage :-");
		float per = sc.nextFloat();

		if (per >= 90) {
			System.out.println("Grade A");
		} else if (per >= 80 && per < 90) {
			System.out.println("Grade B");
		} else if (per >= 70 && per < 80) {
			System.out.println("Grade C");
		} else if (per >= 60 && per < 70) {
			System.out.println("Grade D");
		} else if (per >= 40 && per < 60) {
			System.out.println("Grade E");
		} else {
			System.out.println("Grade F");
		}
	}

}
