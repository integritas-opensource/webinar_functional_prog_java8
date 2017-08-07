package fpjava8.demo01_03;

import java.util.function.Function;

public class MathFunctions {

	public static Function<Integer, Integer> multipleBy(int n) {
		return (v) ->
		 { return n*v; };
	}


	public static Function<Integer,Integer> doubleFunc = multipleBy(2);
	public static Function<Integer,Integer> tripleFunc = multipleBy(3);
	
	public static void main(String[] args) {
		System.out.println(doubleFunc.apply(5));
		System.out.println(tripleFunc.apply(5));		
	}
	
}
