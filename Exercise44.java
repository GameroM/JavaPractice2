// Write a Java program that accepts an integer(n) and computes the value of n+nn+nnn

package exercises1;

import java.util.Scanner;

public class Exercise44 {
	public static void main(String[] args) {
		  int n;
		  char s1, s2, s3;
		  Scanner in = new Scanner(System.in);
		  System.out.print("Input number: ");
		  n = in .nextInt();
		  System.out.printf("%d + %d%d  + %d%d%d\n", n, n, n, n, n, n);
	}
}
