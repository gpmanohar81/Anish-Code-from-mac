package week1.day1;

public class LearnWhileLoop {
	
	public static void main(String[] args) {
		
		
		int i = 1;
		while(i<=10) {
			if(i == 4) {
				break;
			}
			System.out.println(i);
			i++;
		}
		
		
		System.out.println();
		
		int k =1;
		
		do {
			System.out.println(k);
			k++;
		}while(k<=10);
		
		
	}

}
