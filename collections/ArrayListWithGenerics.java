package collections;

import java.util.ArrayList;
import java.util.List;

public class ArrayListWithGenerics {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		List<String> arrayList = new ArrayList<>();
		arrayList.add("ak");
		//arrayList.add(20);
		//String str = (String) arrayList.get(1); // runtime error
		String str1 =  arrayList.get(0); // casting is not needed
		System.out.println(str1);

	}

}
