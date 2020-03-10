//Tinesha Erskine SPC ID#2430820
// PSEUDOCODE
/* 
 * This program will take a variable number of integers entered as a command line argument
 * The main method will then display the ints that were entered on the command line
 *  It will have a method named sumInts that will take the variable number of int and return the sum of the arguments.
 *  Lastly it will display the sum
 */

package erskine5;

public class Assignment2 {

	public static void main(String[] args) {
		
		System.out.print("Passing [");
		
		//Print the command line inputs
		for(int i = 0; i < args.length; i++) {
			
			//if statement to add commas between each element or a bracket after the last element
			if(i == args.length-1) {
				System.out.print(args[i] + "]");

			}else {
				System.out.print(args[i] + ", ");
			}
		}
		
		//Run sumInt and print the sum
		System.out.println("\nSum is " + sumInt(args));
				
	}
	
	public static int sumInt(String[] array) {
		
		//Declare a variable for sum
		int arraySum = 0;
		
		//Loop through the array and add each int to sum
		for(int i = 0; i < array.length; i++) {
			
			//Convert args[i] string to int
			arraySum+= Integer.parseInt(array[i]);
		}
		
		//Return the sum
		return arraySum;
	}

}
