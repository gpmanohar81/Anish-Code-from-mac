package week2.day1;

import java.util.List;
import java.util.ArrayList;
import java.util.LinkedList;


public class LearnList {
	
	public static void main(String[] args) {
		
	/**
	 * 
	 * Collection: java.util package
	 *  List: - [FIFO]
	 *  
	 *  		- Interface - we can't create object for interface
	 *  		
	 *  
	 *  Properties of the List:
	 *  		- Single []
	 *  		- its allows the duplications
	 *  		- its maintains the inserting order
	 *  
	 *  Implementation class:
	 *  		- ArrayList
	 *  		- LinkedList
	 *  
	 *  
	 *  Create Object:
	 * 
	 *  		- Interface obj = new ImplementationClass();
	 *  		- List<String> obj = new ArrayList<String>();
	 *  
	 *  Methods:
	 *  		- add
	 *  		- get(index)
	 *  		- size
	 *  		- contains
	 *  		- remove(object), remove(index)
	 * 			- clear
	 * 			- isEmpty
	 *  
	 */
		
		List<String> ls= new ArrayList<String>();
		ls.add("Harry");		// [0]
		ls.add("Sudha");		// [1]
		ls.add("Anusha");		// [2]
		
		
		System.out.println(ls.get(2));
		
		System.out.println(ls.size());
		
		System.out.println(ls.contains("harry"));
		
		System.out.println(ls);
		
		ls.add("Bhavya");
		ls.add("Sanjay");
		ls.add("Harry");
		
		System.out.println(ls);
		
		ls.remove("Harry");
		
		System.out.println(ls);
		
		System.out.println(ls.isEmpty());
		
		ls.clear();
		
		System.out.println(ls);
		
		System.out.println(ls.isEmpty());
	}

}
