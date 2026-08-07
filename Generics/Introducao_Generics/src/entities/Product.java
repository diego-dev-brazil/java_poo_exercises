package entities;

public class Product implements Comparable<Product> {
	public String name;
	public Double price;
	@Override
	public int compareTo(Product o) {
		// TODO Auto-generated method stub
		return price.compareTo(o.price);
	}
}
