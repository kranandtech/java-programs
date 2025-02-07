package streamdemo;
interface Test{
	public void show(int a) ;
	
}
public class LambdaDemo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
//		Test t = new Test() {
//			
//			public void show() {
//				System.out.println("hello");
//			}
//		};
//		t.show();
		Test t = (int ab) -> {System.out.println(ab);};
		t.show(90);
		
	}
	
}
