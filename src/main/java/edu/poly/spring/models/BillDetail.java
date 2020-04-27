package edu.poly.spring.models;

import java.io.Serializable;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.OneToOne;
@Entity
public class BillDetail implements Serializable{

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Integer id;
	
	@Column(name = "amount")
	private int amount;
	
	@Column(name = "price")
	private float price;
	
	@Column(name = "note", length = 200)
	private String note;
	
	@OneToOne
	@JoinColumn(name = "productId")
	private Product product;
	
	public BillDetail() {
		super();
	}

	public BillDetail(Integer id, int amount, float price, String note, Product product, Bill bill) {
		super();
		this.id = id;
		this.amount = amount;
		this.price = price;
		this.note = note;
		this.product = product;
		this.bill = bill;
	}

	public Integer getId() {
		return id;
	}

	public void setId(Integer id) {
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

	public Product getProducts() {
		return product;
	}

	public void setProducts(Product product) {
		this.product = product;
	}

	public Bill getBills() {
		return bill;
	}

	public void setBills(Bill bill) {
		this.bill = bill;
	}

	@ManyToOne
	@JoinColumn(name = "billId")
	private Bill bill;
	
}
	