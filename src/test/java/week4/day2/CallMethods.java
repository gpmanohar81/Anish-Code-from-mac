package week4.day2;

public class CallMethods {

	/**
	 * Inheritance:
	 * 			- Single Inheritance
	 * 			- Multi-level Inheritance
	 * 			- Hierarchical Inheritance
	 * 			- Hybrid Inheritance
	 *
	 */
	

	public static void main(String[] args) {
		BMW b = new BMW();
		b.applyBrake();
		b.soundHorn();
		b.turnOnAC();
		System.out.println(b.logo);	
		
		
		Car c = new BMW();
		c.turnOnAC();
		c.applyBrake();
		c.soundHorn();
		
		Vehicle v = new BMW();
		v.applyBrake();
		v.soundHorn();
	}
}
