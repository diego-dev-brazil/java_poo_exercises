package entities;

public class ImportedProduct extends Product{
	private Double customsFee;
	public ImportedProduct() {
	}
	public ImportedProduct(String name, Double price, Double customsFee) {
		super(name, price);
		this.customsFee = customsFee;
	}
	public Double getCustomsFee() {
		return customsFee;
	}
	public void setCustomsFee(Double customsFee) {
		this.customsFee = customsFee;
	}
	public Double TotalPrice() {
		return price + customsFee;
	}
	@Override
	public String priceTag() {
		StringBuilder sb = new StringBuilder();
		sb.append(name + " $ " + String.format("%.2f", price));
		sb.append(" (Customs Fee: $" + String.format("%.2f", customsFee) + ")");
		return sb.toString();
	}
}
