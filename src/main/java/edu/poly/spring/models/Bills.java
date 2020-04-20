package edu.poly.spring.models;


import java.io.Serializable;
import java.util.Date;
import java.util.Set;

import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.OneToMany;
import javax.persistence.OneToOne;
import javax.persistence.Temporal;
import javax.persistence.TemporalType;

import org.springframework.format.annotation.DateTimeFormat;

@Entity
public class Bills implements Serializable{
	@Id
	@Column(name = "id",length = 10)
	private String id;
	
	@Column(name = "total")
	private float total;
	
	@Column(name = "address",length = 200)
	private String address;
	
	@Column(name = "note", length = 200)
	private String note;
	
	@Column(name = "status")
	private Boolean status;
	
	@Column(name = "orderDate")
	@Temporal(TemporalType.DATE)
	@DateTimeFormat(pattern = "dd/MM/yyyy")
	private Date orderDate;
	
	@Column(name = "receivedDate")
	@Temporal(TemporalType.DATE)
	@DateTimeFormat(pattern = "dd/MM/yyyy")
	private Date receivedDate;
	
	@Column(name = "transportFee")
	private float transportFee;
	
	@OneToOne
	@JoinColumn(name = "idcustomer")
	private Customers customer;

	@OneToMany(mappedBy = "hoaDon",cascade = CascadeType.ALL)
	private Set<BillDetails> billDetails;

	public String getId() {
		return id;
	}

	public void setId(String id) {
		this.id = id;
	}

	public float getTotal() {
		return total;
	}

	public void setTotal(float total) {
		this.total = total;
	}

	public String getAddress() {
		return address;
	}

	public void setAddress(String address) {
		this.address = address;
	}

	public String getNote() {
		return note;
	}

	public void setNote(String note) {
		this.note = note;
	}

	public Boolean getStatus() {
		return status;
	}

	public void setStatus(Boolean status) {
		this.status = status;
	}

	public Date getOrderDate() {
		return orderDate;
	}

	public void setOrderDate(Date orderDate) {
		this.orderDate = orderDate;
	}

	public Date getReceivedDate() {
		return receivedDate;
	}

	public void setReceivedDate(Date receivedDate) {
		this.receivedDate = receivedDate;
	}

	public float getTransportFee() {
		return transportFee;
	}

	public void setTransportFee(float transportFee) {
		this.transportFee = transportFee;
	}

	public Customers getCustomer() {
		return customer;
	}

	public void setCustomer(Customers customer) {
		this.customer = customer;
	}

	public Set<BillDetails> getBillDetails() {
		return billDetails;
	}

	public void setBillDetails(Set<BillDetails> billDetails) {
		this.billDetails = billDetails;
	}

	public Bills() {
		super();
	}

	public Bills(String id, float total, String address, String note, Boolean status, Date orderDate, Date receivedDate,
			float transportFee, Customers customer, Set<BillDetails> billDetails) {
		super();
		this.id = id;
		this.total = total;
		this.address = address;
		this.note = note;
		this.status = status;
		this.orderDate = orderDate;
		this.receivedDate = receivedDate;
		this.transportFee = transportFee;
		this.customer = customer;
		this.billDetails = billDetails;
	}

}