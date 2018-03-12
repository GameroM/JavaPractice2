// Write a Java program to compute the area of a hexagon
// The area of a hexagon is = (6*s^2)/(4*tan(PI/6))
// where s is lenght of a side

package exercises1;

import java.util.Scanner;

public class Exercise34 {
	public static void main(String[] args) {
		Scanner userin = new Scanner(System.in);
		System.out.println("Enter value of a side: ");
		double side = userin.nextInt();
		double area = (6*Math.pow(side, 2))/(4*Math.tan(Math.PI/6));
		System.out.println(area);
	}
}
