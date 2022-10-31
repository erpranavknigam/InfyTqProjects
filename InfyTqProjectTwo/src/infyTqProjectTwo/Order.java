package infyTqProjectTwo;

class Order{
	private int orderId;
	private Food orderedFoods;
	private double totalPrice;
	private String status;
	private static int orderIdCounter;
	
	static {
		orderIdCounter = 0;
	}
	
	public Order() {
		this.status = "Ordered";
	}
	
	public Order(Food orderedFoods) {
		this.orderedFoods = orderedFoods;
	}
	
	public Order(int orderId, Food orderedFoods) {
		this.orderId = orderId;
		this.orderedFoods = orderedFoods;
		this.status = "Ordered";
	}
	
	public void setStatus(String status) {
		this.status = status;
	}
	
	public String getStatus() {
		return status;
	}
	
	public void setOrderedFoods(Food orderedFoods) {
		this.orderedFoods = orderedFoods;
	}
	
	public Food getOrderedFoods() {
		return this.orderedFoods;
	}

	public int getOrderId() {
		return orderId;
	}

	public void setOrderId(int orderId) {
		this.orderId = orderId;
	}

	public double getTotalPrice() {
		return totalPrice;
	}

	public void setTotalPrice(double totalPrice) {
		this.totalPrice = totalPrice;
	}
	
	public static int getTotalNoOfOrders() {
		return orderIdCounter;
	}
	
	public double calculateTotalPrice(String paymentMode) {
		return 0.0;
	}
}