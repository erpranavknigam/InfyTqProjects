package infyTqProjectSeventeen;

public class OfficeStaff extends Faculty{
	private String designation;
	
	public OfficeStaff(String name, float basicSalary, String designation) {
		super(name, basicSalary);
		this.designation = designation;
	}
	
	public double calculateSalary() {
		if("Accountant".equals(getDesignation())) {
			return super.calculateSalary()+ 10000.0;
		} else if("Clerk".equals(getDesignation())) {
			return super.calculateSalary() + 7000.0;
		} else if("Peon".equals(getDesignation())) {
			return super.calculateSalary()+ 4500.0;
		}
		return super.calculateSalary();
	}
	public String getDesignation() {
		return designation;
	}

	public void setDesignation(String designation) {
		this.designation = designation;
	}
	
	
}
