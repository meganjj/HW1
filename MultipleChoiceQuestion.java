import java.util.ArrayList;
import java.util.Arrays;

public class MultipleChoiceQuestion extends Question{
	private String type;
	private ArrayList<String> answerChoices;

	public MultipleChoiceQuestion() {
		type = "multiple";
		answerChoices = new ArrayList<String>(Arrays.asList("a", "b", "c", "d"));
	}

	public String getType() {
		return type;
	}

	public ArrayList<String> getAnswerChoices() {
		return answerChoices;
	}
}
