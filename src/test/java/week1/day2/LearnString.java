package week1.day2;

public class LearnString {
	
	
	
	public static void main(String[] args) {
		
	//	String text1 = "Welcome to Learn String Function";				// String Literal
	//	String text2 = new String("Welcome to Learn String Function");	// String Object
	//					01234567
		String text1 = "Welcome";
		
		
		/**
		 * String Methods:
		 * 
		 * 1. length				---- return the character count of given String 
		 * 2. chatAt(index)			---- return character base on given index number
		 * 3. indexOf(char)			---- returns index first matching number of given char
		 * 4. lastIndexOf(char)		---- returns index first matching number of given char
		 * 5. subString(bIndex)
		 * 6. subString(bIndex, eIndex)- extracts a particular portion of the String
		 * 7. Validation:
		 * 				- equals
		 * 				- startsWith()
		 * 				- endsWith()
		 * 				- contains()
		 * 
		 * 8. replace()
		 * 9. concat()
		 * 
		 * 10. split()
		 * 11. toCharArray()
		 * 
		 * 
		 * 
		 * 
		 * 
		 */
		
		
		System.out.println(text1.length());
		
		System.out.println(text1.charAt(2));
		
		System.out.println(text1.indexOf('c'));
		
		System.out.println(text1.lastIndexOf('c'));
		//			  012345678	
		String txt = "Hello Everyone";
		
		System.out.println(text1.substring(3));
		
		System.out.println(txt.substring(1, 9));		// bIndex = includes   // eIndex = exclude
		
		System.out.println(txt.startsWith("hel"));
		
		System.out.println(txt.endsWith("one"));
		
		System.out.println(txt.contains("Ev"));
		
		System.out.println(txt.replace('z', 'E'));
		
		int a = 10;
		int b = 2;
		String c = "1";
		String d = "10";
		
		String e = "1";
		
		
		System.out.println(a + b);
		System.out.println(a + c);
		
		
		System.out.println(c + d);
		System.out.println(c + e);
		
		System.out.println(c.concat(e));
		
		// Print the given String in reverse order
		String txt1 = "Java Program";    // margorP avaJ
		
		System.out.println();
		System.out.println(txt1);
		
		for(int i =txt1.length()-1; i>=0; i--) {	
			System.out.print(txt1.charAt(i));
		}
		

		String x = "xyz";

		System.out.println(x.length());
		System.out.println(x.indexOf('z'));
		
		
	}

}
