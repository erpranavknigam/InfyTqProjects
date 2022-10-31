package infyTqProjectTwenty;

public class Tester {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		DebitCardPayment debitCardPayment = new DebitCardPayment(101);
        double billAmount=Math.round(debitCardPayment.paybill(500)*100)/100.0;
		System.out.println("Customer Id: " + debitCardPayment.getCustomerId());
		System.out.println("Payment Id: " + debitCardPayment.getPaymentId());
		System.out.println("Service tax percentage: " + debitCardPayment.getServiceTaxPercentage());
		System.out.println("Discount percentage: " + debitCardPayment.getDiscountPercentage());
		System.out.println("Total bill amount: " + billAmount);
		
		DebitCardPayment debitCardPayment2 = new DebitCardPayment(101);
        double billAmount2=Math.round(debitCardPayment2.paybill(1000)*100)/100.0;
		System.out.println("Customer Id: " + debitCardPayment2.getCustomerId());
		System.out.println("Payment Id: " + debitCardPayment2.getPaymentId());
		System.out.println("Service tax percentage: " + debitCardPayment2.getServiceTaxPercentage());
		System.out.println("Discount percentage: " + debitCardPayment2.getDiscountPercentage());
		System.out.println("Total bill amount: " + billAmount2);
		
		CreditCardPayment creditCardPayment = new CreditCardPayment(102);
        billAmount=Math.round(creditCardPayment.paybill(1000)*100)/100.0;
		System.out.println("Customer Id: " + creditCardPayment.getCustomerId());
		System.out.println("Payment Id: " + creditCardPayment.getPaymentId());
		System.out.println("Service tax percentage: " + creditCardPayment.getServiceTaxPercentage());
		System.out.println("Total bill amount: " + billAmount);
	}

}
