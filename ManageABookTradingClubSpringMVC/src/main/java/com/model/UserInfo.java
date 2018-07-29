package com.model;

import java.util.List;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.OneToMany;
import javax.persistence.OneToOne;
import javax.persistence.Table;

@Entity
@Table(name="USERINFOR")
public class UserInfo {
	
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private int id;
	
	@Column(name="NAME ")
	private String name;
	
	@Column(name="EMAIL")
	private String email;
	
	@Column(name="PHONE")
	private String phonenumber;
	
	@Column(name="DECENTRALIZATION")
	private boolean decentralization;
	
	@OneToOne()
	@JoinColumn(name="IDACCOUNT")
	private Account idAccount;
	
	@OneToMany(mappedBy = "userInfo",fetch = FetchType.LAZY)
	private List<Book> book;

	public List<Book> getBook() {
		return book;
	}

	public void setBook(List<Book> book) {
		this.book = book;
	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}

	public String getNumber() {
		return phonenumber;
	}

	public void setNumber(String phonenumber) {
		this.phonenumber = phonenumber;
	}

	public String getPhonenumber() {
		return phonenumber;
	}

	public void setPhonenumber(String phonenumber) {
		this.phonenumber = phonenumber;
	}

	public boolean isDecentralization() {
		return decentralization;
	}

	public void setDecentralization(boolean decentralization) {
		this.decentralization = decentralization;
	}

	public Account getIdAccount() {
		return idAccount;
	}

	public void setIdAccount(Account idAccount) {
		this.idAccount = idAccount;
	}

}
