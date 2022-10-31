package infyTqProjectTwo;


class Customer{
	
	private String customerId;
	private String customerName;
	private long contactNumber;
	private Address address;
	
	public Customer(String customerId, String customerName, long contactNumber, Address address) {
		this.customerId = customerId;
		this.customerName = customerName;
		this.contactNumber = contactNumber;
		this.address = address;
	}
	
	public Customer(String customerName, long contactNumber, Address address) {
		this.customerName = customerName;
		this.contactNumber = contactNumber;
		this.address = address;
	}
	
	public void setCustomerId(String customerId) {
		this.customerId = customerId;
	}
	
	public void setCustomerName(String customerName) {
		this.customerName = customerName;
	}
	
	public void setContactNumber(long contactNumber) {
		this.contactNumber = contactNumber;
	}
	
	public void setAddress(Address address) {
		this.address = address;
	}
	
	public String getCustomerId() {
		return this.customerId;
	}
	
	public String getCustomerName() {
		return this.customerName;
	}
	
	public long getContactNumber() {
		return this.contactNumber;
	}
	
	public Address getAddress() {
		return this.address;
	}
	
	public void displayCustomerDetails() {
		System.out.println("Customer Id: " + getCustomerId());
		System.out.println("Customer Name: " + getCustomerName());
		System.out.println("Contact Number: " + getContactNumber());
		System.out.println("Address: " + getAddress());
	}
}
