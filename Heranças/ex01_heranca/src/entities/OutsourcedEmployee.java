package entities;

public class OutsourcedEmployee extends Employee{
	private double adittionalCharge;
	public OutsourcedEmployee() {
		super();
	}
	public OutsourcedEmployee(String name, Integer hours, Double valuePerHour, double adittionalCharge) {
		super(name, hours, valuePerHour);
		this.adittionalCharge = adittionalCharge;
	}
	public double getAdittionalCharge() {
		return adittionalCharge;
	}
	public void setAdittionalCharge(double adittionalCharge) {
		this.adittionalCharge = adittionalCharge;
	}
	@Override
	public Double payment() {
		Double add = adittionalCharge * 1.1;
		return valuePerHour * hours + add;
	}
}
