package com.Classes;

import java.util.List;

import javax.annotation.PostConstruct;
import javax.annotation.PreDestroy;

import org.springframework.beans.factory.DisposableBean;
import org.springframework.beans.factory.InitializingBean;

public class Details //implements  InitializingBean,DisposableBean
{

	int id;
	String name;
	String mobNo;
	Address address;
	public Details(Address address) {
		super();
		this.address = address;
	}
	List hobby;
	
	public Details(int id, String name, String mobNo, Address address, List hobby) {
		super();
		this.id = id;
		this.name = name;
		this.mobNo = mobNo;
		this.address = address;
		this.hobby = hobby;
	}

	@Override
	public String toString() {
		return "Details [id=" + id + ", name=" + name + ", mobNo=" + mobNo + ", address=" + address + ", hobby=" + hobby
				+ "]";
	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getMobNo() {
		return mobNo;
	}

	public void setMobNo(String mobNo) {
		this.mobNo = mobNo;
	}

	public Address getAddress() {
		return address;
	}

	public void setAddress(Address address) {
		this.address = address;
	}

	public List getHobby() {
		return hobby;
	}

	public void setHobby(List hobby) {
		this.hobby = hobby;
	}

	public Details() {
		super();
		// TODO Auto-generated constructor stub
	}
//	private void ini() {
//		// TODO Auto-generated method stub
//		System.out.println("initial method call");
//
//	}
//	private void des() {
//		// TODO Auto-generated method stub
//		System.out.println("Destroy method call");
//
//	}

//	public void destroy() throws Exception {
//		// TODO Auto-generated method stub
//		System.out.println("2");
//		
//	}
//
//	public void afterPropertiesSet() throws Exception {
//		// TODO Auto-generated method stub
//		System.out.println("1");
//		
//	}
	@PostConstruct
	private void start()
	{
		System.out.println("init");
	}
	@PreDestroy
	private void end()
	{
		System.out.println("desc");
	}
	
}
