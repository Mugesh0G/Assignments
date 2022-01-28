package com.Classes;

public class Address 
{
String city;
String district;
String state;

public String getCity() {
	return city;
}
public void setCity(String city) {
	this.city = city;
}
public String getDistrict() {
	return district;
}
public void setDistrict(String district) {
	this.district = district;
}
public String getState() {
	return state;
}
public void setState(String state) {
	this.state = state;
}
@Override
public String toString() {
	return "Address [city=" + city + ", district=" + district + ", state=" + state + "]";
}
public Address(String city, String district, String state) {
	super();
	this.city = city;
	this.district = district;
	this.state = state;
}
public Address() {
	super();
	// TODO Auto-generated constructor stub
}


}
