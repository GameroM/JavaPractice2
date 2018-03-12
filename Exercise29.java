// Write a Java program to convert a hexadecimal to a binary number

package exercises1;

import java.util.Scanner;

public class Exercise29 {
	public static void main(String[] args) {
		Scanner userin = new Scanner(System.in);
		System.out.println("Enter a number in hexadecimal format to convert to binary: ");
		String num1 = userin.nextLine();
		int num2 = Integer.parseInt(num1, 16);
		System.out.println("The number in binary form is: "+ Integer.toBinaryString(num2));
	}
}
