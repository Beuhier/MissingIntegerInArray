/**
 * 
 */
package com.interview.ThreeLineCardManagement;

import java.util.Arrays;

/**
 * @author chino
 *
 */
public class MissingIntegerInArraySolution {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		
	}
	
	public static int checkArrayForMissingInteger(int givenArray[]) {
		//Format supplied array to maximum size of 100000 and filter out negative integers
		int[] formattedArray = Arrays.stream(givenArray).limit(100000).filter(e -> e > 0).toArray();  
		
		int i; // declare a counter to be unitized in the loop
		
		int formattedArraysize = formattedArray.length; // Initialize an integer formattedArraysize with size of formatted array
		
		//Loop through formattedArray and Indicate a member of the formatted array has been visited by making it a negative value. 
		for(i = 0; i < formattedArraysize ; i++) {
			
			//Get the absolute value
			int absoluteValue = Math.abs(formattedArray[i]); 
			
			// i.e set formattedArray[i] = fromattedArray[formattedArray[i] - 1].
			if(absoluteValue - 1 <  formattedArraysize && formattedArray[absoluteValue - 1] > 0) {
				// Note that 1 is subtracted because index start from 0 and positive numbers starts from 0
				formattedArray[absoluteValue - 1] = - formattedArray[absoluteValue - 1]; 
			}
		}
		
		//Return the first index value at which is positive 
		for(i = 0; i < formattedArraysize; i++) 
			if(formattedArray[i] > 0) 
				return i + 1;
		
		//Start from 0
		return formattedArraysize + 1;
	}
}
