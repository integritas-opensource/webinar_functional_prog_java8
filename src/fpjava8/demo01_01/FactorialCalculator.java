package fpjava8.demo01_01;

public class FactorialCalculator {

	public int factorial(int n) {
		if (n==0) {
			return 1;
		} else {
			return n*factorial(n-1);
		}
	}
	
	public static void main(String[] args) {
		FactorialCalculator calc = new FactorialCalculator();
		System.out.println(calc.factorial(4));
	}
	
}
