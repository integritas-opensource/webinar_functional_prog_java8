package fpjava8.demo04_02;

import java.util.function.Function;

public class LambdaReturningButNoReturnClause {

	public static void main(String[] args) {
		Function<Integer, Integer> doubleFunction = x -> 2*x;
		System.out.println(doubleFunction.apply(3));

	}

}
