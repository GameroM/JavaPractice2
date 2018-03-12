// Write a Java program to compute the sum of the digits of an integer

package exercises1;

import java.util.Scanner;

public class Exercise33 {
	public static void main(String[] args) {
		Scanner userin = new Scanner(System.in);
		System.out.println("Enter an integer: ");
		long num1 = userin.nextLong();
		System.out.println("The sum of the digits is: "+sumDigits(num1)); 		//calling the other method we created
	}
	public static int sumDigits(long num1) {					//creating a new method to sum digits takes argument the var of num1
		int sum = 0;											//establish sum value
		while(num1 != 0) {										//while loop to run through number
			sum += num1%10;										// first we find the remainder of input divided by 10 and add it to sum
			num1 /= 10;											// we divide the number by 10 and loop giving us new value of num1
																// which we will then find its remainder of it diving by 10
																// Ex. if we input 25, we do 25 mod 10, first which is 5, we add 5 to 
																// the sum which is 0 getting us 5, then we divide 25 by 10 getting us
																// 2, we now do 2 mod 10 to get a remainder which is 2. We add that
																// 2 to the sum which is at this point 5, which gets us 7 total, and we
																// loop one more time with 2 divided by 10 which is 0 and we finish.
		}
		return sum;												// returns the variable sum
	}
}
