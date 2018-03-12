// Write a Java program that takes a number as input and prints its multiplication table up to 10

package exercises1;

import java.util.Scanner;
public class Exercise7 {
	public static void main(String[] args) {
		Scanner userin = new Scanner(System.in);
		
		System.out.println("Enter a number: ");
		int num1 = userin.nextInt();
		
		int prod = 1;
		
		for(int counter=0;counter<10;counter++) {
			int result = num1*prod;
			System.out.println(num1+" * "+(counter+1)+" = "+result);
			prod++;
			
		}
		
	}

}
