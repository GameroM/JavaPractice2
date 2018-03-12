//Write a Java program to convert a hexadecimal to a decimal number

package exercises1;

import java.util.Scanner;

public class Exercise28 {
	public static void main(String[] args) {
		Scanner userin = new Scanner(System.in);
		System.out.println("Enter a number in hexadecimal format to convert to decimal: ");
		String num1 = userin.nextLine();
		int num2 = Integer.parseInt(num1, 16);
		System.out.println("The number in decimal format is: "+Integer.toString(num2));
	}
}
