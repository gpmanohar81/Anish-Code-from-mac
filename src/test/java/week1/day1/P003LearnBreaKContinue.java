package week1.day1;

public class P003LearnBreaKContinue {

	public static void main(String[] args) {

		//		
		//		for (int i = 1; i <= 100; i++) {
		//			System.out.println(i);	
		//			
		//			if(i == 10) {
		//				break;
		//			}
		//			
		//		}



		for (int i = 1; i <= 10; i++) {

			if(i == 3 || i == 6) {
				continue;
			}
			
			System.out.println(i);

		}




	}

}
