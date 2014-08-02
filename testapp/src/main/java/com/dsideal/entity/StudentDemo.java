package com.dsideal.entity;

import java.io.Serializable;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;

import org.hibernate.annotations.GenericGenerator;
@Entity
public class StudentDemo implements Serializable{
	
	/**
	 * 
	 */
	private static final long serialVersionUID = 523994645624494148L;
	@Id
	@GeneratedValue(generator="system-uuid")
	@GenericGenerator(name = "system-uuid",strategy="uuid")
	private long stuId;
	@Column(length=32)
	private String name;
	@Column(length=32)
	private String age;
	@Column(length=32)
	private int password;
	
	public long getStuId() {
		return stuId;
	}
	public void setStuId(long stuId) {
		this.stuId = stuId;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getAge() {
		return age;
	}
	public void setAge(String age) {
		this.age = age;
	}
	public int getPassword() {
		return password;
	}
	public void setPassword(int password) {
		this.password = password;
	}
	public StudentDemo() {
		super();
		// TODO Auto-generated constructor stub
	}
	
	
}
