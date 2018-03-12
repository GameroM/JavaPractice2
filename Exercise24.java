// Write a Java program to convert a binary number to Octal number

package exercises1;

import java.util.Scanner;

public class Exercise24 {
	public static void main(String[] args) {
		Scanner userin = new Scanner(System.in);
		System.out.println("Enter binary number to convert to Octal form: ");
		String num1 = userin.nextLine();
		int num2 = Integer.parseInt(num1, 2);
		System.out.println("The number in octal form is: "+Integer.toOctalString(num2));
	}

}
