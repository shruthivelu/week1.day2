package week1.day2;

public class Calculator {
	
	public int add(int num1, int num2) {
		
		return num1+num2;	

	}
	
	public int sub(int num1, int num2) {
		
		return num1-num2;	

	}
	
	public int mul(int num1, int num2) {
		
		return num1*num2;	

	}
	public int div(int num1, int num2) {
		
		return num1/num2;	

	}

	public static void main(String[] args) {
		Calculator calc = new Calculator();		
		
		System.out.println(calc.add(25, 30));
		System.out.println(calc.sub(35, 30));
		System.out.println(calc.mul(25, 2));
		System.out.println(calc.div(25, 5));

	}

}
