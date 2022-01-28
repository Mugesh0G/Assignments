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
public class Bikes {
	@Id
	int bikeId;
	@Column
	int releaseYear;
	@Column
	String bikeName;

	@ManyToOne
	User user;
	
	
	
	public User getUser() {
		return user;
	}

	public void setUser(User user) {
		this.user = user;
	}

	public int getBikeId() {
		return bikeId;
	}

	public void setBikeId(int bikeId) {
		this.bikeId = bikeId;
	}

	public int getReleaseYear() {
		return releaseYear;
	}

	public void setReleaseYear(int releaseYear) {
		this.releaseYear = releaseYear;
	}

	public String getBikeName() {
		return bikeName;
	}

	public void setBikeName(String bikeName) {
		this.bikeName = bikeName;
	}

	@Override
	public String toString() {
		return "Bikes [bikeId=" + bikeId + ", releaseYear=" + releaseYear + ", bikeName=" + bikeName + "]";
	}

	public Bikes(int bikeId, int releaseYear, String bikeName) {
		super();
		this.bikeId = bikeId;
		this.releaseYear = releaseYear;
		this.bikeName = bikeName;
	}

	public Bikes() {
		super();
		// TODO Auto-generated constructor stub
	}

}
