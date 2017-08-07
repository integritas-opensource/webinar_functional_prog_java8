package fpjava8.demo02_02;

import java.util.function.BiFunction;
import java.util.function.Function;
import java.util.function.IntFunction;
import java.util.function.Predicate;

public class Example {

	public static void printSomething() {
		System.out.println("something");
	}

	public static int add(int a, int b) {
		return a+b;
	}
	
	public static int doubleF(int a) {
		return 2*a;
	}
	
	public static boolean isBigNumber(int a) {
		return a>1000;
	}
	
	public static void main(String[] args) {
		Executor f = Example::printSomething;
		//Runnable f = Example::printSomething;
		f.johnAndMary(); 
		
		IntFunction<Integer> f2 = Example::doubleF;
		System.out.println(f2.apply(3)); 
		Predicate<Integer> filterExpression = Example::isBigNumber;
		System.out.println(filterExpression.test(900));

	}

}
