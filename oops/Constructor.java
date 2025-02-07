package oops;

public class Constructor {
	private String name;
	public Constructor() {
		this.name = "Obj1";
	}
	public Constructor(String name) {
		this.name = name;
	}
	public String getName() {
		return this.name;
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Constructor obj1 = new Constructor();
		System.out.println(obj1.getName());
		Constructor obj2 = new Constructor("Anand Kumar");
		System.out.println(obj2.getName());
	}

}
