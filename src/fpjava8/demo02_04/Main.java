package fpjava8.demo02_04;

public class Main {

	public static void main(String[] args) {
		InterfaceWithOneDefaultMethodAndAnotherMethod f = (y) -> {
			System.out.println(y + " - " + y);			
		};
		f.doSomething(9);
		f.doSomethingDefault(3);

	}

}
