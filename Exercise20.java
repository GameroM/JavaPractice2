// Write a Java program to convert a decimal number to hexadecimal number

package exercises1;

import java.util.Scanner;

public class Exercise20 {
	public static void main(String[] args) {
		
		Scanner userin = new Scanner(System.in);
		System.out.println("Enter number to convert to hexadecimal: ");
		int num1 = userin.nextInt();
		System.out.println("The number in hexadecimal format is: "+Integer.toHexString(num1));
	}

}
