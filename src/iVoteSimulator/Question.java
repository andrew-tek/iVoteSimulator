package iVoteSimulator;

import java.util.List;

public abstract class Question {
	private String question;
	private List <String> answers;
	
	public abstract int getNumberOfAnswer();
	
	private void addPossibleAnswer(String answer) {
		answers.add(answer);
	}
	public String getQuestion() {
		return question;
	}
	public void setQuestion(String question) {
		this.question = question;
	}
	public List<String> getAnswers() {
		return answers;
	}
	public void setAnswers(List<String> answers) {
		this.answers = answers;
	}
}
