package edu.poly.spring.models;

import java.io.Serializable;
import java.util.Date;
import java.util.Set;

import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.OneToOne;
import javax.persistence.Temporal;
import javax.persistence.TemporalType;

import org.springframework.format.annotation.DateTimeFormat;



@Entity
public class Customer implements Serializable {
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Integer id;
	
	@Column(length = 50,name = "name")
	private String name;
	
	@Column(length = 50,name = "username")
	private String username;
	
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
	
	@OneToOne(mappedBy = "customer",cascade = CascadeType.ALL)
	private Bill bill;

	public Integer getId() {
		return id;
	}

	public void setId(Integer id) {
		this.id = id;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getUsername() {
		return username;
	}

	public void setUsername(String username) {
		this.username = username;
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

	public Bill getBills() {
		return bill;
	}

	public void setBills(Bill bill) {
		this.bill = bill;
	}

	public Customer() {
		super();
	}

	public Customer(Integer id, String name, String username, String password, String email, String image, String phone,
			String address, Date dateCreated, String note, Bill bill) {
		super();
		this.id = id;
		this.name = name;
		this.username = username;
		this.password = password;
		this.email = email;
		this.image = image;
		this.phone = phone;
		this.address = address;
		this.dateCreated = dateCreated;
		this.note = note;
		this.bill = bill;
	}

}
