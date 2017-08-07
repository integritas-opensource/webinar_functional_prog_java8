package fpjava8.demo03_01;

import java.util.function.Function;

public class AnotherClass {

	public static void main(String[] args) {
		Function<Integer,Integer> f = ClassWithStaticMethod::doSomething;
		System.out.println(f.apply(3));

	}

}
