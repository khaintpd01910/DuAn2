package edu.poly.spring.models;

import java.io.Serializable;
import java.util.Set;

import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.OneToMany;



@Entity
public class Category implements Serializable {
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Integer id;
	
	@Column(name = "name", length = 50)
	private String name;
	
	@OneToMany(mappedBy =  "categories", cascade = CascadeType.ALL)
	private Set<Product> product;

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

	public Category(Integer id, String name, Set<Product> product) {
		super();
		this.id = id;
		this.name = name;
		this.product = product;
	}

	public Category() {
		super();
	}

	public Set<Product> getProducts() {
		return product;
	}

	public void setProducts(Set<Product> product) {
		this.product = product;
	}
}
	