package iVoteSimulator;

import java.util.ArrayList;

public class MultipleChoiceAnswer extends Question{
	public MultipleChoiceAnswer() {
		answers = new ArrayList<String>();
	}
	@Override
	public int getNumberOfAnswer() {
		return this.getAnswers().size();
	}



}
