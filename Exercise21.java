// Write a Java Program to convert a decimal number to octal number

package exercises1;

import java.util.Scanner;

public class Exercise21 {
	public static void main(String[] args) {
		Scanner userin = new Scanner(System.in);
		System.out.println("Enter number to convert to octal form: ");
		int num1 = userin.nextInt();
		System.out.println("The number in octal form is: "+Integer.toOctalString(num1));
	}

}
