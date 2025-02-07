package oops;
class Product {
	String name="ABC";
	public Product() {
		System.out.println("in constructor");
	}
    void display() {
        System.out.println("Product details");
    }
    void display2() {
        System.out.println("In parent method using super");
    }
}



class Electronics extends Product {
	public Electronics() {
		super();
	}
	void display() {
        System.out.println("child class Product details");
    }
    void electronicsDetails() {
    	super.display2();
        System.out.println("This is an electronics product "+super.name);
    }
}

public class SingleInheritance {
    public static void main(String[] args) {
        
        Electronics electronics = new Electronics();
        electronics.display();
        electronics.electronicsDetails();
    }
}
