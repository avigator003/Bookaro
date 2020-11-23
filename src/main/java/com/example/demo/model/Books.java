package com.example.demo.model;


import java.util.Date;

import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.OneToOne;
import javax.persistence.Table;
import javax.persistence.Temporal;
import javax.persistence.TemporalType;

@Entity
@Table(name = "Books")
public class Books {
	
	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	@Column(name = "bid")
	private int bid;
	
    @Column
	private String classes;
	
	@Column
	private String subject;
	
	@Column
	private String author;
	
	@Column
	private String Board;
	
	@Column 
	private String old;
	
	@Column 
	private int price;
	
	@Column
	private String bookPic;
	
	@Temporal(TemporalType.TIMESTAMP)
	private Date date;
	
	

    @OneToOne(cascade = CascadeType.ALL)
	@JoinColumn(name ="user_id")
	private User user;

	
	
	
	
	
	public Date getDate() {
		return date;
	}

	public void setDate(Date date) {
		this.date = date;
	}

	public int getPrice() {
		return price;
	}

	public void setPrice(int price) {
		this.price = price;
	}

	public int getBid() {
		return bid;
	}

	public void setBid(int bid) {
		this.bid = bid;
	}

	public String getClasses() {
		return classes;
	}

	public void setClasses(String classes) {
		this.classes = classes;
	}

	public String getSubject() {
		return subject;
	}

	public void setSubject(String subject) {
		this.subject = subject;
	}

	public String getAuthor() {
		return author;
	}

	public void setAuthor(String author) {
		this.author = author;
	}

	public String getBoard() {
		return Board;
	}

	public void setBoard(String board) {
		Board = board;
	}

	public String getOld() {
		return old;
	}

	public void setOld(String old) {
		this.old = old;
	}

	public String getBookPic() {
		return bookPic;
	}

	public void setBookPic(String bookPic) {
		this.bookPic = bookPic;
	}

	public User getUser() {
		return user;
	}

	public void setUser(User user) {
		this.user = user;
	}

	


	public Books(int bid, String classes, String subject, String author, String board, String old, int price,
			String bookPic, Date date, User user) {
		super();
		this.bid = bid;
		this.classes = classes;
		this.subject = subject;
		this.author = author;
		Board = board;
		this.old = old;
		this.price = price;
		this.bookPic = bookPic;
		this.date = date;
		this.user = user;
	}

	public Books() {
		super();
	}

	@Override
	public String toString() {
		return "Books [bid=" + bid + ", classes=" + classes + ", subject=" + subject + ", author=" + author + ", Board="
				+ Board + ", old=" + old + ", bookPic=" + bookPic + ", user=" + user + "]";
	}
	
	
	
	
	
	
	
	

}
