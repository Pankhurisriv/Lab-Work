package com.cg.entity;

import java.io.Serializable;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;



@Entity
public class BookAuthor implements Serializable {
	private static final long serialVersionUID = 1L;
	@Id
	@GeneratedValue(strategy=GenerationType.AUTO)
	private long Id;
	private String name;
	
	@ManyToOne
	@JoinColumn(name = "ISBN")
	private Book book;
	
	public Book getBook() {
		return book;
	}

	public void setBook(Book book) {
		this.book = book;
	}
	
    public BookAuthor() {
		//no implementation
	}

	public long getId() {
		return Id;
	}

    public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
		
	}
	

	public BookAuthor(String name) {
		super();
		this.name = name;
	}

	@Override
	public String toString() {
		return "BookAuthor [Id=" + Id + ", name=" + name + "]";
	}
	
	

}
