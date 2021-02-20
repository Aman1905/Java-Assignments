Solution :-
	

package assignments;

import java.util.Scanner;

public class AddTwoNumbers {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Enter the 1st  number :-");
		int a = sc.nextInt();
		
		System.out.println("Enter the 2nd  number :-");
		int b = sc.nextInt();
		
		int sum = a + b;
		System.out.println("Sum of the "+a+ " and "+b +" is "+ sum );
	}

}
