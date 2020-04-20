package edu.poly.spring.models;

import java.io.Serializable;
import java.util.Set;

import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.OneToMany;



@Entity
public class Categories implements Serializable {
	@Id
	@Column(name = "id", length = 10)
	private String id;
	
	@Column(name = "name", length = 50)
	private String name;
	
	@OneToMany(mappedBy =  "categories", cascade = CascadeType.ALL)
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

	public Categories(String id, String name, Set<Products> products) {
		super();
		this.id = id;
		this.name = name;
		this.products = products;
	}

	public Categories() {
		super();
	}

	public Set<Products> getProducts() {
		return products;
	}

	public void setProducts(Set<Products> products) {
		this.products = products;
	}
}
	