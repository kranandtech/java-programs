package lambda;
interface Rectangle{
	public void show();
}
public class LambdaDemo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Rectangle r = () -> {System.out.println("Rectangle");};
		r.show();
	}

}
