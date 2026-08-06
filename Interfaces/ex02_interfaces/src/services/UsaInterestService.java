    package services;
     
    public class UsaInterestService implements InterestService {
     
    	private double interestRate=1.0;
     
    	@Override
    	public double getInterestRate() {
    		return interestRate;
    	}
    }