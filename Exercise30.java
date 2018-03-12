// Write a Java program to convert a hexadecimal to an octal number

package exercises1;

import java.util.Scanner;

public class Exercise30 {
	public static void main(String[] args) {
		Scanner userin = new Scanner(System.in);
		System.out.println("Enter a number in hexadecimal format to convert to octal: ");
		String num1 = userin.nextLine();
		int num2 = Integer.parseInt(num1, 16);
		System.out.println("The number in octal format is: "+Integer.toOctalString(num2));
	}
}
