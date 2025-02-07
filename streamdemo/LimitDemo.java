package streamdemo;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Stream;

public class LimitDemo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		List<Integer> numList = Arrays.asList(2,3,4,5,5,6,7);
		Stream<Integer> stream = numList.stream();
		Stream<Integer> stream1 = stream.limit(5);
		stream1.forEach(e->System.out.println(e));
		
	}

}
