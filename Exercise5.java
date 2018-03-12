// Write a Java program that takes two numbers as input and display the product of two numbers

package exercises1;

import java.util.Scanner;

public class Exercise5 {
	public static void main(String[] args) {
		Scanner userin = new Scanner(System.in);
		System.out.println("Enter first number: ");
		int num1 = userin.nextInt();
		System.out.println("Enter second number: ");
		int num2 = userin.nextInt();
		int prod = num1*num2;
		System.out.println("The product of the two numbers is: "+prod);
	}

}
