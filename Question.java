import java.util.ArrayList;
import java.util.Arrays;

public class Question {
	private String type;
	private ArrayList<String> answerChoices;

	public Question() {
		answerChoices = new ArrayList<>();
	}

	public String getType() {
		return type;
	}

	public ArrayList<String> getAnswerChoices() {
		return answerChoices;
	} 
}
