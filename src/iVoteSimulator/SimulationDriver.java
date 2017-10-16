package iVoteSimulator;

import java.util.Random;

import javax.swing.text.StyledDocument;

public class SimulationDriver {

	public static void main(String[] args) {
		Question question = new SingleChoiceAnswer();
		int id = 1;
		question.setQuestion("What is your favorite number?");
		question.addPossibleAnswer("one");
		question.addPossibleAnswer("two");
		question.addPossibleAnswer("three");
		question.addPossibleAnswer("four");
		question.addPossibleAnswer("five");
		question.addPossibleAnswer("six");
		question.addPossibleAnswer("seven");
		question.addPossibleAnswer("eight");
		System.out.println(question.toString());
		Random random = new Random();
		int numberOfStudent = random.nextInt(50) + 30;
		System.out.println(numberOfStudent);
		System.out.println("Number of students: " + numberOfStudent);
		iVoteService voteService = new iVoteService(question);
		for (int i = 0; i < numberOfStudent; i++) {
			Student student = new Student(Integer.toString(i));
			int studentAnswer = random.nextInt(question.getAnswers().size());
			student.addAnswer(Integer.toString(studentAnswer));
			student.submitAnswer(voteService);
		}
		voteService.getStats();

		
	}

}
