// Write a Java program to compare two numbers:

package exercises1;

import java.util.Scanner;

public class Exercise32 {
	public static void main(String[] args) {
		Scanner userin = new Scanner(System.in);
		System.out.println("Enter first number: ");
		int num1 = userin.nextInt();
		System.out.println("Enter second number: ");
		int num2 = userin.nextInt();
		if(num1 != num2) {
			System.out.println(num1+" != "+num2);
		}
		if(num1 == num2) {
			System.out.println(num1+" == "+num2);
		}
		if(num1 >= num2) {
			System.out.println(num1+" >= "+num2);
		}
		if(num1 <= num2) {
			System.out.println(num1+" <= "+num2);
		}
		if(num1 < num2) {
			System.out.println(num1+" < "+num2);
		}
		if(num1 > num2) {
			System.out.println(num1+" > "+num2);
		}
		
	}
}
