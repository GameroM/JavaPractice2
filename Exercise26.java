// Write a Java program to convert an octal number to a binary number

package exercises1;

import java.util.Scanner;

public class Exercise26 {
	public static void main(String[] args) {
		Scanner userin = new Scanner(System.in);
		System.out.println("Enter a number in octal form to convert it to binary: ");
		String num1 = userin.nextLine();
		int num2 = Integer.parseInt(num1, 8);
		System.out.println("The number in binary form is: "+Integer.toBinaryString(num2));
	}
}
