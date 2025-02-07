package streamdemo;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class CollectDemo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		List<Integer> numList = new ArrayList<>(Arrays.asList(2,3,4,5,7));
		Stream<Integer> stream = numList.stream();
		Stream<Integer> stream1 = stream.limit(3);
		List<Integer> res =  stream1.collect(Collectors.toList());
		System.out.println(res);
		
		
	}

}
