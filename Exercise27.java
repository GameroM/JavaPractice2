// Write a Java Program to convert an octal number to a hexadecimal number

package exercises1;

import java.util.Scanner;

public class Exercise27 {
	public static void main(String[] args) {
		Scanner userin = new Scanner(System.in);
		System.out.println("Enter a number in octal form to convert to hexadecimal: ");
		String num1 = userin.nextLine();
		int num2 = Integer.parseInt(num1, 8);
		System.out.println("The number in hexadecimal form is: "+Integer.toHexString(num2));
	}
}
