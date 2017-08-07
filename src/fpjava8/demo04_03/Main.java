package fpjava8.demo04_03;

public class Main {

	public static void main(String[] args) {
		Runnable runnable = () -> System.out.println("something");
		runnable.run();
		
		Runnable runnable2 = new Runnable() {
			@Override
			public void run() {
				System.out.println("something");				
			}			
		};

		System.out.println(runnable);
		System.out.println(runnable2);
	}

}
