package edu.poly.spring.models;

import java.io.Serializable;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.OneToOne;
@Entity
public class BillDetails implements Serializable{

	@Id
	@Column(name = "id", length = 10)
	private String id;
	
	@Column(name = "amount")
	private int amount;
	
	@Column(name = "price")
	private float price;
	
	@Column(name = "note", length = 200)
	private String note;
	
	@OneToOne
	@JoinColumn(name = "productId")
	private Products products;
	
	public BillDetails() {
		super();
	}

	public BillDetails(String id, int amount, float price, String note, Products products, Bills bills) {
		super();
		this.id = id;
		this.amount = amount;
		this.price = price;
		this.note = note;
		this.products = products;
		this.bills = bills;
	}

	public String getId() {
		return id;
	}

	public void setId(String id) {
		this.id = id;
	}

	public int getAmount() {
		return amount;
	}

	public void setAmount(int amount) {
		this.amount = amount;
	}

	public float getPrice() {
		return price;
	}

	public void setPrice(float price) {
		this.price = price;
	}

	public String getNote() {
		return note;
	}

	public void setNote(String note) {
		this.note = note;
	}

	public Products getProducts() {
		return products;
	}

	public void setProducts(Products products) {
		this.products = products;
	}

	public Bills getBills() {
		return bills;
	}

	public void setBills(Bills bills) {
		this.bills = bills;
	}

	@ManyToOne
	@JoinColumn(name = "billId")
	private Bills bills;
	
}
	