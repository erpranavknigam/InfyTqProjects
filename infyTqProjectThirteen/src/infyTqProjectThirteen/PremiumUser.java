package infyTqProjectThirteen;

public class PremiumUser extends User{
	private int rewardPoints = 0;

	public PremiumUser(int id, String userName, String emailId, double walletBalance) {
		super(id, userName, emailId, walletBalance);
	}

	public int getRewardPoints() {
		return rewardPoints;
	}

	public void setRewardPoints(int rewardPoints) {
		this.rewardPoints = rewardPoints;
	}
	
	public boolean makePayment(double billAmount) {
		if(billAmount <= super.getWalletBalance()) {
			rewardPoints += (int) (billAmount * 0.1);
			super.setWalletBalance(super.getWalletBalance() - billAmount);
			return true;
		}
		return false;
	}
}
