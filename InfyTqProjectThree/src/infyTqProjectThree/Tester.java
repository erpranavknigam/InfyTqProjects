package infyTqProjectThree;

public class Tester {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		CabServiceProvider cabServiceProvider1 = new CabServiceProvider("Halo", 50);
		CabServiceProvider cabServiceProvider2 = new CabServiceProvider("Aber", 50);
		
		Driver driver1 = new Driver("Luke", 4.8f);
		Driver driver2 = new Driver("Mark", 4.2f);
		Driver driver3 = new Driver("David", 3.9f);
		Driver driver4 = new Driver("Luke", 4.9f);
		Driver driver5 = new Driver("Tom", 4.6f);
		Driver driver6 = new Driver("David", 4.4f);
		Driver driver7 = new Driver("John", 4.85f);
		Driver driver8 = new Driver("Selvestor", 4.1f);
		
		
		Driver[] driversList1 = { driver1, driver2, driver3 };
		for (Driver driver : driversList1) {
			System.out.println("Driver Name: "+driver.getDriverName());
			double bonus = cabServiceProvider1.calculateRewardPrice(driver);
			if (bonus>0)
				System.out.println("Bonus: $"+bonus+"\n");
			else
				System.out.println("Sorry, bonus is not available!");
		}
		
		Driver[] driverList2 = {driver4, driver5, driver6, driver7, driver8};
		for(Driver driver: driverList2) {
			System.out.println("Driver Name: "+driver.getDriverName());
			double bonus = cabServiceProvider1.calculateRewardPrice(driver);
			if (bonus>0)
				System.out.println("Bonus: $"+bonus+"\n");
			else
				System.out.println("Sorry, bonus is not available!");
		}
		
	}

}
