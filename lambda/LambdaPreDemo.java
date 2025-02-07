package lambda;
interface Car{
	public void show();
}
public class LambdaPreDemo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Car car = new Car() {
			public void show() {
				System.out.println("abc");
			}
		};
		car.show();
	}

}
