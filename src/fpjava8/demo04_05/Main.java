package fpjava8.demo04_05;

import java.util.function.Function;

public class Main {

	public static Function<Double, Boolean> paidMore(double amount) {
		return (salary) -> { return salary > amount;};
	}
	
	
	
	public static void main(String[] args) {
		Function<Double, Boolean> isHighlyPaid = paidMore(10000);
		//isHighlyPaid = (salary) -> { return salary > 10000;}
		System.out.println(isHighlyPaid.apply(5000.0));
		System.out.println(isHighlyPaid.apply(15000.0));
		Function<Double, Boolean> isMediumPaid = paidMore(3000);
		//isMediumPaid = (salary) -> { return salary > 3000; }
		System.out.println(isMediumPaid.apply(500.0));
		System.out.println(isMediumPaid.apply(5000.0));
		
	}

}
