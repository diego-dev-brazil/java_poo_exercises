    package services;
     
    public class BrazilInterestService implements InterestService {
     
    	private double interestRate= 2.0;
     
    	@Override
    	public double getInterestRate() {
    		return interestRate;
    	}
    }