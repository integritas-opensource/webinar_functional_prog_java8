package fpjava8.demo04_04;

import java.util.function.Predicate;

public class Main {

	public static void main(String[] args) {
		
		int i = 3;
		
		Predicate<Integer> f = (x) -> {
			return i>x;
		};
		

		System.out.println(f.test(5));
		

	}

}
