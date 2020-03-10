//Tinesha Erskine SPC ID#2430820
// PSEUDOCODE
/* 
 * This program will have an array that has 8 random integers 50 to 100 inclusive, duplicates are okay
 * Then this array will be passed to a method that will then sort the array
 * It will then return another array that consist of the smallest and largest elements in the original array
 * The main method will then print these two elements 
 * Then it will use a foreach loop will display all elements of the sorted array on one line separated by a space
 * Lastly this foreach loop will also count the even and odd numbers in the array and determine the sum of all elements in the array.  
 */

package erskine5;

import java.util.Arrays;

public class Assignment1 {

	public static void main(String[] args) {
		
		//Declare an array that holds 8 integers
		int [] randomNums = new int[8];
		
		//for loop to pass 8 random integers
		for(int i = 0; i <randomNums.length ; i++) {
			
			//Set i to a random integer 50 to 100 inclusive
			randomNums[i] = 50 + (int)(Math.random() * 51);
		}
		
		
		//Pass the array to a method to sort and return the highest and lowest elements in another array
		int smallLargeNums[] = arraySorter(randomNums);
		
		//Print the highest and lowest elements
		System.out.println("The lowest element is " + smallLargeNums[0]);
		
		System.out.println("The highest element is " + smallLargeNums[1]);

		//Print a statement
		System.out.println("Here is the array");
		
		//Declare variables to hold the total sum, even and odd integers of the sorted array
		int arraySum = 0;
		int evens = 0;
		int odds = 0;
		
		//Foreach statement to print the sorted list on one line sperated by a space, get the sum, and the even and odd count
		for(int n : randomNums ) {
			System.out.print(n + " ");
			
			//add n to the array sum
			arraySum += n;
			
			//See if n is even or odd then add 1 to which ever n is
			if (n%2 == 0) {
				evens++;
			}else {
				odds++;
			}
		}
		
		//Print the count of even and odds
		System.out.println("\nEvens: " + evens + ", odds: " + odds);
		
		//Print the total of all int in the sorted array
		System.out.println("Total: " + arraySum);
		
	}
	
	
	public static int[] arraySorter(int[] array) {
		
		//Sorts the array
		Arrays.sort(array);
		
		//Declare a new array to hold the smallest and largest element
		int smallLargeNums[] = new int[2];
		
		//Copy the smallest element in to the new array
		System.arraycopy(array, 0, smallLargeNums, 0, 1);
		
		//Copy the largest element in to the new array
		System.arraycopy(array, array.length-1, smallLargeNums, 1, 1);

		//Returns an array with the largest and smallest elements
		return smallLargeNums;
	}

}
