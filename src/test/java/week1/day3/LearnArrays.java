package week1.day3;

import java.lang.reflect.Array;
import java.util.Arrays;

public class LearnArrays {
	
	public static void main(String[] args) {
		
		String value = "python";
		
		// Way 01
		String[] name = {"Anjali", "Sudha", "Sanjay"};
		
		int[] ph = {123, 456, 789};
		
		
		// Way 02 - Static Array
		// Classname obj = new ClassName();
		String[] names = new String[3];
		names[0] = "Sudha";
		names[1] = "Sanjay";
		names[2] = "Anjali";
		
		// Fetch the single item(value) from the given array
		System.out.println(names[1]);
		
		// Count of the array
		System.out.println(names.length);
		
		// Fetch the last item from the given array
		System.out.println(names[names.length-1]);
		
		System.out.println();
		
		// Print all the item
		for(int i = 0; i<names.length; i++) {
			System.out.println(names[i]);
		}
		
		// To sort the value in Ascending order
		Arrays.sort(names);
		
		System.out.println();
		
		for(int i = 0; i<names.length; i++) {
			System.out.println(names[i]);
		}
		
		// For error
		System.out.println(names[4]);
		
		
		
	}

}
