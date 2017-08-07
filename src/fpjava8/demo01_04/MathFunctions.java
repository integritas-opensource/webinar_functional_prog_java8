package fpjava8.demo01_04;

import java.util.function.Function;

public class MathFunctions {

	public static int factorial(int n) {
		if (n==0) {
			return 1;
		} else {
			return n*factorial(n-1);
		}
	}
	
	public static int doubleFunction(int n) {
		return 2*n;
	}

	public static int doubleFactorial(Function<Integer,Integer> factorialFunc, Function<Integer,Integer> doubleFunc, int n) {
		return doubleFunc.apply(n) * factorialFunc.apply(n);
	}
	
	public static void main(String[] args) {
		System.out.println(doubleFactorial(MathFunctions::factorial, MathFunctions::doubleFunction, 3));
	}
	
}
