// PSEUDOCODE
/* 
 * This program will have a method that searches an integer array for a specified value
 * The method will check the array to see if it contains the specified integer
 * If it does it will return that integers index in the array
 * If not the method will throw an exception that states that the element is not found in the array and end
 * The main method will test this method with a set array and user input for the specific integer
 */

package integerManipulations;

import java.util.Scanner;

public class SpecifiedIntegerInArray {

	public static void main(String[] args) {
		
		//Declare and set an array of integers
		int[] arrayNums = {10, 50, 4, 72, 8, 36, 22};
		
		//Create a scanner
		Scanner input = new Scanner(System.in);
		
		//Prompt the user to enter an integer
		System.out.println("Enter an integer: ");
		
		//Set a variable to the input
		int needle = input.nextInt();
		
		//Call the returnIndex method
		returnIndex(arrayNums, needle);

	}
	
	public static int returnIndex(int[] haystack, int needle)
			throws NullPointerException {

		try {	
			//Loop through the array to see if any element matches the needle
			for (int i = 0; i < haystack.length; i++) {
				
				//if the current array element matches the needle then return its' index
				if (needle == haystack[i]) {
					return i;
				} 	
			}
			//if the needle doesn't match any array int the return null
			return (Integer) null;
		}
		//if return null occurs it will cause an exception
		catch(Exception NullPointerException){
			
			//print a statement
			System.out.print("Element not found in array");
		}
		//return -1 to have a return type even if there is no index for the array
		return -1;
	}

}
