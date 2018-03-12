// Reversing string without pre-established method

package exercises1;

import java.util.Scanner;

public class Exercise37a {
	public static void main(String [] args) {
		Scanner userin = new Scanner(System.in);
		System.out.println("Enter string to reverse: ");
		char[] letters = userin.nextLine().toCharArray();			// We are creating a char array here
		System.out.println("String reversed is: ");
		for(int counter = letters.length -1; counter>=0;counter--) {		// we are going through the whole contents of the array
			System.out.print(letters[counter]);						// since the array is named letters we use that here
			
		}
		System.out.println("\n");
	}
}
