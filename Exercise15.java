// Write a Java program to swap two variables

package exercises1;

public class Exercise15 {
	public static void main(String[] args) {
		
		int a,b,temp;
		a = 20;
		b = 30;
		temp = b;
		System.out.println("The value of a is: "+a+" The value of b is: "+b);
		b= a;
		a = temp;
		System.out.println("The new value of a is: "+a+" The new value of b is: "+b);
		
	}
}
