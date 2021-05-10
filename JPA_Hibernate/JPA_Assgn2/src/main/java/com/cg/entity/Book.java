package com.cg.entity;

import java.io.Serializable;
import java.util.Set;
import javax.persistence.CascadeType;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.OneToMany;



@Entity
public class Book implements Serializable {
	private static final long serialVersionUID = 1L;
	@Id
	@GeneratedValue(strategy=GenerationType.AUTO)
	private long ISBN;
	private String title;
	private int price;
	@OneToMany(mappedBy="book", cascade= CascadeType.PERSIST)
	private Set<BookAuthor> bookauthor;
	public  Book() {
		// no implementation
	}

	public Book(String title, int price) {
		super();
		this.title = title;
		this.price = price;
	}

	public long getISBN() {
		return ISBN;
	}

	public String getTitle() {
		return title;
	}

	public void setTitle(String title) {
		this.title = title;
	}

	public int getPrice() {
		return price;
	}

	public void setPrice(int price) {
		this.price = price;
	}
	

	public Set<BookAuthor> getBookauthor() {
		return bookauthor;
	}

	public void setBookauthor(Set<BookAuthor> bookauthor) {
		this.bookauthor = bookauthor;
	}

	@Override
	public String toString() {
		return "Book [ISBN=" + ISBN + ", title=" + title + ", price=" + price + "]";
	}
	
}
