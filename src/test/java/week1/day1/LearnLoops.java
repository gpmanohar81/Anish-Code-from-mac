package week1.day1;

public class LearnLoops {

	/**
	 * Loops:
	 * 		- For Iterator
	 * 
	 * 				for(initialize; condition; increment / decrement){
	 * 
	 * 						// Body of the for loop
	 * 
	 * 				}
	 * 
	 * 
	 * 		- While Loops
	 * 
	 * 				while(condition){
	 * 
	 * 						// Body of the while loop
	 * 
	 * 				}
	 * 
	 * 
	 * 		- Do While Loop
	 * 
	 * 				do{
	 * 
	 * 						// Body of the Do-While loop
	 * 
	 * 				}while(condition)
	 * 
	 * 
	 * 
	 */

	public static void main(String[] args) {

		for(int i = 1; i<=10; i++) {		// i = i + 1

			if(i%2==0) {
				System.out.println(i);	
			}

		}

		for(int i = 10; i >= 1; i--) {

			if(i%2!=0) {
				System.out.println(i);
			}
		}


	}

}
