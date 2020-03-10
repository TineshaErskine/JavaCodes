// PSEUDOCODE
/* 
 * This program will have an array that holds 10 random integers between 1 and 11
 * It will then print these numbers into a text file in the same location as this project
 * Lastly it will read the file, sum the integers, and print the sum of all integers.
 */

package integerManipulations;

import java.io.PrintWriter;
import java.io.IOException;
import java.util.Scanner;

public class Assignment2 {

	public static void main(String[] args) throws IOException {
		
		//Declare an array that holds 10 integers
		double [] randomNums = new double[10];
		
		//for loop to pass 10 random integers into a method
		for(int i = 0; i < randomNums.length ; i++) {
			
			//set a random number between 1 and 11 as an element in the array
			randomNums[i] = 1 + (double)(Math.random() * 10);
		}
		//Declare a variable to hold the string of the text file name
		String path = "random_nums.txt";
		
		//Pass the randomNums array to the write to file method
		writeNumToFile(randomNums, path);
		
		//Call the method to read the file and sum doubles
		readNumFromFile(path);
	}
	
	
	//Method to write number to a text file
	public static void writeNumToFile(double[] array, String path) throws IOException {
		
		//Declare a variable for the file
		java.io.File file = new java.io.File(path);
		
		//Use try to auto close the file
		try (
			//Create file to write in
			PrintWriter output = new PrintWriter(file);
		) {
			//loop through the array and add them to a text file
			for(double n: array) {
				
				//Print the array element on a new line each time
				output.println(n);
			}
		}
	}
	

	//Method to read numbers from a text file calculates its sum
	public static void readNumFromFile(String path) throws IOException {
		
		//Declare a variable for the file
		java.io.File file = new java.io.File(path);
		
		//Create a Scanner for the file
		Scanner input = new Scanner(file);
		
		//Declare a variable for sum
		double sum = 0;
		
		//Read the file
		while(input.hasNextDouble()) {
			//Declare a double to hold the input
			double num = input.nextDouble();
			
			//add the next input to sum variable
			sum += num;
			
			//print the input
			System.out.println(num);
			
		}
		//Print sum
		System.out.printf("\nThe total is %.2f", sum);
		
		//Close file
		input.close();
	}
}
