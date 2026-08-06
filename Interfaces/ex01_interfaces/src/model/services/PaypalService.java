package model.services;

public class PaypalService implements OnlinePaymentService {
	private final Double paymentTax = 0.02;
	private final Double interestTax = 0.01;

	@Override
	public Double paymentFee(Double amount) {
		return amount + (amount * paymentTax);
	}

	@Override
	public Double interest(Double amount, Integer months) {
		return amount + (amount * (interestTax * months));
	}

}
