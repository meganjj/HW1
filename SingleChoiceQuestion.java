import java.util.ArrayList;
import java.util.Arrays;
import java.util.Random;

public class SingleChoiceQuestion extends Question{
	private String type;
	private ArrayList<String> answerChoices;

	public SingleChoiceQuestion() {
		type = "single";
		Random rand = new Random();
		if (rand.nextInt(2) == 0) {
			answerChoices = new ArrayList<>(Arrays.asList("a", "b", "c", "d"));
		}
		else {
			answerChoices = new ArrayList<>(Arrays.asList("true", "false"));
		}
	}

	public String getType() {
		return type;
	}

	public ArrayList<String> getAnswerChoices() {
		return answerChoices;
	}

}
