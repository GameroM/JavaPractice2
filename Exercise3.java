// Write a Java Program to divide two numbers and print on the screen

package exercises1;

import java.util.Scanner;

public class Exercise3 {
	public static void main(String[] args) {
		Scanner userin = new Scanner(System.in);
		System.out.println("Enter number that you are dividing: ");
		int num1 = userin.nextInt();
		System.out.println("Enter number that you divide by: ");
		int num2 = userin.nextInt();
		int result = num1/num2;
		System.out.println("The result is: "+result);
		
	}

}
