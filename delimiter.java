/*
 * 11/3/15
 * mrmet555@gmail.com
 * Demo of how to use a delimiter with a scanner
 */
package delimiters;
//importing the scanner method
import java.util.Scanner;

public class delimiters {
	public static void main(String[] args){
		//declaring variables
		int N1,N2,N3,N4,N5,N6,N7,N8,N9,N10=0;
		double N11 = 0.0;
		//declaring the scanner
		Scanner keyboard = new Scanner(System.in);
		//setting the delimiter
		keyboard.useDelimiter(",|\\r\\n");
		//prompting the user for numbers
		System.out.println("Enter ten whole numbers delimitted by a \",\" and I will find the average.");
		//inputing the variable values using the scanner
		N1 = keyboard.nextInt();
		N2 = keyboard.nextInt();
		N3 = keyboard.nextInt();
		N4 = keyboard.nextInt();
		N5 = keyboard.nextInt();
		N6 = keyboard.nextInt();
		N7 = keyboard.nextInt();
		N8 = keyboard.nextInt();
		N9 = keyboard.nextInt();
		N10 = keyboard.nextInt();
		//calculating the average
		N11 = (N1+N2+N3+N4+N5+N6+N7+N8+N9+N10)/10;
		//displaying the average
		System.out.println("The average is: " + N11);
	}
}
