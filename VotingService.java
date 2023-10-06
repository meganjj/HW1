import java.util.HashMap;
import java.util.Map.Entry;

public class VotingService {
	private Question question;
	private HashMap<String, String> studentSubmissions;

	public VotingService(Question question) {
		this.question = question;
		this.studentSubmissions = new HashMap<>();
	}

	public void submitAnswers(Student student, String answer) {
		student.submitAnswer(answer);
		studentSubmissions.put(student.getStudentId(), student.getStudentAnswer());
	}

	public void displayResults() {
		HashMap<String, Integer> resultCount = new HashMap<>();

		//Add answer choices to map
		for (String key : question.getAnswerChoices()) {
			resultCount.put(key, 0);
		}

		for (String answer : studentSubmissions.values()) {
			if (resultCount.containsKey(answer)) {
				resultCount.put(answer, resultCount.get(answer) + 1);
			}
			else {
				resultCount.put(answer, 1);
			}
		}

		//Print student answers
		System.out.println("ID      ANSWER");
		for (Entry<String, String> entry : studentSubmissions.entrySet()) {
			System.out.println(entry.getKey() + ": " + entry.getValue());
		}

		System.out.println();

		//Print results
		System.out.println("RESULTS:");
		for (Entry<String, Integer> entry : resultCount.entrySet()) {
			System.out.println(entry.getKey() + ": " + entry.getValue());
		}
	}
}
