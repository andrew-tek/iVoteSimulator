package iVoteSimulator;

import java.util.Random;


public class SimulationDriver {

	public static void main(String[] args) {
		Question singleChoiceQuestion = new SingleChoiceAnswer();
		int id = 1;
		singleChoiceQuestion.setQuestion("What is your favorite number?");
		singleChoiceQuestion.addPossibleAnswer("one");
		singleChoiceQuestion.addPossibleAnswer("two");
		singleChoiceQuestion.addPossibleAnswer("three");
		singleChoiceQuestion.addPossibleAnswer("four");
		singleChoiceQuestion.addPossibleAnswer("five");
		singleChoiceQuestion.addPossibleAnswer("six");
		singleChoiceQuestion.addPossibleAnswer("seven");
		singleChoiceQuestion.addPossibleAnswer("eight");
		System.out.println(singleChoiceQuestion.toString());
		Random random = new Random();
		int numberOfStudent = random.nextInt(50) + 30;
		System.out.println(numberOfStudent);
		System.out.println("Number of students: " + numberOfStudent);
		iVoteService voteService = new iVoteService(singleChoiceQuestion);
		for (int i = 0; i < numberOfStudent; i++) {
			Student student = new Student(Integer.toString(i));
			int studentAnswer = random.nextInt(singleChoiceQuestion.getAnswers().size());
			student.addAnswer(Integer.toString(studentAnswer));
			student.submitAnswer(voteService);
		}
		System.out.println("Single Choice Questions Statistics");
		voteService.getStats();

		System.out.println("onto the next one");
		
		Question multipleChoiceQuestion = new MultipleChoiceAnswer();
		id = 1;
		multipleChoiceQuestion.setQuestion("What numbers do you like?");
		multipleChoiceQuestion.addPossibleAnswer("one");
		multipleChoiceQuestion.addPossibleAnswer("two");
		multipleChoiceQuestion.addPossibleAnswer("three");
		multipleChoiceQuestion.addPossibleAnswer("four");
		multipleChoiceQuestion.addPossibleAnswer("five");
		multipleChoiceQuestion.addPossibleAnswer("six");
		multipleChoiceQuestion.addPossibleAnswer("seven");
		multipleChoiceQuestion.addPossibleAnswer("eight");
		System.out.println(multipleChoiceQuestion.toString());
		numberOfStudent = random.nextInt(50) + 30;
		System.out.println(numberOfStudent);
		System.out.println("Number of students: " + numberOfStudent);
		iVoteService voteService2 = new iVoteService(multipleChoiceQuestion);
		for (int i = 0; i < numberOfStudent; i++) {
			Student student = new Student(Integer.toString(i));
			int randomAnswerNumber = random.nextInt(multipleChoiceQuestion.getAnswers().size());
			for (int j = 0; j < randomAnswerNumber; j++) {
				int studentAnswer = random.nextInt(multipleChoiceQuestion.getAnswers().size());
				student.addAnswer(Integer.toString(studentAnswer));
			}
			
			student.submitAnswer(voteService2);
		}
		System.out.println("Multiple Choice Questions Statistics");
		voteService2.getStats();
		
	}

}
