Solution :-
	
	
package assignments;

import java.util.Scanner;

public class FarToCel {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		System.out.println("Enter the temperature in Fahrenheit :- ");
		float fahren = sc.nextFloat();
		
		float cel = (fahren - 32)*5/9;
		System.out.println("Temperature in Celsius = "+cel +" C");

	}

}
