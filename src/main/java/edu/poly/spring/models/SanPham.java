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
public class SanPham implements Serializable {
	
	@Id
	@Column(name = "Ma", length = 10)
	private String ma;
	
	@Column(name = "Ten", length = 50)
	private String ten;
	
	@Column(name = "Hinh", length = 100)
	private String hinh;
	
	@Temporal(TemporalType.DATE)
	@DateTimeFormat(pattern = "dd/MM/yyyy")
	@Column(name = "NgayDang")
	private Date ngayDang;
	
	@Column(name = "GiamGia")
	private Float giamGia;
	
	@Column(name = "Gia")
	private Float gia;
	
	@Temporal(TemporalType.DATE)
	@DateTimeFormat(pattern = "dd/MM/yyyy")
	@Column(name = "NgayBatDau")
	private Date ngayBatDau;
	
	@Temporal(TemporalType.DATE)
	@DateTimeFormat(pattern = "dd/MM/yyyy")
	@Column(name = "NgayKetThuc")
	private Date ngayKetThuc;
	
	@Column(name = "MoTa", length = 200)
	private String moTa;
	
	@Column(name = "TinhTrang")
	private Boolean tinhTrang;
	
	@Column(name = "GhiChu",length = 200)
	private String ghiChu;
	
	@ManyToOne
	@JoinColumn(name = "maDanhMuc")
	private DanhMuc danhMuc;
	
	@ManyToOne
	@JoinColumn(name = "maCungCap")
	private NhaCungCap nhaCungCap;
	
	@OneToOne(mappedBy = "sanPham", cascade = CascadeType.ALL)
	private Set<HoaDonChiTiet> hoaDonChiTiet;
	
}
