package com.aptech.common.entity;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Table;

@Entity
@Table(name = "contact")
public class Contact extends IdBasedEntity {
	
	@Column(length = 45)
	private String name;
	@Column(length = 15)
	private String phone;
	@Column(length = 45)
	private String email;
	@Column(length = 64)
	private String address;
	@Column(length = 4096)
	private String message;
	
	public Contact() {
		super();
	}

	public Contact(String name, String phone, String email, String address, String message) {
		super();
		this.name = name;
		this.phone = phone;
		this.email = email;
		this.address = address;
		this.message = message;
	}

	public Contact(Integer id) {
		this.id = id;


	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}


	public String getPhone() {
		return phone;
	}

	public void setPhone(String phone) {
		this.phone = phone;
	}

	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}

	public String getAddress() {
		return address;
	}

	public void setAddress(String address) {
		this.address = address;
	}

	public String getMessage() {
		return message;
	}

	public void setMessage(String message) {
		this.message = message;
	}
	
}
