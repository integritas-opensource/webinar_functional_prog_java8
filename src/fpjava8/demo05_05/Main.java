package fpjava8.demo05_05;

import java.util.Arrays;
import java.util.List;
import java.util.Map;
import java.util.Optional;
import java.util.stream.Collectors;
import java.util.stream.IntStream;
import java.util.stream.Stream;

public class Main {

	public static void main(String[] args) {
		List<Integer> list = Arrays.asList(new Integer[]{1,2,3,4,5,6,7,8,9,10});
		IntStream newListStream = list.stream().mapToInt((x)->x);
		System.out.println("sum = " + newListStream.sum());

	}

}
