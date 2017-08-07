package fpjava8.demo03_02;

import java.util.function.Function;

public class AnotherClass {

	public static void main(String[] args) {
		ClassWIthInstanceMethod c = new ClassWIthInstanceMethod();
		Function<Integer,Integer> f = c::doubler;
		System.out.println(f.apply(3));

	}

}
