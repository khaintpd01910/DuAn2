package edu.poly.spring.models;

import java.io.Serializable;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;

@Entity
public class Description implements Serializable{
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Integer id;
	
	@Column(name = "fontImage", length = 100)
	private String fontImage;
	
	@Column(name = "backImage",length = 100)
	private String backImage;
	
	@Column(name = "color", length = 50)
	private String color;
	
	@Column(name = "size", length = 50)
	private String size;
	
	@Column(name = "amount")
	private int amount;
	
	@Column(name = "note", length = 200)
	private String note;
	
	@ManyToOne
	@JoinColumn(name = "productId")
	private Product product;

	public Integer getId() {
		return id;
	}

	public void setId(Integer id) {
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

	

	public Integer getAmount() {
		return amount;
	}

	public void setAmount(Integer amount) {
		this.amount = amount;
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

	public Description(Integer id, String fontImage, String backImage,  String color, String size,
			 Integer amount, String note, Product product) {
		super();
		this.id = id;
		this.fontImage = fontImage;
		this.backImage = backImage;	
		this.color = color;
		this.size = size;
		this.amount = amount;
		this.note = note;
		this.product = product;
	}

	public Description() {
		super();
	}

}