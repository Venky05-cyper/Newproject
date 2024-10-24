package com.example.NewProject.Entity;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.Table;

@Entity
//@Table(name = "new_entity")
public class newEntity {

	@Id
//	@GeneratedValue(strategy = GenerationType.IDENTITY)
	
	private long newid;
	private String name;
	private String password;
	private String email;
	public long getNewid() {
		return newid;
	}
 public void setNewid(long newid) {
    this.newid = newid; // Use newid in the setter
}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getPassword() {
		return password;
	}
	public void setPassword(String password) {
		this.password = password;
	}
	public String getEmail() {
		return email;
	}
	public void setEmail(String email) {
		this.email = email;
	}
	
	
}
