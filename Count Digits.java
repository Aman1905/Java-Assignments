Solution :-
  
  
package assignments;

import java.util.*;

public class CountDigit {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		System.out.println("Enter the number :-");
		long num = sc.nextInt();
		//int n1 = num;

		int count = 0;

		while (num != 0) {
			num /= 10;
			count++;
		}
		System.out.println("The number of digits in the given integer is " + count);
	}

}
