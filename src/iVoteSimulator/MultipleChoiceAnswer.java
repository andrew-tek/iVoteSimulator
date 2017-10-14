package iVoteSimulator;

public class MultipleChoiceAnswer extends Question{

	@Override
	public int getNumberOfAnswer() {
		return this.getAnswers().size();
	}



}
