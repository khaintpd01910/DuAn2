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
import javax.persistence.OneToMany;
import javax.persistence.Temporal;
import javax.persistence.TemporalType;

import org.springframework.format.annotation.DateTimeFormat;


@Entity
public class Promotion implements Serializable{
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Integer id;
	@Column(length = 100)
	private String name;
	@Column(length = 255)
	private String description;
	@DateTimeFormat(pattern = "dd//MM//YYYY")
	@Temporal(TemporalType.DATE)
	private Date startDay;
	@DateTimeFormat(pattern = "dd/MM/YYYY")
	@Temporal(TemporalType.DATE)
	private Date endDay;
	@Column(length = 255)
	private String note;
	@Column(length = 255)
	private String form;
	public Promotion(Integer id, String name, String description, Date startDay, Date endDay, String note,
			String form) {
		super();
		this.id = id;
		this.name = name;
		this.description = description;
		this.startDay = startDay;
		this.endDay = endDay;
		this.note = note;
		this.form = form;
	}
	public Promotion() {
		super();
	}
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
	public String getDescription() {
		return description;
	}
	public void setDescription(String description) {
		this.description = description;
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
	public String getNote() {
		return note;
	}
	public void setNote(String note) {
		this.note = note;
	}
	public String getForm() {
		return form;
	}
	public void setForm(String form) {
		this.form = form;
	}
	
}