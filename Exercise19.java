// Write a Java Program to convert a decimal number to binary number

package exercises1;

import java.util.Scanner;

public class Exercise19 {
	public static void main(String[] args) {
		Scanner userin = new Scanner(System.in);
		System.out.println("Enter number to convert to binary");
		int num1 = userin.nextInt();
		
		
		System.out.println("The number in binary form is: "+Integer.toBinaryString(num1));
	}
}
