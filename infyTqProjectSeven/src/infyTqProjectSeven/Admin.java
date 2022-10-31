package infyTqProjectSeven;

public class Admin {
	public void assignRoom(Room[] rooms, Member member) {
		for(Room i : rooms) {
			if(i.getCapacity() > 0) {
				member.setRoom(i);
				i.setCapacity(i.getCapacity() - 1);
			}
		}
	}
}
