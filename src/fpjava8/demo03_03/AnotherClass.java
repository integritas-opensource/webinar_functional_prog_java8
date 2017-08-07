package fpjava8.demo03_03;

import java.util.function.Function;
import java.util.function.Supplier;

public class AnotherClass {

	public static void main(String[] args) {
		Supplier<ClassWithConstructor> r = ClassWithConstructor::new;
		ClassWithConstructor c = r.get(); // c = new ClassWithConstructor()
		c.print();
		
		Function<Integer, ClassWithConstructor> r2 = ClassWithConstructor::new;
		ClassWithConstructor c2 = r2.apply(3); // c2 = new ClassWithConstructor(3);
		c2.print();

	}

}
