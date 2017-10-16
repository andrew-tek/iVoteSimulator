package iVoteSimulator;

import java.util.List;

public interface Participant {
	void submitAnswer(iVoteService voteService);
	String getId();
	public List<String> getAnswer();
}
