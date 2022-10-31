package infyTqProjectTwenty;

public class CreditCardPayment extends Payment{
	private static int counter;
	
	static {
		counter = 1000;
	}
	public CreditCardPayment(int customerId) {
		super(customerId);
		CreditCardPayment.setCounter(++counter);
		super.setPaymentId("C"+CreditCardPayment.getCounter());
	}
	
	public static int getCounter() {
		return counter;
	}

	public static void setCounter(int counter) {
		CreditCardPayment.counter = counter;
	}

	@Override
	public double paybill(double amount) {
		// TODO Auto-generated method stub
		if(amount <= 500) {
			super.setServiceTaxPercentage(3);
			
		} else if(amount > 500 && amount <= 1000) {
			super.setServiceTaxPercentage(5);
			
		} else {
			super.setServiceTaxPercentage(6);
			
		}
		
		return amount + (amount * (super.getServiceTaxPercentage() / 100));
		
	}
}
