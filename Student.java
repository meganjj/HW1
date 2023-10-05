public class Student {
	private String studentId;
	private String answer;

	public Student(String id) {
		studentId = id;
		answer = " ";
	}

	public String getStudentId() {
		return studentId;
	}

	public String getStudentAnswer() {
		return answer;
	}

	public void submitAnswer(String answer) {
		this.answer = answer;
	}
}