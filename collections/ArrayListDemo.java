package collections;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class ArrayListDemo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ArrayList<Integer> arrayList = new ArrayList<>();
		arrayList.add(20);
		arrayList.add(10);
		arrayList.add(40);
		arrayList.add(0,90);
		System.out.println(arrayList);
		List<Integer> listArray = Arrays.asList(2,3,4);
		arrayList.addAll(listArray);
		System.out.println(arrayList);
		arrayList.addAll(6,listArray);
		System.out.println(arrayList);
		if(arrayList.contains(40)) {
			System.out.println("yes");
		}
		else {
			System.out.println("no");
		}
		System.out.println(arrayList.get(0));
		arrayList.clear();
		System.out.println(arrayList);
	}

}
