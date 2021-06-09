package com.gmail.christian741.Main.entity;

import java.time.LocalDate;


import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.OneToMany;
import javax.persistence.Table;

@Entity
@Table(name = "users")
public class User {


	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Integer id;
	
	@Column(name = "email", length = 50 , nullable = false)
	private String email;
	
	@Column(name = "email_verified", nullable = false)
	private Boolean emailVerified;
	
	@Column(name = "password" , length = 20 , nullable = false)
	private String password;
	
	@Column(name = "cellphone",length = 10,nullable = false)
	private String cellphone;
	
	@Column(name = "created_date",nullable = true)
	private LocalDate createdDate;
	
	@Column(name = "last_modify",nullable = true)
	private LocalDate lastModify;
	
	@Column(name = "session",nullable = true)
	private String session;
	
	@Column(name = "permission",nullable = true)
	private int permission;

	
	
	public Integer getId() {
		return id;
	}

	public void setId(Integer id) {
		this.id = id;
	}

	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}

	public Boolean getEmailVerified() {
		return emailVerified;
	}

	public void setEmailVerified(Boolean emailVerified) {
		this.emailVerified = emailVerified;
	}

	public String getPassword() {
		return password;
	}

	public void setPassword(String password) {
		this.password = password;
	}

	public String getCellphone() {
		return cellphone;
	}

	public void setCellphone(String cellphone) {
		this.cellphone = cellphone;
	}

	public LocalDate getCreatedDate() {
		return createdDate;
	}

	public void setCreatedDate(LocalDate createdDate) {
		this.createdDate = createdDate;
	}

	public LocalDate getLastModify() {
		return lastModify;
	}

	public void setLastModify(LocalDate lastModify) {
		this.lastModify = lastModify;
	}

	public String getSession() {
		return session;
	}

	public void setSession(String session) {
		session = session;
	}

	public int getPermission() {
		return permission;
	}

	public void setPermission(int permission) {
		this.permission = permission;
	}
}
