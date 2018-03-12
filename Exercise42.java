// Write a Java program to input and display your password

package exercises1;

import java.util.Scanner;

public class Exercise42 {
	public static void main(String[] args) {
		Scanner userin = new Scanner(System.in);
		System.out.println("Enter a password: ");
		String pass = userin.nextLine();
		System.out.println("Your password was: "+pass);
		
	}
}
