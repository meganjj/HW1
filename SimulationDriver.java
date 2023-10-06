import java.util.ArrayList;
import java.util.Arrays;
import java.util.Random;

public class SimulationDriver {
	public static void main(String args[]) {
		//Create question
		Question question = new SingleChoiceQuestion();
		System.out.println(question.getType());

		//Configure question for VotingService
		VotingService votingService = new VotingService(question);

		//Randomly generate a number of students and answers
		Random rand = new Random();
		ArrayList<Student> studentList = new ArrayList<>();
		String alphaNumeric = "ABCDEFGHIJKLMNOPQRSTUVWXYZabcdefghijklmnopqrstuvwxyz0123456789";
		StringBuilder sb = new StringBuilder();
		for (int i = 0; i < rand.nextInt(20) + 1; i++) {
			for(int j = 0; j < 6; j++) {
				// generate random index number
				int index = rand.nextInt(alphaNumeric.length());
			  
				// get character specified by index
				// from the string
				char randomChar = alphaNumeric.charAt(index);
			  
				// append the character to string builder
				sb.append(randomChar);
			}
			studentList.add(new Student(sb.toString()));
			sb.setLength(0);
		}

		//Generate random answers from students
		for (int i = 0; i < studentList.size(); i++) {
			String answer = question.getAnswerChoices().get(rand.nextInt(question.getAnswerChoices().size()));
			studentList.get(i).submitAnswer(answer); 
		}

		//Submit answers to voting service
		for (Student student : studentList) {
			votingService.submitAnswers(student, student.getStudentAnswer());
		}	

		//Display results
		votingService.displayResults();
	}
}
