package infyTqProjectTwenty;

public class DebitCardPayment extends Payment{
	private static int counter;
	private double discountPercentage;
	
	static {
		counter = 1000;
	}
	
	public DebitCardPayment(int customerId) {
		super(customerId);
		DebitCardPayment.setCounter(++counter);
		super.setPaymentId("D" + DebitCardPayment.getCounter());
	}

	public static int getCounter() {
		return counter;
	}

	public static void setCounter(int counter) {
		DebitCardPayment.counter = counter;
	}

	public double getDiscountPercentage() {
		return discountPercentage;
	}

	public void setDiscountPercentage(double discountPercentage) {
		this.discountPercentage = discountPercentage;
	}

	@Override
	public double paybill(double amount) {
		if(amount <= 500) {
			super.setServiceTaxPercentage(2.5);
			this.setDiscountPercentage(1);
		} else if(amount > 500 && amount <= 1000) {
			super.setServiceTaxPercentage(4);
			this.setDiscountPercentage(2);
		} else {
			super.setServiceTaxPercentage(5);
			this.setDiscountPercentage(3);
		}
		
		return amount + (amount*(super.getServiceTaxPercentage() / 100)) - (amount*(this.getDiscountPercentage())/100);
	}
	
	
}
