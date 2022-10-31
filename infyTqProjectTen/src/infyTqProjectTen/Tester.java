package infyTqProjectTen;

public class Tester {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		PermanentEmployee permanentEmployee = new PermanentEmployee(711211, "Rafael", 1855, 115, 3.5f);
	    permanentEmployee.calculateMonthlySalary();
	    System.out.println("Hi "+permanentEmployee.getEmployeeName()+", your salary is $"+permanentEmployee.getSalary());
	            
	    ContractEmployee contractEmployee = new ContractEmployee(102, "Jennifer", 16, 90);
	    contractEmployee.calculateSalary();
	    System.out.println("Hi "+contractEmployee.getEmployeeName()+", your salary is $"+contractEmployee.getSalary());
	      
	    PermanentEmployee permanentEmployee2 = new PermanentEmployee(112112, "Jobin", 1650.0, 125.0, 3.01f);
	    permanentEmployee2.calculateMonthlySalary();
	    System.out.println("Hi "+permanentEmployee2.getEmployeeName()+", your salary is $"+permanentEmployee2.getSalary());
	    
	    PermanentEmployee permanentEmployee3 = new PermanentEmployee(112112, "Jobin", 1999.0, 145.0, 3.0f);
	    permanentEmployee3.calculateMonthlySalary();
	    System.out.println("Hi "+permanentEmployee3.getEmployeeName()+", your salary is $"+permanentEmployee3.getSalary());
	    
	    PermanentEmployee permanentEmployee4 = new PermanentEmployee(112112, "Jobin", 1650.0, 125.0, 3.01f);
	    permanentEmployee4.calculateMonthlySalary();
	    System.out.println("Hi "+permanentEmployee4.getEmployeeName()+", your salary is $"+permanentEmployee4.getSalary());
	
	}

}
