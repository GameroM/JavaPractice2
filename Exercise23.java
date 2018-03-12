// Write a Java program to convert a binary number to hexadecimal numer

package exercises1;

import java.util.Scanner;

public class Exercise23 {
	public static void main(String[] args) {
		Scanner userin = new Scanner(System.in);
		System.out.println("Enter binary number to convert to hexadecimal form: ");
		String num1 = userin.nextLine();
		int num2 = Integer.parseInt(num1, 2);
		System.out.println("The number in hexadecimal form is: "+Integer.toHexString(num2));
	}
}
