package entities;

import java.time.LocalDate;
import java.time.format.DateTimeFormatter;

public class UsedProduct extends Product{
	private LocalDate manufacturedDate;
	public UsedProduct() {
		
	}
	public UsedProduct(String name, Double price, LocalDate manufacturedDate) {
		super(name, price);
		this.manufacturedDate = manufacturedDate;
	}
	public LocalDate getManufacturedDate() {
		return manufacturedDate;
	}
	public void setManufacturedDate(LocalDate manufacturedDate) {
		this.manufacturedDate = manufacturedDate;
	}
	@Override
	public String priceTag() {
		StringBuilder sb = new StringBuilder();
		sb.append(name + " (used) $ " + String.format("%.2f", price));
		sb.append(" (Manufactured Date: $" + manufacturedDate.format(DateTimeFormatter.ofPattern("dd/MM/yyyy")) + ")");
		return sb.toString();
	}	
}
