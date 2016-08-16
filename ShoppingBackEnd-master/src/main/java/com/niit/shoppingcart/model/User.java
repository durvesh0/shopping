package com.niit.shoppingcart.model;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

import org.springframework.stereotype.Component;

@Entity
@Table(name = "USER")
@Component
public class User {

	private String id;
	private String name;
	private String add;
	private String mob;
	private String email;
	private String password;
	
	@Column(name="admin",columnDefinition ="tinyint deafault 1")
	private byte admin=0;
	
	@Id
	@Column(name="id")
	public String getId() {
		return id;
	}

	public void setId(String id) {
		this.id = id;
	}
	
	@Column(name="name")
	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	@Column(name="add")
	public String getAdd() {
		return add;
	}

	public void setAdd(String add) {
		this.add = add;
	}

	@Column(name="mob")
	public String getMob() {
		return mob;
	}

	public void setMob(String mob) {
		this.mob = mob;
	}

	@Column(name="email")
	public String getEmail() {
	return email;
	}
	

	public void setEmail(String email) {
		this.email = email;
	}

	@Column(name="password")
	public String getPassword() {
		return password;
	}

	public void setPassword(String password) {
		this.password = password;
	}

	@Column(name="admin")
	public byte getAdmin() {
		return admin;
	}

	public void setAdmin(byte admin){
		this.admin = admin;
	}
}
