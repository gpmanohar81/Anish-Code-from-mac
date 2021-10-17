package week1.day2;

public class P002LearnString {
	
	public static void main(String[] args) {
		
//		String txt1 = "Java Programs";					// String Literal
//		String txt2 = new String("Java Programs");		// String Object
//		
//		System.out.println(txt1);
//		System.out.println(txt2);
//					  0123456---------------
		String val = "Welcome to Java String Class";
		
		/**
		 * String Methods:
		 * 
		 * 1. length						 |	returns the number of character
		 * 2. charAt(index)					 |	return character based on given index number.
		 * 3. indexOf(char)					 |	return first matching index number based on given character.(L to R)
		 * 4. lastIndexoF(chat)				 |	return first matching index number based on given character.(R to L)
		 * 5. subString(beginIndex)
		 * 6. subString(beginIndex, endIndex)|	extracts a particular portion of the String
		 * 
		 * 
		 * 
		 * 
		 * 
		 */
		
		System.out.println(val.length());
		
		System.out.println(val.charAt(2));
		
		System.out.println(val.indexOf('t'));
		
		System.out.println(val.lastIndexOf('t'));
		
		System.out.println(val.substring(16));
		
		System.out.println(val.substring(3, 15));		// bIndex = include 
														// eIndex = exclude
		
		
		
		
		
	}

}
