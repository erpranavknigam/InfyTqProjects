package infyTqProjectTwo;

public class Tester {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Food food = new Food("Pizza Margherita", "Italian", "Veg", 10, 8.0);
		
		Food[] foodList = {food};
		food.setFoodName("Pizza Margherita");
		food.setCuisins("Italian");
		food.setFoodType("Veg");
		food.setQuantityAvailable(10);
		food.setUnitPrice(8.0);
		
		Order order = new Order(101, food);
		
		Address address = new Address("50", "5B", "Hyderabad", 475452);
		Customer customer = new Customer("C101", "Raman", 9340781147L, address);
		System.out.println("Order placed successfully!");
		System.out.println("Customer Id: " + customer.getCustomerId());
		System.out.println("Customer Name: " + customer.getCustomerName());
		System.out.println("Contact Number: " + customer.getContactNumber());
		System.out.println("Address: " + address.getDoorNo() + ", " + address.getStreet() + ", " + address.getCity() + ", " + address.getZipcode());
		System.out.println("You have ordered: " + order.getOrderedFoods().getFoodName());
		System.out.println("Order status: " + order.getStatus());
		
		
		
	}

}
