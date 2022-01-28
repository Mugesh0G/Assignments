package com.tables;

import java.util.ArrayList;
import java.util.List;

import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.JoinTable;
import javax.persistence.OneToMany;
import javax.persistence.OneToOne;
import javax.persistence.Table;

@Entity
public class Question {
	
	@Id
	int Qid;
	String question;
	
	@OneToOne
	Answer ans;

public Answer getAns() {
		return ans;
	}

	public void setAns(Answer ans) {
		this.ans = ans;
	}
	
	

	public Question() {
		super();
		// TODO Auto-generated constructor stub
	}

	public Question(int qid, String question) {
		super();
		Qid = qid;
		this.question = question;
	}

	@Override
	public String toString() {
		return "Question [Qid=" + Qid + ", question=" + question + "]";
	}

	public int getQid() {
		return Qid;
	}

	public void setQid(int qid) {
		Qid = qid;
	}

	public String getQuestion() {
		return question;
	}

	public void setQuestion(String question) {
		this.question = question;
	}
	
	

}
