package fpjava8.demo02_01;

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
		System.out.println(f instanceof Object);
		Object o = new Object();
		System.out.println(o);
		System.out.println(f);
		
	}
	
}
