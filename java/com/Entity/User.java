package com.Entity;

import java.util.ArrayList;

import java.util.List;

import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToMany;
import javax.persistence.ManyToOne;
import javax.persistence.OneToMany;
import javax.persistence.OneToOne;

@Entity
public class User 
{
	@Id
	int useriId;
	@Column
	String username;
	
	@OneToMany
	List<Bikes> bike;
	

	public User() {
		super();
		// TODO Auto-generated constructor stub
	}
	public List<Bikes> getBike() {
		return bike;
	}
	public void setBike(List<Bikes> bike) {
		this.bike = bike;
	}
	public User(int useriId, String username) {
		super();
		this.useriId = useriId;
		this.username = username;
	}
	@Override
	public String toString() {
		return "User [useriId=" + useriId + ", username=" + username + "]";
	}
	public int getUseriId() {
		return useriId;
	}
	public void setUseriId(int useriId) {
		this.useriId = useriId;
	}
	public String getUsername() {
		return username;
	}
	public void setUsername(String username) {
		this.username = username;
	}
	


}
