package edu.poly.spring.models;

import java.io.Serializable;
import java.util.Date;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Temporal;
import javax.persistence.TemporalType;

import org.springframework.format.annotation.DateTimeFormat;


@Entity
public class Events implements Serializable{
	@Id
	@Column(name = "id", length = 10)
	private String id;
	
	@Column(name = "name",length = 50)
	private String name;
	
	@Column(name = "discount")
	private float discount;
	
	@Column(name = "dateSubmitted")
	@Temporal(TemporalType.DATE)
	@DateTimeFormat(pattern = "dd/MM/yyyy")
	private Date dateSubmitted;
	
	@Column(name = "startDay")
	@Temporal(TemporalType.DATE)
	@DateTimeFormat(pattern = "dd/MM/yyyy")
	private Date startDay;
	
	@Column(name = "endDay")
	@Temporal(TemporalType.DATE)
	@DateTimeFormat(pattern = "dd/MM/yyyy")
	private Date endDay;
	
	@Column(name = "description", length = 200)
	private String description;
	
	@Column(name = "note", length = 200)
	private String note;

}
