package edu.poly.spring.models;

import java.io.Serializable;
import java.util.Set;

import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.OneToMany;


@Entity
public class Supplier implements Serializable {
	@Id
	@Column(name = "id",length = 10)
	private String id;
	
	@Column(length = 50,name = "name")
	private String name;
	
	@Column(length = 50,name = "Email")
	private String email;
	
	@Column(length = 15,name = "phone")
	private String phone;
	
	@Column(name = "address")
	private String address;
	
	@Column(length = 100, name = "Website")
	private String website;
	
	@Column(name = "note")
	private String note;
	
	@OneToMany(mappedBy = "nhaCungCap",cascade = CascadeType.ALL)
	private Set<Products> products;

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

	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
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

	public String getWebsite() {
		return website;
	}

	public void setWebsite(String website) {
		this.website = website;
	}

	public String getNote() {
		return note;
	}

	public void setNote(String note) {
		this.note = note;
	}

	public Set<Products> getProducts() {
		return products;
	}

	public void setProducts(Set<Products> products) {
		this.products = products;
	}

	public Supplier(String id, String name, String email, String phone, String address, String website, String note,
			Set<Products> products) {
		super();
		this.id = id;
		this.name = name;
		this.email = email;
		this.phone = phone;
		this.address = address;
		this.website = website;
		this.note = note;
		this.products = products;
	}

	public Supplier() {
		super();
	}
	
}
