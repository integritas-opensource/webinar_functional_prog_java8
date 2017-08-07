package fpjava8.demo01_02;

import java.util.function.Function;

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
		Function<Integer, Integer> f = calc::factorial;		
		System.out.println(f.apply(4));
	}
	
}
