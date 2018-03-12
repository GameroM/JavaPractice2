// Write a Java program to display a pattern if the user types in 1, otherwise display error

package exercises1;

import java.util.Scanner;

public class Exercise8 {
	public static void main(String[] args) {
		Scanner userin = new Scanner(System.in);
		System.out.println("Enter choice: ");
		int inputo = userin.nextInt();
		if(inputo==1) {
			System.out.println("   J    a   v       v   a ");
			System.out.println("   J   a a   v     v   a a");
			System.out.println("J  J  aaaaa   V   V   aaaaa");
			System.out.println(" JJ  a     a   VVV   a     a");
		}else {
			System.out.println("Error");
		}
	}
}
