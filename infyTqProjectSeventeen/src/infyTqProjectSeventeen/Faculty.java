package infyTqProjectSeventeen;

public class Faculty {
	private String name;
	private float basicSalary;
	private float bonusPercentage = 4f;
	private float carAllowancePercentage = 2.5f;
	
	
	public Faculty(String name, float basicSalary) {
		
		this.name = name;
		this.basicSalary = basicSalary;
	}
	
	public double calculateSalary() {
		
		return basicSalary + basicSalary*0.04 + basicSalary*0.025;
	}
	
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public float getBasicSalary() {
		return basicSalary;
	}
	public void setBasicSalary(float basicSalary) {
		this.basicSalary = basicSalary;
	}
	public float getBonusPercentage() {
		return bonusPercentage;
	}
	public void setBonusPercentage(float bonusPercentage) {
		this.bonusPercentage = bonusPercentage;
	}
	public float getCarAllowancePercentage() {
		return carAllowancePercentage;
	}
	public void setCarAllowancePercentage(float carAllowancePercentage) {
		this.carAllowancePercentage = carAllowancePercentage;
	}
	
	
}
