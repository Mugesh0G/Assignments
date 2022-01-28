package com.Classes;

import java.util.Map;
import java.util.Set;

public class Qualify {
	double tenth;
	String twelveth;
	Map<String, Double> Bachelor;
	public double getTenth() {
		return tenth;
	}
	public void setTenth(double tenth) {
		this.tenth = tenth;
	}
	public String getTwelveth() {
		return twelveth;
	}
	public void setTwelveth(String twelveth) {
		this.twelveth = twelveth;
	}
	public Map<String, Double> getBachelor() {
		return Bachelor;
	}
	public void setBachelor(Map<String, Double> bachelor) {
		Bachelor = bachelor;
	}
	@Override
	public String toString() {
		return "Qualify [tenth=" + tenth + ", twelveth=" + twelveth + ", Bachelor=" + Bachelor + "]";
	}
	public Qualify(double tenth, String twelveth, Map<String, Double> bachelor) {
		super();
		this.tenth = tenth;
		this.twelveth = twelveth;
		Bachelor = bachelor;
	}
	public Qualify() {
		super();
		// TODO Auto-generated constructor stub
	}
	

	

}
