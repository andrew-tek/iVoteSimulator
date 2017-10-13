package iVoteSimulator;

import java.util.List;

public class iVoteService {
	private Question question;
	private List<Participant> participants;
	private int [] answers;
	
	public Question getQuestion() {
		return question;
	}

	public void setQuestion(Question question) {
		this.question = question;
	}

	public List<Participant> getParticipants() {
		return participants;
	}

	public void setParticipants(List<Participant> participants) {
		this.participants = participants;
	}

	public int[] getAnswers() {
		return answers;
	}

	public void setAnswers(int[] answers) {
		this.answers = answers;
	}

	void getStats() {
		
	}

}
