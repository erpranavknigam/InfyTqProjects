package infyTqProjectTwo;

class Food{
	private String foodName;
	private String cuisins;
	private String foodTypes;
	private int quantityAvailable;
	private double unitPrice;
	
	
	public Food(String foodName, String cuisins, String foodTypes, int quantityAvailable, double unitPrice) {
		super();
		this.foodName = foodName;
		this.cuisins = cuisins;
		this.foodTypes = foodTypes;
		this.quantityAvailable = quantityAvailable;
		this.unitPrice = unitPrice;
	}

	public void setFoodName(String foodName){
		this.foodName = foodName;
	}
	
	public void setCuisins(String cuisins) {
		this.cuisins = cuisins;
	}
	
	public void setFoodType(String foodTypes) {
		this.foodTypes = foodTypes;
	}
	
	public void setQuantityAvailable(int quantityAvailable) {
		this.quantityAvailable = quantityAvailable;
	}
	
	public void setUnitPrice(double unitPrice) {
		this.unitPrice = unitPrice;
	}
	
	
	public String getFoodName() {
		return foodName;
	}
	
	public String getCuisins() {
		return cuisins;
	}
	
	public String getFoodTypes() {
		return foodTypes;
	}
	
	public int getQuantityAvailable() {
		return quantityAvailable;
	}
	
	public double getUnitPrice() {
		return unitPrice;
	}
}
