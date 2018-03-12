package exercises1;

import java.util.Scanner;

public class Exercise38 {
    
 public static void main(String[] args) {
	 	Scanner userin = new Scanner(System.in);			//scanner
		String test = userin.nextLine();					//user input variable
		System.out.println("The string is: "+test);			//print useri input
		count(test);										//using function/method we created on variable

	}
	public static void count(String x){						//new method to return things
		char[] ch = x.toCharArray();						// making a Character Array
		int letter = 0;
		int space = 0;
		int num = 0;
		int other = 0;
		for(int i = 0; i < x.length(); i++){			// going through each character in the array
			if(Character.isLetter(ch[i])){				// checking if char is a letter
				letter ++ ;
			}
			else if(Character.isDigit(ch[i])){			// checking if char is a digit
				num ++ ;
			}
			else if(Character.isSpaceChar(ch[i])){ 		// checking if char is a space
				space ++ ;
			}
			else{										//if not letter, digit, or space
				other ++;
			}
		}
		//System.out.println("The string is : "+test);
		System.out.println("letter: " + letter);
		System.out.println("space: " + space);
		System.out.println("number: " + num);
		System.out.println("other: " + other);
			}
}
