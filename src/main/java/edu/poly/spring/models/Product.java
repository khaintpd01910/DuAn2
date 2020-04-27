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
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.OneToOne;
import javax.persistence.Temporal;
import javax.persistence.TemporalType;

import org.springframework.format.annotation.DateTimeFormat;


@Entity
public class Product implements Serializable {
	
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Integer id;
	
	@Column(name = "name", length = 50)
	private String name;
	
	@Column(name = "image", length = 100)
	private String image;
	
	@Temporal(TemporalType.DATE)
	@DateTimeFormat(pattern = "dd/MM/yyyy")
	@Column(name = "dateSubmitted")
	private Date dateSubmitted;
	
	@Column(name = "discount")
	private Float discount;
	
	@Column(name = "price")
	private Float price;
	
	@Temporal(TemporalType.DATE)
	@DateTimeFormat(pattern = "dd/MM/yyyy")
	@Column(name = "startDay")
	private Date startDay;
	
	@Temporal(TemporalType.DATE)
	@DateTimeFormat(pattern = "dd/MM/yyyy")
	@Column(name = "endDay")
	private Date endDay;
	
	@Column(name = "description", length = 200)
	private String description;
	
	@Column(name = "status")
	private Boolean status;
	
	@Column(name = "note",length = 200)
	private String note;
	
	@ManyToOne
	@JoinColumn(name = "idDanhMuc")
	private Category category;
	
	@ManyToOne
	@JoinColumn(name = "idCungCap")
	private Supply supply;
	
	@OneToOne(mappedBy = "sanPham", cascade = CascadeType.ALL)
	private BillDetail billDetail;

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

	public String getImage() {
		return image;
	}

	public void setImage(String image) {
		this.image = image;
	}

	public Date getDateSubmitted() {
		return dateSubmitted;
	}

	public void setDateSubmitted(Date dateSubmitted) {
		this.dateSubmitted = dateSubmitted;
	}

	public Float getDiscount() {
		return discount;
	}

	public void setDiscount(Float discount) {
		this.discount = discount;
	}

	public Float getPrice() {
		return price;
	}

	public void setPrice(Float price) {
		this.price = price;
	}

	public Date getStartDay() {
		return startDay;
	}

	public void setStartDay(Date startDay) {
		this.startDay = startDay;
	}

	public Date getEndDay() {
		return endDay;
	}

	public void setEndDay(Date endDay) {
		this.endDay = endDay;
	}

	public String getDescription() {
		return description;
	}

	public void setDescription(String description) {
		this.description = description;
	}

	public Boolean getStatus() {
		return status;
	}

	public void setStatus(Boolean status) {
		this.status = status;
	}

	public String getNote() {
		return note;
	}

	public void setNote(String note) {
		this.note = note;
	}

	public Category getCategories() {
		return category;
	}

	public void setCategories(Category category) {
		this.category = category;
	}

	public Supply getSupplier() {
		return supply;
	}

	public void setSupplier(Supply supply) {
		this.supply = supply;
	}

	public BillDetail getBillDetails() {
		return billDetail;
	}

	public void setBillDetails(BillDetail billDetail) {
		this.billDetail = billDetail;
	}

	public Product(Integer id, String name, String image, Date dateSubmitted, Float discount, Float price,
			Date startDay, Date endDay, String description, Boolean status, String note, Category category,
			Supply supply, BillDetail billDetail) {
		super();
		this.id = id;
		this.name = name;
		this.image = image;
		this.dateSubmitted = dateSubmitted;
		this.discount = discount;
		this.price = price;
		this.startDay = startDay;
		this.endDay = endDay;
		this.description = description;
		this.status = status;
		this.note = note;
		this.category = category;
		this.supply = supply;
		this.billDetail = billDetail;
	}

	public Product() {
		super();
	}

}
