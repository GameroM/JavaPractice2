// Write a Java program to compute the distance between twoo points on the surface of the earth
// Distance between two points [(x1,y1) & (x2,y2)]
// d = radius*arccos(sin(x1)*sin(x2)+cos(x1)*cos(x2)*cos(y1-y2))
// Radius of the earth r = 6371.01 km

package exercises1;

import java.util.Scanner;

public class Exercise36 {
	public static void main(String[] args) {
		Scanner userin = new Scanner(System.in);
		
		System.out.println("Enter x value(latitude) of first point");
		double x1 = userin.nextDouble();
		System.out.println("Enter y value(longitude) of first point");
		double y1 = userin.nextDouble();
		System.out.println("Enter x value(latitude) of first point");
		double x2 = userin.nextDouble();
		System.out.println("Enter y value(longitude) of first point");
		double y2 = userin.nextDouble();
		
		
		System.out.println("The distance between the two points is: "+dist(x1,y1,x2,y2)+"km\n"); //calling function we created
			
	}
	public static double dist(double x1,double y1,double x2,double y2) { 		// function we create to return value, in this case
																				// we return the area
																				//we convert values entered into radians to be able
																				// to do calculations
		x1 = Math.toRadians(x1);
		y1 = Math.toRadians(y1);
		x2 = Math.toRadians(x2);
		y2 = Math.toRadians(y2);
		
		double radea = 6371.01;
		return  radea*(Math.acos(Math.sin(x1)*Math.sin(x2)+Math.cos(x1)*Math.cos(x2)*Math.cos(y1-y2)));
		
	}
}
