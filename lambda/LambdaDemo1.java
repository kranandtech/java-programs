package lambda;
interface Hello{
	public void show();
}
public class LambdaDemo1 {
    static void print(Hello r) {
    	r.show();
    }
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Hello r = () -> {System.out.println("Hello");};
		print(r);
	}

}
