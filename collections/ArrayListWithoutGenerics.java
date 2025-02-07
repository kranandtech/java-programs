package collections;
import java.util.ArrayList;
import java.util.List;
public class ArrayListWithoutGenerics {

	public static void main(String[] args) {
		List arrayList = new ArrayList();
		arrayList.add("ak");
		//arrayList.add(20);
		//String str = (String) arrayList.get(1); // runtime error
		String str1 = (String) arrayList.get(0); // casting is needed. if not done then Type mismatch: cannot convert from Object to String
		System.out.println(str1);

	}

}
