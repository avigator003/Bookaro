package com.example.demo.model;

import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.OneToOne;

@Entity
public class User {

	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	@Column(name="user_id")
	private int userid;
	
	@Column
	private String username;
	
	@Column
	private String email;
	
	@Column
	private int number;
	
	@Column
	private String password;
	
	@Column
	private String city;
	
	@Column
	private boolean isVerify;
	
	@Column
	private boolean isActive;
	
	@Column
	private int otp;



    @OneToOne(cascade = CascadeType.ALL)
	@JoinColumn(name ="bid")
	private Books book;

	
	


	public User(int userid, String username, String email, int number, String password, String city, boolean isVerify,
			boolean isActive, int otp, Books book) {
		super();
		this.userid = userid;
		this.username = username;
		this.email = email;
		this.number = number;
		this.password = password;
		this.city = city;
		this.isVerify = isVerify;
		this.isActive = isActive;
		this.otp = otp;
		this.book = book;
	}


				
	public Books getBook() {
		return book;
	}



	public void setBook(Books book) {
		this.book = book;
	}



	public User() {
        
        this.isVerify=false;
        this.isActive=true;
    }


	public int getUserid() {
		return userid;
	}



	public void setUserid(int userid) {
		this.userid = userid;
	}



	public String getUsername() {
		return username;
	}



	public void setUsername(String username) {
		this.username = username;
	}



	public String getEmail() {
		return email;
	}



	public void setEmail(String email) {
		this.email = email;
	}



	public int getNumber() {
		return number;
	}



	public void setNumber(int number) {
		this.number = number;
	}



	public String getPassword() {
		return password;
	}



	public void setPassword(String password) {
		this.password = password;
	}



	public String getCity() {
		return city;
	}



	public void setCity(String city) {
		this.city = city;
	}



	public boolean IsisVerify() {
		return isVerify;
	}



	public void setVerify(boolean isVerify) {
		this.isVerify = isVerify;
		
	}



	

	public void setActive(boolean isActive) {
		this.isActive = isActive;
	}
	
public int getOtp() {
	return otp;
}
public void setOtp(int otp) {
	this.otp = otp;
}


@Override
public String toString() {
	return "User [userid=" + userid + ", username=" + username + ", email=" + email + ", number=" + number
			+ ", password=" + password + ", city=" + city + ", isVerify=" + isVerify + ", isActive=" + isActive
			+ ", otp=" + otp + "]";
}


	


	
	
	
	
}
