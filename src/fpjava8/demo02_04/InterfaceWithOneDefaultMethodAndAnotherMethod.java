package fpjava8.demo02_04;

public interface InterfaceWithOneDefaultMethodAndAnotherMethod {

	public void doSomething(int x);
	
	public default void doSomethingDefault(int x) {
		System.out.println(x);
	}
	
	
}
