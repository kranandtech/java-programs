package oops;

public class CounterStaticDemo {
	private static int count = 0;
	//private  int count = 0;
	public CounterStaticDemo(int num) {
		System.out.println(num);
		count++;
	}
	public  int getCount() {
		return count;
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		CounterStaticDemo c1 = new CounterStaticDemo(10);
//		CounterStaticDemo c2 = new CounterStaticDemo();
//		CounterStaticDemo c3 = new CounterStaticDemo();
		System.out.println(c1.count);
	}

}
