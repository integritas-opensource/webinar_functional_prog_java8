package fpjava8.demo04_01;

public class Main {

	public static void main(String[] args) {
		Runnable runnable = () -> System.out.println("something");
		runnable.run();

	}

}
