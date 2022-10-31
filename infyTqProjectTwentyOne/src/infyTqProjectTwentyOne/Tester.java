package infyTqProjectTwentyOne;

public class Tester {
	public static void main(String args[]) {
		SmartPhone smartPhone = new SmartPhone("KrillinM20", "Nebula", "Saturn", "1.3", "5G");
		if(smartPhone.testCompatibility())
		    System.out.println("The mobile OS is compatible with the network generation!");
		else
		    System.out.println("The mobile OS is not compatible with the network generation!");
		
		SmartPhone smartPhone2 = new SmartPhone("FriezaA8", "Quasar", "Gara", "EXRT.1", "4G");
		if(smartPhone2.testCompatibility())
		    System.out.println("The mobile OS is compatible with the network generation!");
		else
		    System.out.println("The mobile OS is not compatible with the network generation!");
		
	}
}
