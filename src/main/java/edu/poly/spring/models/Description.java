package edu.poly.spring.models;

import java.io.Serializable;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;

@Entity
public class Description implements Serializable{
	@Id
	@Column(name = "id",length = 10)
	private String id;
	
	@Column(name = "fontImage", length = 100)
	private String fontImage;
	
	@Column(name = "backImage",length = 100)
	private String backImage;
	
	@Column(name = "type", length = 50)
	private String type;
	
	@Column(name = "color", length = 50)
	private String color;
	
	@Column(name = "size", length = 50)
	private String size;
	
	@Column(name = "ages")
	private Boolean ages;
	
	@Column(name = "amount")
	private int amount;
	
	@Column(name = "note", length = 200)
	private String note;
	
	@ManyToOne
	@JoinColumn(name = "idSanPham")
	private Products products;

	public String getId() {
		return id;
	}

	public void setId(String id) {
		this.id = id;
	}

	public String getFontImage() {
		return fontImage;
	}

	public void setFontImage(String fontImage) {
		this.fontImage = fontImage;
	}

	public String getBackImage() {
		return backImage;
	}

	public void setBackImage(String backImage) {
		this.backImage = backImage;
	}

	public String getType() {
		return type;
	}

	public void setType(String type) {
		this.type = type;
	}

	public String getColor() {
		return color;
	}

	public void setColor(String color) {
		this.color = color;
	}

	public String getSize() {
		return size;
	}

	public void setSize(String size) {
		this.size = size;
	}

	public Boolean getAges() {
		return ages;
	}

	public void setAges(Boolean ages) {
		this.ages = ages;
	}

	public int getAmount() {
		return amount;
	}

	public void setAmount(int amount) {
		this.amount = amount;
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

	public Description(String id, String fontImage, String backImage, String type, String color, String size,
			Boolean ages, int amount, String note, Products products) {
		super();
		this.id = id;
		this.fontImage = fontImage;
		this.backImage = backImage;
		this.type = type;
		this.color = color;
		this.size = size;
		this.ages = ages;
		this.amount = amount;
		this.note = note;
		this.products = products;
	}

	public Description() {
		super();
	}

}