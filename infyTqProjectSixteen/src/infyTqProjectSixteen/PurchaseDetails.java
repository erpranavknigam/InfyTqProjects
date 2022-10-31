package infyTqProjectSixteen;

public class PurchaseDetails implements Tax{
	private String purchaseId;
	private String paymentType;
	private double taxPercentage;
	
	
	public PurchaseDetails(String purchaseId, String paymentType) {
		this.purchaseId = purchaseId;
		this.paymentType = paymentType;
	}


	public String getPurchaseId() {
		return purchaseId;
	}


	public void setPurchaseId(String purchaseId) {
		this.purchaseId = purchaseId;
	}


	public String getPaymentType() {
		return paymentType;
	}


	public void setPaymentType(String paymentType) {
		this.paymentType = paymentType;
	}


	public double getTaxPercentage() {
		return taxPercentage;
	}


	public void setTaxPercentage(double taxPercentage) {
		this.taxPercentage = taxPercentage;
	}


	@Override
	public double calculateTax(double price) {
		// TODO Auto-generated method stub
		if(getPaymentType().equals("Debit Card")) {
			setTaxPercentage(2);
		} else if(getPaymentType().equals("Credit Card")) {
			setTaxPercentage(3);
		} else {
			setTaxPercentage(4);
		}
		return price + price * ((double)getTaxPercentage() / (double)100);
	}
	
	
}
