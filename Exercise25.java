// Write a Java program to convert an octal number to a decimal number

package exercises1;

import java.util.Scanner;

public class Exercise25 {
	public static void main(String[] args) {
		Scanner userin = new Scanner(System.in);
		System.out.println("Enter an octal number to convert it to its decimal form: ");
		String num1 = userin.nextLine();
		int num2 = Integer.parseInt(num1, 8);
		System.out.println("The number in decimal form is: "+Integer.toString(num2));
	}
}
