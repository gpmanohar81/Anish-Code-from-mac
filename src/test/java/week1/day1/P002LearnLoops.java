package week1.day1;

public class P002LearnLoops {
	
	public void print() {
		
		System.out.println("hello all");
		
		
	}
	


	/**
	 * 	;, {}
	 * 
	 * 
	 * Loops:
	 * 
	 * 		- for iterator
	 * 		- for each
	 * 		- while loop
	 * 		- do while loop
	 * 
	 * 		- switch Case
	 * 
	 * 				- break:	its stop the iterations and come out of the loop
	 * 				- continue: its skip the current iteration and continue with next iteration
	 * 				- return
	 * 
	 * For:
	 * 
	 * 		for(initialize; condition; increment / decrement){
	 * 
	 * 				// body of for loop
	 * 		
	 * 		}
	 * 
	 * 
	 * forEach:
	 * 
	 * 		for(DataType Variable : Collection){
	 * 
	 * 				// body of forEach
	 * 
	 * 		}
	 * 
	 * 
	 * While:
	 * 			
	 * 		while(condition){
	 * 		
	 * 				//body of the While condition
	 * 
	 * 		}
	 * 
	 * 
	 * do-while:
	 * 
	 * 		do{
	 * 
	 * 			body of the do-while
	 * 
	 * 		}while(condition)
	 * 
	 * 
	 */
	public static void main(String[] args) {
		
		// Find the even number using the loop
		for(int i = 1; i <=20; i++) {			// i = i + 1
			if(i%2 == 0) {
				System.out.println(i);
			}
		}
		
		System.out.println();
		
		// Find the odd number using the loop
		for(int i = 0; i <= 20; i++) {
			if(i%2 != 0) {
				System.out.println(i);
			}
		}
		
		System.out.println();
		
		
		// print reverse order
		for(int i =20; i >= 1; i--) {
			System.out.println(i);
		}
		
		System.out.println();
		
		// Find the even number using the while loop
		int j = 51;
		while(j<=50) {							// Minimum zero'th - Maximum n'th
			if(j%2==0)
				System.out.println(j);
			j++;
		}
		
		
		System.out.println();
		// Print 1 to 10
		
		int x = 100;
		do {									// Minimum ONE - Maximum n'th
			System.out.println(x);
			x++;
		}while(x<=10);
		
		
	
	}




}
