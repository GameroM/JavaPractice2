// Write a Java program to reverse a string

package exercises1;

import java.util.Scanner;

public class Exercise37 {
	public static void main(String[] args) {
		Scanner userin = new Scanner(System.in);
		
		System.out.println("Enter a string to reverse it: ");
		String input = userin.nextLine();
		String input2 = new StringBuilder(input).reverse().toString(); 
		System.out.println("The string reversed is: "+input2);
	}
}
