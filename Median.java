Solution :-
  
package assignments;

import java.util.Scanner;

public class Median {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		System.out.println("Enter the Size of Array :- ");
		int size = sc.nextInt();

		double med = 0;

		System.out.println("Enter " + size + " elements :-");
		double arr[] = new double[size];

		for (int i = 0; i < size; i++) {
			arr[i] = sc.nextDouble();
		}

		if (size % 2 == 1) {
			med = arr[(size + 1) / 2 - 1];
		} else {
			med = (arr[size / 2 - 1] + arr[size / 2]) / 2;
		}

		System.out.println("Median of the given set of Numbers are :" + med);

	}

}
