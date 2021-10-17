package week2.day1;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.LinkedHashSet;
import java.util.List;
import java.util.Set;
import java.util.TreeSet;

public class LearnSet {
	
	/**
	 * Set
	 * 
	 * 						- Interface - we can't create object for interface
	 * 						
	 * 
	 * 
	 * Properties of Set:
	 * 						- single[]
	 * 						- its doesn't allow the duplicates (unique item)
	 * 						- order / unorder (Based on implementation class)
	 * 
	 * 
	 * 
	 * Implementation class:
	 * 						- HashSet		-  Random order
	 * 						- TreeSet		-  Ascii Order
	 * 						- LinkedHashSet -  Maintain the order
	 * 
	 * 
	 * Create Object:
	 * 
	 * 				- Interface obj = new ImplementationClass();
	 * 				- Set<Integer> obj  = new HashSet<Integer>();
	 * 	
	 *  Methods:
	 *  		- add
	 *  		- size
	 *  		- contains
	 *  		- remove(object)
	 * 			- clear
	 * 			- isEmpty
	 */
	
	public static void main(String[] args) {
		
		Set<Integer> st = new LinkedHashSet<Integer>();
		st.add(7654);
		st.add(2344);
		st.add(1897);
		st.add(6547);
		
		System.out.println(st);
		
		for (int eachValue : st) {
			System.out.println(eachValue);
		}
		
		System.out.println();
		
		// Fetch Single Item from Set
		List<Integer> lst = new ArrayList<Integer>(st);
		System.out.println(lst.get(5));
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
//		System.out.println(st.size());
//		
//		System.out.println(st.contains(2344));
//		
//		System.out.println(st);
//		
//		st.remove(2344);
//		
//		System.out.println(st);
//		
//		st.clear();
//		
//		System.out.println(st.isEmpty());
	}
	
	

}
