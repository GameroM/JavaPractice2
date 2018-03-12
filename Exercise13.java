// Write a Java Program to calculate the area and perimeter of a rectangle using user input values

package exercises1;

import java.util.Scanner;

public class Exercise13 {
	public static void main(String[] args) {
		Scanner userin = new Scanner(System.in);
		System.out.println("Enter height: ");
		double hei = userin.nextDouble();
		System.out.println("Enter width: ");
		double wid = userin.nextDouble();
		
		double area = hei*wid;
		double peri = hei+hei+wid+wid;
		System.out.println("The area of the rectangle is: "+area+"\nThe perimeter of the rectangle is: "+peri);
	}

}
