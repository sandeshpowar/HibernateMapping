package com.scp.hibernate.mapping;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.Table;
@Entity
@Table(name="ADDRESS")
public class Address {

	@Id
	@GeneratedValue
	@Column(name="address_id")
	private int aid;
	@Column(name="address_city")
	private String city;
	@Column(name="address_pin")
	private int pin;
	public Address(int aid, String city, int pin) {
		super();
		this.aid = aid;
		this.city = city;
		this.pin = pin;
	}
	public Address() {
		super();
		// TODO Auto-generated constructor stub
	}
	public int getAid() {
		return aid;
	}
	public void setAid(int aid) {
		this.aid = aid;
	}
	public String getCity() {
		return city;
	}
	public void setCity(String city) {
		this.city = city;
	}
	public int getPin() {
		return pin;
	}
	public void setPin(int pin) {
		this.pin = pin;
	}
	
	

}
