// Write a Java program to print the sum, multplication, subtraction, division and remainder of two numbers

package exercises1;

import java.util.Scanner;

public class Exercise6 {
	public static void main(String[] args) {
		Scanner userin = new Scanner(System.in);
		
		System.out.println("Enter first number: ");
		int num1 = userin.nextInt();
		System.out.println("Enter second number: ");
		int num2 = userin.nextInt();
		
		int sum = num1+num2;
		int prod = num1*num2;
		int sub = num1-num2;
		int div = num1/num2;
		int mod = num1%num2;
		
		System.out.println("Your two numbers are: "+num1+"  and  "+num2+"\nThe sum is: "+sum +"\nThe product is: "+prod
				+"\nThe subtracion is: "+sub
				+"\nThe division is: "+div+"\nThe modulus is: "+mod);
	}

}
