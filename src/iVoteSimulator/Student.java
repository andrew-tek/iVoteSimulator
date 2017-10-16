package iVoteSimulator;

import java.util.ArrayList;
import java.util.List;


public class Student implements Participant {
	private String studentID;
	private List<String> answer;
	public Student() {
		studentID = "";
		answer = new ArrayList<String>();
	}
	public void addAnswer (String ans) {
		answer.add(ans);
	}
	public Student(String id) {
		studentID = id;
		answer = new ArrayList<String>();
	}
	public String getId() {
		return studentID;
	}
	public void setStudentID(String studentID) {
		this.studentID = studentID;
	}
	@Override
	public List<String> getAnswer() {
		return answer;
	}
	public void setAnswer(List<String> answer) {
		this.answer = answer;
	}
	@Override
	public void submitAnswer(iVoteService voteService){
		voteService.getParticipants().add(this);
	}
}
