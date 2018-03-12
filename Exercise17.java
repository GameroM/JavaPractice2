// Write a Java program to add two binary numbers


package exercises1;

import java.util.Scanner;

public class Exercise17 {
	public static void main(String[] args) {
		Scanner userin = new Scanner(System.in);
		System.out.println("Enter first binary number");
		String x = userin.nextLine();
		System.out.println("Enter second binary number");
		String y = userin.nextLine();
		
		int n1 = Integer.parseInt(x,2);			// This method converts String to Int in first argument, in this case (x and y)
		int n2 = Integer.parseInt(y,2);			// The second argument is the base you want, in this casy binary, can be 10,2,8,16
		int n3 = n1+n2;							// The number you input will be read as binary but will be displayed as its 
												// decimal equivalent
		
		System.out.println("n1: "+Integer.toBinaryString(n1)); //changes value displayed from decimal to binary
		System.out.println("n2: "+Integer.toBinaryString(n2)); // without the Integer.toBinaryString() it will print as dec #
		System.out.println("result is: "+Integer.toBinaryString(n3));
	}
	

}
