package com.cg.entity;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;


@Entity
public class Author {
	@Id
	@GeneratedValue(strategy=GenerationType.AUTO)
	private int author_Id;
	private String first_Name;
	private String middle_Name;
	private String last_Name;
	private String phone_No;
	
	public Author(){
		//no implementation
		}

	public Author(String first_Name, String middle_Name, String last_Name, String phone_No) {
		super();
		this.first_Name = first_Name;
		this.middle_Name = middle_Name;
		this.last_Name = last_Name;
		this.phone_No = phone_No;
	}

	public int getAuthor_Id() {
		return author_Id;
	}

	public String getFirst_Name() {
		return first_Name;
	}

	public void setFirst_Name(String first_Name) {
		this.first_Name = first_Name;
	}

	public String getMiddle_Name() {
		return middle_Name;
	}

	public void setMiddle_Name(String middle_Name) {
		this.middle_Name = middle_Name;
	}

	public String getLast_Name() {
		return last_Name;
	}

	public void setLast_Name(String last_Name) {
		this.last_Name = last_Name;
	}

	public String getPhone_No() {
		return phone_No;
	}

	public void setPhone_No(String phone_No) {
		this.phone_No = phone_No;
	}

	@Override
	public String toString() {
		return "Author [author_Id=" + author_Id + ", first_Name=" + first_Name + ", middle_Name=" + middle_Name
				+ ", last_Name=" + last_Name + ", phone_No=" + phone_No + "]";
	}

	
}
