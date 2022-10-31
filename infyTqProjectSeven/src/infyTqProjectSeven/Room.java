package infyTqProjectSeven;

public class Room {
	private int roomNo;
	private int capacity;
	private static int roomCounter;
	
	static {
		roomCounter = 0;
	}

	public Room() {
		if(getCapacity() == 0) {
			Room.roomCounter++;
		}
		this.roomNo = 500 + Room.roomCounter++;
	}

	public int getRoomNo() {
		return roomNo;
	}

	public void setRoomNo(int roomNo) {
		this.roomNo = roomNo;
	}

	public int getCapacity() {
		return capacity;
	}

	public void setCapacity(int capacity) {
		this.capacity = capacity;
	}

	public static int getRoomCounter() {
		return roomCounter;
	}

	public static void setRoomCounter(int roomCounter) {
		Room.roomCounter = roomCounter;
	}
	
	public String toString(){
        return "Room\nroomNo: "+this.roomNo+"\ncapacity: "+this.capacity;
	}
}
