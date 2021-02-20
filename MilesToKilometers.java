Solution :-


package assignments;

import java.util.Scanner;

public class MilesToKilometers {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		System.out.println("Enter the Miles :- ");
		float miles = sc.nextFloat();

		float km = (float) (miles * 1.609);

		System.out.println("You have travelled " + km + " Kilometers.");
	}

}
