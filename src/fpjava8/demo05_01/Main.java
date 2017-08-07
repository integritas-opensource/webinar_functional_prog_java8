package fpjava8.demo05_01;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;

public class Main {

	public static void main(String[] args) {
		List<Integer> list = Arrays.asList(new Integer[]{1,2,3,4});
		for (int i=0;i<list.size();i++) {
			System.out.println(list.get(i));
		}				

	}

}
