package streamdemo;

import java.util.Arrays;
import java.util.Comparator;
import java.util.List;

public class SortedDemo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		List<Integer> numbers = Arrays.asList(2, 2, 1, 3);
		numbers.stream().sorted().forEach(e->System.out.print(e+" "));
		System.out.println();
		numbers.stream().sorted(Comparator.reverseOrder()).forEach(e->System.out.print(e+" "));
		System.out.println();
		numbers.stream().sorted(Comparator.comparingInt(Integer::intValue)).forEach(e->System.out.print(e+" "));
		System.out.println();
		numbers.stream().sorted(Comparator.comparingInt(Integer::intValue).reversed()).forEach(e->System.out.print(e+" "));
	}

}
