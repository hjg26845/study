package com.dsideal.entity;

import java.io.Serializable;

import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;

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
	private String stuId;
	@Column(length=32)
	private String name;
	@Column(length=32)
	private int age;
	@Column(length=32)
	private String password;
	@ManyToOne()
	@JoinColumn(name="classId")
	private ClassDemo cd;
	
	
	public ClassDemo getCd() {
		return cd;
	}


	public void setCd(ClassDemo cd) {
		this.cd = cd;
	}


	public String getStuId() {
		return stuId;
	}


	public void setStuId(String stuId) {
		this.stuId = stuId;
	}


	public String getName() {
		return name;
	}


	public void setName(String name) {
		this.name = name;
	}


	public int getAge() {
		return age;
	}


	public void setAge(int age) {
		this.age = age;
	}


	public String getPassword() {
		return password;
	}


	public void setPassword(String password) {
		this.password = password;
	}


	public StudentDemo() {
		super();
		// TODO Auto-generated constructor stub
	}
	
	
}
