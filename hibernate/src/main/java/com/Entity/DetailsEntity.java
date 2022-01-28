package com.Entity;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name="StudentDetails")
public class DetailsEntity {
	
	
	@Id
	@GeneratedValue(strategy=GenerationType.IDENTITY)
	int idNo;
	@Column
	String Name;
	@Column
	String Email;
	
	


	@Override
	public String toString() {
		return "DetailsEntity [idNo=" + idNo + ", Name=" + Name + ", Email=" + Email + "]";
	}


	public DetailsEntity() {
		super();
		// TODO Auto-generated constructor stub
	}


	public int getIdNo() {
		return idNo;
	}


	public void setIdNo(int idNo) {
		this.idNo = idNo;
	}


	public String getName() {
		return Name;
	}


	public void setName(String name) {
		Name = name;
	}


	public String getEmail() {
		return Email;
	}


	public void setEmail(String email) {
		Email = email;
	}


	public static void main(String[] args) {
		

	}

}
