package funcao_metodo_parametro;

public class Product {
	String name;
	Double price;
	public Product(String name, Double price) {
		super();
		this.name = name;
		this.price = price;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public Double getPrice() {
		return price;
	}
	public void setPrice(Double price) {
		this.price = price;
	}
	
	public static boolean staticProductPredicate (Product p) {
		return p.getPrice() >= 100;
	}
	
	public static void staticProductConsumer(Product t) {
		t.setPrice(t.getPrice() * 1.1);
	}
	public void nonStaticProductConsumer() {
		setPrice(price * 1.1);
	}
	public boolean nonStaticProductPredicate () {
		return price >= 100;
	}
	
	public static String staticUpperCaseName (Product t) {
		return t.getName().toUpperCase();
	}
	public String nonStaticUpperCaseName () {
		return name.toUpperCase();
	}
	@Override
	public String toString() {
		return "Product [name=" + name + ", price=" + String.format("%.2f",  price)+ "]";
	}
	
	
}
