//Write a Java program to print the sum of two numbers

package exercises1;

import java.util.Scanner;
public class Exercise2 {
	public static void main(String[] args) {
		Scanner userin = new Scanner(System.in);
		System.out.println("Enter two numbers: ");
		int num1 = userin.nextInt();
		int num2 = userin.nextInt();
		int total = num1+num2;
		System.out.println("The result is: "+ total);
	}

}
