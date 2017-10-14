package iVoteSimulator;

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
		Student student = new Student("1");
		iVoteService voteService = new iVoteService(question);
		student.addAnswer('1');
		student.submitAnswer(voteService);
		student.submitAnswer(voteService);
		student = new Student("2");
		student.addAnswer('2');
		student.submitAnswer(voteService);
		System.out.println(voteService.getParticipants().get(0).getAnswer().get(0));
		System.out.println(voteService.getParticipants().get(1).getAnswer().get(0));
		System.out.println(voteService.getParticipants().get(2).getAnswer().get(0));
		voteService.getStats();

		
	}

}
