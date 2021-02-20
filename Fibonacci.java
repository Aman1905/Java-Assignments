Solution :-
	
	
package assignments;

import java.util.Scanner;

public class Fibonacci {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		int a = 0;
		int b = 1;

		System.out.println("Enter the number till which you want Fibonacci Sequence :-");
		int num = sc.nextInt();

		for (int i = 1; i < num + 1; i++) {
			System.out.println(a);
			int sum = a + b;
			a = b;
			b = sum;
		}

	}

}
