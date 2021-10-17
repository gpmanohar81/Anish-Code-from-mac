package javaProgram;

public class P002ReverseString {
	
	public static void main(String[] args) {
		
		String text = "Welcome";			// emocleW
		
		// Way 01
		System.out.println(text);
		for (int i = text.length()-1; i>=0; i--) {
			System.out.print(text.charAt(i));
		}
		
		
	}

}
