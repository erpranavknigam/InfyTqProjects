package infyTqProjectFourteen;

public class Student {
	private final int STIPEND = 100;
	private int studentId;
	private int aggregateMarks;
	
	public double calculateTotalStipend() {
		if(aggregateMarks >= 95 && aggregateMarks <= 100) {
			return STIPEND + 20;
		} else if(aggregateMarks >= 90 && aggregateMarks < 95) {
			return STIPEND + 15;
		} else if(aggregateMarks >= 85 && aggregateMarks <= 90) {
			return STIPEND + 10;
		}
		return STIPEND;
	}
	public int getStudentId() {
		return studentId;
	}
	public void setStudentId(int studentId) {
		this.studentId = studentId;
	}
	public int getAggregateMarks() {
		return aggregateMarks;
	}
	public void setAggregateMarks(int aggregateMarks) {
		this.aggregateMarks = aggregateMarks;
	}
	public int getSTIPEND() {
		return STIPEND;
	}
	
	
}
