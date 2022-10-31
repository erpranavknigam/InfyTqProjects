package infyTqProjectEighteen;

public class Event {
	private String eventName;
	private String participantName;
	private double registrationFee;
	
	
	public Event(String eventName, String participantName) {
		this.eventName = eventName;
		this.participantName = participantName;
	}
	
	public void registerEvent() {
		if("Singing".equals(getEventName())) {
			setRegistrationFee(8);
		} else if("Dancing".equals(getEventName())) {
			setRegistrationFee(10);
		} else if("DigitalArt".equals(getEventName())) {
			setRegistrationFee(12);
		} else if("Acting".equals(getEventName())) {
			setRegistrationFee(15);
		} else {
			setRegistrationFee(0);
		}
	}
	
	public String getEventName() {
		return eventName;
	}
	public void setEventName(String eventName) {
		this.eventName = eventName;
	}
	public String getParticipantName() {
		return participantName;
	}
	public void setParticipantName(String participantName) {
		this.participantName = participantName;
	}
	public double getRegistrationFee() {
		return registrationFee;
	}
	public void setRegistrationFee(double registrationFee) {
		this.registrationFee = registrationFee;
	}
	
	
}
