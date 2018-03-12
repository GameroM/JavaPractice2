// Write a Java program that takes three numbers as input to calculate and print the average of the numbers

package exercises1;

import java.util.Scanner;

public class Exercise12 {
	public static void main(String[] args) {
		
		Scanner userin = new Scanner(System.in);
		System.out.println("Enter first value: ");
		double val1 = userin.nextDouble();
		System.out.println("Enter second value: ");
		double val2 = userin.nextDouble();
		System.out.println("Enter third value: ");
		double val3 = userin.nextDouble();
		
		double avg = (val1+val2+val3)/3;
		System.out.println("The average of the three values is: "+avg);
		
	}
}
