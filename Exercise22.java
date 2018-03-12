// Write a Java program to convert a binary number to decimal number

package exercises1;

import java.util.Scanner;

public class Exercise22 {
	public static void main(String[] args) {
		Scanner userin = new Scanner(System.in);
		System.out.println("Enter binary number to convert to decimal form: ");
		String num1 = userin.nextLine();
		System.out.println("The number in decimal form is: "+Integer.parseInt(num1, 2));
	}
}
