// Write a Java program to compute the area of a polygon
// Area of a polygon = (n*s^2)/(4*tan(PI/n))
// n is number of sides and s is length of a side

package exercises1;

import java.util.Scanner;

public class Exercise35 {
	public static void main(String[] args) {
		Scanner userin = new Scanner(System.in);
		System.out.println("Enter number of sides that polygon has: ");
		int sides = userin.nextInt();
		System.out.println("Enter length of a side: ");
		double lside = userin.nextDouble();
		double area = (sides*Math.pow(lside, 2))/(4*Math.tan(Math.PI/sides));
		System.out.println("The area is: "+area);
	}
}
