// Write a Java program to list the availible character sets in charset objects.

package exercises1;

import java.nio.charset.Charset;

public class Exercise40 {
	public static void main(String[] args) {
		System.out.println("List of available character set: ");
		for (String str:Charset.availableCharsets().keySet()) {
			System.out.println(str);
		}
	}

}
