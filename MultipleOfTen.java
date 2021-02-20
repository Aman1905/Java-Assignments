Solution :-
	
	
package assignments;

import java.util.Scanner;

public class MultipleOfTen {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		System.out.println("Enter the 1st Interval :- ");
		int n1 = sc.nextInt();

		System.out.println("Enter the 2nd Interval :- ");
		int n2 = sc.nextInt();

		for (int i = n1; i <= n2; i++) {
			if (i % 10 == 0) {
				System.out.println("Multiples of 10 => "+i);
			} 
		}
		
	}

}
