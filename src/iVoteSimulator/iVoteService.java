package iVoteSimulator;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Set;


public class iVoteService {
	private Question question;
	private List<Participant> participants;
	private int [] answers;
	
	public iVoteService(Question q) {
		question = q;
		participants = new ArrayList<Participant>();
		answers = new int [q.getNumberOfAnswer()];
	}
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
		Set<String> studentsSet = new HashSet<String>();
		for (int i = participants.size() - 1; i >= 0; i--) {
			String id = participants.get(i).getId();
			if (!studentsSet.contains(id)) {
				studentsSet.add(id);
				for (int j = 0; j < question.getNumberOfAnswer(); j++) {
					if (participants.get(i).getAnswer().get(j) != null) {
						System.out.println(participants.get(i).getAnswer().get(j));
						answers[participants.get(i).getAnswer().get(j)]++;
					}
				}
			}
		}
		for (int i = 0; i < answers.length; i++) {
			System.out.println(i + ": " + answers[i]);
		}
	}

}
