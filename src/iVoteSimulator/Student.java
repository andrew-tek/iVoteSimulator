package iVoteSimulator;

import java.util.ArrayList;
import java.util.List;


public class Student implements Participant {
	private String studentID;
	private List<Character> answer;
	public Student() {
		studentID = "";
		answer = new ArrayList<Character>();
	}
	public void addAnswer (char ans) {
		answer.add(ans);
	}
	public Student(String id) {
		studentID = id;
		answer = new ArrayList<Character>();
	}
	public String getStudentID() {
		return studentID;
	}
	public void setStudentID(String studentID) {
		this.studentID = studentID;
	}
	public List<Character> getAnswer() {
		return answer;
	}
	public void setAnswer(List<Character> answer) {
		this.answer = answer;
	}
	@Override
	public void submitAnswer(iVoteService voteService){
		voteService.getParticipants().add(this);
	}
}
