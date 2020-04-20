package edu.poly.spring.models;

import java.io.Serializable;
import java.util.Date;
import java.util.Set;

import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.OneToOne;
import javax.persistence.Temporal;
import javax.persistence.TemporalType;

import org.springframework.format.annotation.DateTimeFormat;



@Entity
public class Customers implements Serializable {
	@Id
	@Column(length = 10,name = "id")
	private String id;
	
	@Column(length = 50,name = "name")
	private String name;
	
	@Column(length = 50,name = "TaiKhoan")
	private String taiKhoan;
	
	@Column(length = 50,name = "password")
	private String password;
	
	@Column(length = 50,name = "email")
	private String email;
	
	@Column(length = 100,name = "image")
	private String image;
	
	@Column(length = 15,name = "phone")
	private String phone;
	
	@Column(name = "address",length = 200)
	private String address;
	
	@Column(name = "dateCreated")
	@Temporal(TemporalType.DATE)
	@DateTimeFormat(pattern = "dd/MM/yyyy")
	private Date dateCreated;
	
	@Column(name = "note",length = 200)
	private String note;
	
	@OneToOne(mappedBy = "khachHang",cascade = CascadeType.ALL)
	private Bills bills;

	public String getId() {
		return id;
	}

	public void setId(String id) {
		this.id = id;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getTaiKhoan() {
		return taiKhoan;
	}

	public void setTaiKhoan(String taiKhoan) {
		this.taiKhoan = taiKhoan;
	}

	public String getPassword() {
		return password;
	}

	public void setPassword(String password) {
		this.password = password;
	}

	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}

	public String getImage() {
		return image;
	}

	public void setImage(String image) {
		this.image = image;
	}

	public String getPhone() {
		return phone;
	}

	public void setPhone(String phone) {
		this.phone = phone;
	}

	public String getAddress() {
		return address;
	}

	public void setAddress(String address) {
		this.address = address;
	}

	public Date getDateCreated() {
		return dateCreated;
	}

	public void setDateCreated(Date dateCreated) {
		this.dateCreated = dateCreated;
	}

	public String getNote() {
		return note;
	}

	public void setNote(String note) {
		this.note = note;
	}

	public Bills getBills() {
		return bills;
	}

	public void setBills(Bills bills) {
		this.bills = bills;
	}

	public Customers() {
		super();
	}

	public Customers(String id, String name, String taiKhoan, String password, String email, String image, String phone,
			String address, Date dateCreated, String note, Bills bills) {
		super();
		this.id = id;
		this.name = name;
		this.taiKhoan = taiKhoan;
		this.password = password;
		this.email = email;
		this.image = image;
		this.phone = phone;
		this.address = address;
		this.dateCreated = dateCreated;
		this.note = note;
		this.bills = bills;
	}

}
