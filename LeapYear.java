Solution :-
	
	
package assignments;

import java.util.Scanner;

public class LeapYear {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		System.out.println("Enter the Year :- ");
		int year = sc.nextInt();

		boolean isLeap = false;

		if (year % 4 == 0) {
			if (year % 100 == 0) {
				if (year % 400 == 0) {
					isLeap = true;
				} else {
					isLeap = false;
				}
			} else {
				isLeap = true;
			}
		} else {
			isLeap = false;
		}
		
		if(isLeap) {
			System.out.println(year +" is a Leap Year.");
		}else {
			System.out.println(year +" is not a Leap Year.");
		}
	}

}
