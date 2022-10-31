package infyTqProjectSeventeen;

public class Teacher extends Faculty{
	private String qualification;

	public Teacher(String name, float basicSalary, String qualification) {
		super(name, basicSalary);
		this.qualification = qualification;
	}
	
	public double calculateSalary() {
		if("Doctoral".equals(getQualification())) {
			return super.calculateSalary()+ 20000.0;
		} else if("Masters".equals(getQualification())) {
			return super.calculateSalary() + 18000.0;
		} else if("Bachelors".equals(getQualification())) {
			return super.calculateSalary()+ 15500.0;
		} else if("Associate".equals(getQualification())){
			return super.calculateSalary() + 10000.0;
		}
		return super.calculateSalary();
	}
	public String getQualification() {
		return qualification;
	}

	public void setQualification(String qualification) {
		this.qualification = qualification;
	}
	
	
	
}
