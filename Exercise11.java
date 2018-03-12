// Write a Java program to print the area and permiter of a circle using only the radius the user inputs

package exercises1;

import java.util.Scanner;

public class Exercise11 {
	public static void main(String[] args) {
		
		Scanner userin = new Scanner(System.in);
		System.out.println("Enter value of radius: ");
		double radius = userin.nextFloat();
		
		double circum = radius*2*Math.PI;
		double area = Math.PI*Math.pow(radius, 2);
		System.out.println("The circumference or perimeter is: "+circum+"\nThe area is: "+area);
	}

}
