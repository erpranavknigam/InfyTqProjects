package infyTqProjectTwo;

public class Address {
	private String doorNo, street, city;
	private int zipcode;
	
	public Address(String doorNo, String street, String city, int zipcode) {
		this.doorNo = doorNo;
		this.street = street;
		this.city = city;
		this.zipcode = zipcode;
	}
	
	public Address() {
		
	}

	public void setDoorNo(String doorNo){
		this.doorNo = doorNo;
	}
	
	public void setStreet(String street){
		this.street = street;
	}
	
	public void setCity(String city){
		this.city = city;
	}
	
	public void setZipcode(int zipcode){
		this.zipcode = zipcode;
	}
	
	public String getDoorNo() {
		return this.doorNo;
	}
	
	public String getStreet() {
		return this.street;
	}
	
	public String getCity() {
		return this.city;
	}
	
	public int getZipcode() {
		return this.zipcode;
	}
}
