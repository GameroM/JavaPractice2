// Write a Java program to print the ascii value of a given character

package exercises1;

import java.util.Scanner;

public class Exercise41 {
	public static void main(String[] args) {
		Scanner userin = new Scanner(System.in);
		System.out.println("Enter a char to get its ascii value: ");
		char x = userin.next().charAt(0);
		System.out.println("the ascii value of "+x+" is: "+convertchar(x));
		
	}
	public static String convertchar(char x) {
		int ascii = (int)x;
		String y = Integer.toString(ascii);
		return y;
	}

}
