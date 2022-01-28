package com.tables;

import java.util.ArrayList;
import java.util.List;

import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.OneToMany;
import javax.persistence.OneToOne;

@Entity
public class Answer {

	@Id
	int Aid;
	String ans;
	
	@OneToOne(mappedBy="ans")
	Question ques;

	public Question getQues() {
		return ques;
	}

	public void setQues(Question ques) {
		this.ques = ques;
	}
	
	
	@Override
	public String toString() {
		return "Answer [Aid=" + Aid + ", ans=" + ans + "]";
	}

	public int getAid() {
		return Aid;
	}

	public void setAid(int aid) {
		Aid = aid;
	}

	public String getAns() {
		return ans;
	}

	public void setAns(String ans) {
		this.ans = ans;
	}

}
