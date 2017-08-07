package fpjava8.demo02_03;

public class Main {

	public static void main(String[] args) {
		ExampleFunctionalInterface f = (x) -> {
			System.out.println(x);
		};
		
		f.doSomething(3);

	}

}
