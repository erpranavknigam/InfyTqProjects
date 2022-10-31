package infyTqProjectEleven;

public class Bill {
	public double findPrice(int itemId) {
		if(itemId == 1001)
			return 25;
		if(itemId == 1002)
			return 20;
		if(itemId == 1003)
			return 23;
		if(itemId == 1004)
			return 18;
		return 0;
	}
	
	public double findPrice(String brandName, String itemType, int size) {
		if(brandName.equals("Puma")) {
			if(itemType.equals("T-shirt")) {
				if(size == 34 || size == 36) {
					return 25;
				}
			}
			else if(itemType.equals("Skirt")) {
				if(size == 38 || size == 40) {
					return 20;
				}
			}
		}
		else if(brandName.equals("Reebok")) {
			if(itemType.equals("T-shirt")) {
				if(size == 34 || size == 36) {
					return 23;
				}
			}
			else if(itemType.equals("Skirt")) {
				if(size == 38 || size == 40) {
					return 18;
				}
			}
		}
		return 0;
	}
	
}
