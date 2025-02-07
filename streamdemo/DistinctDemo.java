package streamdemo;

import java.util.List;
import java.util.Arrays;
import java.util.stream.Stream;

public class DistinctDemo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		List<Integer> numbers = Arrays.asList(3, 2, 2, 3, 7, 5);
		Stream<Integer> stream = numbers.stream();
		Stream<Integer> stream1 = stream.distinct();
		stream1.forEach(e -> System.out.println(e));
	}

}
