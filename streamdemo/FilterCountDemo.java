package streamdemo;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Stream;

public class FilterCountDemo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		List<String> stringList = Arrays.asList("apple","","guava","","mango");
		Stream<String> stream = stringList.stream();
		Stream<String> stream1 = stream.filter(s -> !s.isEmpty());
		long count = stream1.count();
		System.out.println(count);
		stringList.stream().filter(s->!s.isEmpty()).forEach(System.out::println);
	}

}
