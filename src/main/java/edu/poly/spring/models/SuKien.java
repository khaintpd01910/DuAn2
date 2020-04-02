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
public class SuKien implements Serializable{
	@Id
	@Column(name = "Ma", length = 10)
	private String ma;
	
	@Column(name = "Ten",length = 50)
	private String ten;
	
	@Column(name = "GiamGia")
	private float giamGia;
	
	@Column(name = "NgayDang")
	@Temporal(TemporalType.DATE)
	@DateTimeFormat(pattern = "dd/MM/yyyy")
	private Date ngayDang;
	
	@Column(name = "NgayBatDau")
	@Temporal(TemporalType.DATE)
	@DateTimeFormat(pattern = "dd/MM/yyyy")
	private Date ngayBatDau;
	
	@Column(name = "NgayKetThuc")
	@Temporal(TemporalType.DATE)
	@DateTimeFormat(pattern = "dd/MM/yyyy")
	private Date ngayKetThuc;
	
	@Column(name = "MoTa", length = 200)
	private String moTa;
	
	@Column(name = "GhiChu", length = 200)
	private String ghiChu;

	public SuKien(String ma, String ten, float giamGia, Date ngayDang, Date ngayBatDau, Date ngayKetThuc, String moTa,
			String ghiChu) {
		super();
		this.ma = ma;
		this.ten = ten;
		this.giamGia = giamGia;
		this.ngayDang = ngayDang;
		this.ngayBatDau = ngayBatDau;
		this.ngayKetThuc = ngayKetThuc;
		this.moTa = moTa;
		this.ghiChu = ghiChu;
	}

	public SuKien() {
		super();
	}

	public String getMa() {
		return ma;
	}

	public void setMa(String ma) {
		this.ma = ma;
	}

	public String getTen() {
		return ten;
	}

	public void setTen(String ten) {
		this.ten = ten;
	}

	public float getGiamGia() {
		return giamGia;
	}

	public void setGiamGia(float giamGia) {
		this.giamGia = giamGia;
	}

	public Date getNgayDang() {
		return ngayDang;
	}

	public void setNgayDang(Date ngayDang) {
		this.ngayDang = ngayDang;
	}

	public Date getNgayBatDau() {
		return ngayBatDau;
	}

	public void setNgayBatDau(Date ngayBatDau) {
		this.ngayBatDau = ngayBatDau;
	}

	public Date getNgayKetThuc() {
		return ngayKetThuc;
	}

	public void setNgayKetThuc(Date ngayKetThuc) {
		this.ngayKetThuc = ngayKetThuc;
	}

	public String getMoTa() {
		return moTa;
	}

	public void setMoTa(String moTa) {
		this.moTa = moTa;
	}

	public String getGhiChu() {
		return ghiChu;
	}

	public void setGhiChu(String ghiChu) {
		this.ghiChu = ghiChu;
	}
	
}
