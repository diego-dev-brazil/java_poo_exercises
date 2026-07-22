package entities;

import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;
import java.util.ArrayList;
import java.util.List;

import entities_enum.OrderStatus;

public class Order {
	private LocalDateTime moment;
	private OrderStatus status;
	private Client client;
	private List<OrderItem> items = new ArrayList <>();
	
	public Order() {
		
	}

	public Order(LocalDateTime moment, OrderStatus status, Client client) {
		super();
		this.moment = moment;
		this.status = status;
		this.client = client;
	}

	public LocalDateTime getMoment() {
		return moment;
	}

	public void setMoment(LocalDateTime moment) {
		this.moment = moment;
	}

	public OrderStatus getStatus() {
		return status;
	}

	public void setStatus(OrderStatus status) {
		this.status = status;
	}

	public Client getClient() {
		return client;
	}

	public void setClient(Client client) {
		this.client = client;
	}

	public List<OrderItem> getItems() {
		return items;
	}
	
	public void addItem (OrderItem orderItem) {
		items.add(orderItem);
	}
	public void removeItem (OrderItem orderItem) {
		items.remove(orderItem);
	}	
	public Double total() {
		double sum = 0;
		for (OrderItem c : items) {
			sum += c.getPrice() * c.getQuantity();
		}
		return sum;
	}
	public String toString() {
		StringBuilder sb = new StringBuilder();
		sb.append("\nORDER SUMMARY:\n" + "Order moment: ");
		sb.append(moment.format(DateTimeFormatter.ofPattern("dd/MM/yyyy HH:mm:ss")));
		sb.append("\nOrder Status: " + status.toString());
		sb.append("\nClient: " + client.getName() + " (" + client.getBirthDate().format(DateTimeFormatter.ofPattern("dd/MM/yyyy")) + ")  -  " + client.getEmail());
		sb.append("\nOrder items: \n");
		for (OrderItem x : items) {
			sb.append(x.getProduct().getName() + ", $" + x.getProduct().getPrice() + ".00, " + 
		"Quantity: " + x.getQuantity() + ", Subtotal: " + x.getPrice() + "\n");
		}
		sb.append("\nTotal price: " + total());
		return sb.toString();
	}
}
