package com.scp.hibernate.mapping;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.OneToOne;
import javax.persistence.Table;

@Entity
@Table(name="Student")
public class Student {
	
	@Id
	@GeneratedValue
	@Column(name="stud_id")
	private int id;
	@Column(name="stud_name")
	private String name;
	@OneToOne
	@JoinColumn(name="local_address")
	private Address ad;
	public Student(int id, String name, Address ad) {
		super();
		this.id = id;
		this.name = name;
		this.ad = ad;
	}
	public Student() {
		super();
		// TODO Auto-generated constructor stub
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
	public Address getAd() {
		return ad;
	}
	public void setAd(Address ad) {
		this.ad = ad;
	}
	

}
