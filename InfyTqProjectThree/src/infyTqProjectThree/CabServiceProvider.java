package infyTqProjectThree;

public class CabServiceProvider {
	private String cabServiceName;
	private int totalCabs;
	public double reward;
	
	public CabServiceProvider(String cabServiceName, int totalCabs) {
		this.cabServiceName = cabServiceName;
		this.totalCabs = totalCabs;
	}
	
	public void setCabServiceName(String cabServiceName) {
		this.cabServiceName = cabServiceName;
	}
	
	public void setTotalCabs(int totalCabs) {
		this.totalCabs = totalCabs;
	}
	
	public String getCabServiceName() {
		return cabServiceName;
	}
	
	public int getTotalCabs() {
		return totalCabs;
	}
	
	
	
	public double calculateRewardPrice(Driver driver) {
		String cabService = this.getCabServiceName();
		if(cabService.equals("Halo")){
			if(driver.getAverageRating() >= 4.5 && driver.getAverageRating() <= 5) {
				reward = 10*(driver.getAverageRating());
			} else if(driver.getAverageRating() >= 4 && driver.getAverageRating() < 4.5) {
				reward = 5*(driver.getAverageRating());
			} else {
				return reward = 0;
			}
		}
		
		else if(cabService.equals("Aber")){
			if(driver.getAverageRating() >= 4.5 && driver.getAverageRating() <= 5) {
				reward = 8*(driver.getAverageRating());
			}else if(driver.getAverageRating() >= 4 && driver.getAverageRating() < 4.5) {
				reward = 3*(driver.getAverageRating());
			} else {
				return reward = 0;
			}	
		}
		
		return reward;
	}
	
}
