package infyTqProjectFifteen;

public class GraduateStudent extends Student {

	public GraduateStudent(String studentname) {
		super(studentname);
		// TODO Auto-generated constructor stub
	}
	
	public void generateResult() {
		int sum = 0;
		for(int i = 0; i < super.getTestScores().length; i++) {
			sum += super.getTestScores()[i];
		}
		double avg = (double)sum / (double)super.getTestScores().length;
		
		if(avg >= 70) {
			super.setTestResult("Pass");
		} else {
			super.setTestResult("Fail");
		}
	}
}
