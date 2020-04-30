package edu.poly.spring.dtos;

import java.io.Serializable;

import javax.persistence.Column;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.validation.constraints.NotEmpty;
import javax.validation.constraints.NotNull;

import org.springframework.web.multipart.MultipartFile;

import edu.poly.spring.models.Product;

public class DescriptionDTO implements Serializable {
	
	private Integer id;

	@NotNull
	private MultipartFile FontImage;

	@NotNull
	private MultipartFile  BackImage;
	
	@NotNull
	@NotEmpty(message = "Color is empty")
	private String color;

	@NotNull
	@NotEmpty(message = "Size is empty")
	private String size;	

	@NotNull
	@NotEmpty(message = "Amount is empty")
	private int amount;

	private String note;

	@NotNull
	private Integer productId;

	public Integer getId() {
		return id;
	}

	public void setId(Integer id) {
		this.id = id;
	}

	public MultipartFile getFontImage() {
		return FontImage;
	}

	public void setFontImage(MultipartFile fontImage) {
		FontImage = fontImage;
	}

	public MultipartFile getBackImage() {
		return BackImage;
	}

	public void setBackImage(MultipartFile backImage) {
		BackImage = backImage;
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

	public Integer getProductId() {
		return productId;
	}

	public void setProductId(Integer productId) {
		this.productId = productId;
	}

}