// Write a Java program to multiply two binary numbers

package exercises1;

import java.util.Scanner;

public class Exercise18 {
	public static void main(String[] args) {
		Scanner userin = new Scanner(System.in);
		System.out.println("Enter first binary number: ");
		String x = userin.nextLine();
		System.out.println("Enter second binary number: ");
		String y= userin.nextLine();
		
		int num1 = Integer.parseInt(x, 2);
		int num2 = Integer.parseInt(y, 2);
		int num3 = num2*num1;
		
		System.out.println("First binary: "+Integer.toBinaryString(num1));
		System.out.println("Second binary: "+Integer.toBinaryString(num2));
		System.out.println("Result: "+Integer.toBinaryString(num3));
		
		
		
		
		
	}

}
