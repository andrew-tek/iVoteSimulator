package iVoteSimulator;
import java.util.List;


public abstract class Question {
	private String question;
	protected List <String> answers;
	
	public abstract int getNumberOfAnswer();
	
	void addPossibleAnswer(String answer) {
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
	@Override
	public String toString() {
		StringBuilder str = new StringBuilder();
		str.append(question + "\n");
		for (int i = 0; i < answers.size(); i++) {
			str.append((i + 1) + ". " + answers.get(i) + "\n");
		}
		
		return str.toString();
	}
}
