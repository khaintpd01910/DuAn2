package edu.poly.spring.models;

import java.io.Serializable;
import java.util.Date;
import java.util.Set;

import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.OneToOne;
import javax.persistence.Temporal;
import javax.persistence.TemporalType;

import org.springframework.format.annotation.DateTimeFormat;


@Entity
public class Products implements Serializable {
	
	@Id
	@Column(name = "id", length = 10)
	private String id;
	
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
	private Categories categories;
	
	@ManyToOne
	@JoinColumn(name = "idCungCap")
	private Supplier supplier;
	
	@OneToOne(mappedBy = "sanPham", cascade = CascadeType.ALL)
	private BillDetails billDetails;

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

	public Categories getCategories() {
		return categories;
	}

	public void setCategories(Categories categories) {
		this.categories = categories;
	}

	public Supplier getSupplier() {
		return supplier;
	}

	public void setSupplier(Supplier supplier) {
		this.supplier = supplier;
	}

	public BillDetails getBillDetails() {
		return billDetails;
	}

	public void setBillDetails(BillDetails billDetails) {
		this.billDetails = billDetails;
	}

	public Products(String id, String name, String image, Date dateSubmitted, Float discount, Float price,
			Date startDay, Date endDay, String description, Boolean status, String note, Categories categories,
			Supplier supplier, BillDetails billDetails) {
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
		this.categories = categories;
		this.supplier = supplier;
		this.billDetails = billDetails;
	}

	public Products() {
		super();
	}

}
