package fpjava8.demo05_10;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;

public class Main {

	public static void main(String[] args) {
		List<Integer> list = Arrays.asList(new Integer[]{1,2,3,4});
		list.parallelStream().forEach((x)-> {
			System.out.println(x);
		});
				
	}

}
