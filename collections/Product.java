package collections;

import java.util.HashSet;
import java.util.Objects;

public class Product {
    private int productId;
    private String productName;
    private int quantity;
    private static HashSet<Product> productSet = new HashSet<>();
	public int getProductId() {
		return productId;
	}

	public void setProductId(int productId) {
		this.productId = productId;
	}

	public String getProductName() {
		return productName;
	}

	public void setProductName(String productName) {
		this.productName = productName;
	}

	public int getQuantity() {
		return quantity;
	}

	public void setQuantity(int quantity) {
		this.quantity = quantity;
	}

	public Product(int productId, String productName, int quantity) {
		super();
		this.productId = productId;
		this.productName = productName;
		this.quantity = quantity;
	}
	public void addProduct(Product p) {
		productSet.add(p);
	}
	public static HashSet<Product> getProductSet(){
		return productSet;
	}
	public String toString() {
		return "ProductId: "+getProductId()+", Product name: "+getProductName()+", Quantity: "+getQuantity();
	}
	public int hashCode() {
		return Objects.hash(productId,productName,quantity);
	}


	public static void main(String[] args) {
		Product p1 = new Product(1, "Phone", 100);
		Product p2 = new Product(1, "Phone", 100);
		Product p3 = new Product(2, "Laptop", 200);
		p1.addProduct(p1);
		p2.addProduct(p2);
		p3.addProduct(p3);
		System.out.println(Product.getProductSet());

	}

}
