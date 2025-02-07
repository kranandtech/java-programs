package streamdemo;

import java.util.Arrays;
import java.util.Comparator;
import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class StreamDemo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		List<Integer> ar = Arrays.asList(2, 1, 4, 5, 2);
		Stream<Integer> stream = ar.stream();
//		Stream s2 = stream.distinct(); // intermediate
//		List<Integer> ar2 = Arrays.asList(20,30,40,50,20);
//		Stream s4 = ar2.stream();
//		s2.forEach(System.out::println); // terminal
//		s4.limit(1).forEach(System.out::println);
		int s = stream.collect(Collectors.summingInt(Integer::intValue));

		// Print the sum
		//System.out.println("Sum: " + s);
		int a = ar.stream().distinct().max(Comparator.comparingInt(Integer::intValue)).get();
		//ar.stream().filter(e -> e%2==0).forEach(e->System.out.println(e));
		List<Integer> res = ar.stream().map(e-> e*2).collect(Collectors.toList());
//		for(int i:res) {
//			System.out.println(i);
//		}
		ar.stream().sorted(Comparator.reverseOrder()).forEach(System.out::println);
		

	}

}
