package infyTqProjectEighteen;

public class TeamEvent extends Event{
	private int noOfParticipant;
	private int teamNo;
	public TeamEvent(String eventName, String participantName, int noOfParticipant, int teamNo) {
		super(eventName, participantName);
		this.noOfParticipant = noOfParticipant;
		this.teamNo = teamNo;
	}
	
	public void registerEvent() {
		if("Singing".equals(getEventName())) {
			setRegistrationFee(8 * noOfParticipant);
		} else if("Dancing".equals(getEventName())) {
			setRegistrationFee(10 * noOfParticipant);
		} else if("DigitalArt".equals(getEventName())) {
			setRegistrationFee(12 * noOfParticipant);
		} else if("Acting".equals(getEventName())) {
			setRegistrationFee(15 * noOfParticipant);
		} else {
			setRegistrationFee(0);
		}
	}
	public int getNoOfParticipant() {
		return noOfParticipant;
	}
	public void setNoOfParticipant(int noOfParticipant) {
		this.noOfParticipant = noOfParticipant;
	}
	public int getTeamNo() {
		return teamNo;
	}
	public void setTeamNo(int teamNo) {
		this.teamNo = teamNo;
	}
	
	
	
	
}
