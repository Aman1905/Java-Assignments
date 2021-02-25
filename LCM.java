Solution :-
  
 
package assignments;

import java.util.*;

public class LCM {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int max, step, lcm = 0;

		System.out.println("Enter 1st number :-");
		int n1 = sc.nextInt();

		System.out.println("Enter 2nd number :-");
		int n2 = sc.nextInt();

		if (n1 > n2) {
			max = step = n1;
		} else {
			max = step = n2;
		}

		while (n1 != 0) {
			if (max % n1 == 0 && max % n2 == 0) {
				lcm = max;
				break;
			}
			max += step;
		}
		System.out.println("LCM of " + n1 + " and " + n2 + " is :- " + lcm);
	}

}
