Solution :-
  
  
package assignments;

import java.util.Scanner;

public class PrimeOrNot {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		System.out.println("Enter any number :-");
		int n = sc.nextInt();

		boolean isPrime = true;
//If number gets divisible by 1 and number itself then it is a prime number else if it is divisible by any number between 2 to n-1 then it is a non prime number

		int div = 2;
		while (div <= n - 1) {
			if (n % div == 0) {
				isPrime = false;
			}
			div++;
		}
		if (isPrime == true) {
			System.out.println("It is a Prime number");
		} else {
			System.out.println("It is Not a Prime Number");
		}

	}

}
