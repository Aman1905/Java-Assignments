Solution :-
	
	
package assignments;

import java.util.Scanner;

public class MaxOf {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		System.out.println("Enter the 1st number :- ");
		int a = sc.nextInt();
		
		System.out.println("Enter the 2nd number :- ");
		int b = sc.nextInt();
		
		System.out.println("Enter the 3rd number :- ");
		int c = sc.nextInt();
		
		if(a>b && a>c) {
			System.out.println(a + " is greater than " +b +" and "+c);
		}
		else if(b>a && b>c) {
			System.out.println(b + " is greater than " +a +" and "+c);
		}
		else {
			System.out.println(c + " is greater than " +a +" and "+b);
		}
	}

}
