Solution :-
	
	
package assignments;

import java.util.Scanner;

public class CelToFar {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		System.out.println("Enter the temperature in Celsius :- ");
		float cel = sc.nextFloat();
		
		float fahren = (cel * 9/5)+32;
		System.out.println("Temperature in Fahrenheit = "+fahren +" F");
	}

}
