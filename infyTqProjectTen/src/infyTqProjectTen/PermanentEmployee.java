package infyTqProjectTen;

public class PermanentEmployee extends Employee{
	private double basicPay;
	private double hra;
	private float experience;
	
	public PermanentEmployee(int employeeId, String employeeName, double basicPay, double hra, float experience) {
		super(employeeId, employeeName);
		this.basicPay = basicPay;
		this.hra = hra;
		this.experience = experience;
	}

	public double getBasicPay() {
		return basicPay;
	}

	public void setBasicPay(double basicPay) {
		this.basicPay = basicPay;
	}

	public double getHra() {
		return hra;
	}

	public void setHra(double hra) {
		this.hra = hra;
	}

	public float getExperience() {
		return experience;
	}

	public void setExperience(float experience) {
		this.experience = experience;
	}
	
	public void calculateMonthlySalary() {
		if(this.experience < 3f) {
			super.setSalary(Math.round(basicPay + hra));
		} else if(this.experience >= 3 && this.experience < 5) {
			super.setSalary(Math.round(basicPay + basicPay*0.05 + hra));
		} else if(this.experience >= 5 && this.experience < 10) {
			super.setSalary(Math.round(basicPay + basicPay*0.07 + hra));
		} else {
			super.setSalary(Math.round(basicPay + basicPay * 0.10 + hra));
		}
	}
	
	public String toString(){
        return "PermanentEmployee\nemployeeId: "+this.getEmployeeId()+"\nemployeeName: "+this.getEmployeeName()+"\nsalary: "+this.getSalary()+"\nbasicPay: "+this.getBasicPay()+"\nhra: "+this.getHra()+"\nexperience: "+this.getExperience();
    }
	
}
