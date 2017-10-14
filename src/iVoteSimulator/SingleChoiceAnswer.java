package iVoteSimulator;

import java.util.ArrayList;

public class SingleChoiceAnswer extends Question {

	public SingleChoiceAnswer() {
		answers = new ArrayList<String>();
	}
	@Override
	public int getNumberOfAnswer() {
		int number = 1;
		return number;
	}

}
