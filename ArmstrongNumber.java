package week1.day2;

public class ArmstrongNumber {

	public static void main(String[] args) {
		int calc, rem, origi;	
		calc = 0;
		origi = 153;
		int unchange = origi;
		
		while (origi > 0) {
		rem = origi % 10;		
		calc = calc + (rem*rem*rem);
		origi = origi /10;					
			
		}
		if (calc == unchange) {
			System.out.println("it is ArmstrongNumber");
			
		} else {
			System.out.println("it is not ArmstrongNumber");

		}
	
		
		

	}

}
