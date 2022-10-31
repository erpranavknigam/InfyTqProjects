package infyTqProjectFifteen;

public abstract class Student {
	private String studentName;
	private int[] testScores = new int[4];
	private String testResult;
	
	public Student(String studentname) {
		this.studentName = studentname;
	}

	public String getStudentName() {
		return studentName;
	}

	public void setStudentName(String studentName) {
		this.studentName = studentName;
	}

	public int[] getTestScores() {
		return testScores;
	}

	public void setTestScore(int testNumber, int testScores) {
		this.testScores[testNumber] = testScores;
	}

	public String getTestResult() {
		return testResult;
	}

	public void setTestResult(String testResult) {
		this.testResult = testResult;
	}
	
	abstract void generateResult();
}
