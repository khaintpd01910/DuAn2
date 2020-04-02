package edu.poly.spring.models;

import java.io.Serializable;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.OneToOne;
@Entity
public class HoaDonChiTiet implements Serializable{

	@Id
	@Column(name = "Ma", length = 10)
	private String ma;
	
	@Column(name = "SoLuong")
	private int soLuong;
	
	@Column(name = "Gia")
	private float Gia;
	
	@Column(name = "GhiChu", length = 200)
	private String ghiChu;
	
	@OneToOne
	@JoinColumn(name = "MaSanPham")
	private SanPham sanPham;
	
	@ManyToOne
	@JoinColumn(name = "MaHoaDon")
	private HoaDon hoaDon;

	public HoaDonChiTiet() {
		super();
	}

	public HoaDonChiTiet(String ma, int soLuong, float gia, String ghiChu, SanPham sanPham, HoaDon hoaDon) {
		super();
		this.ma = ma;
		this.soLuong = soLuong;
		Gia = gia;
		this.ghiChu = ghiChu;
		this.sanPham = sanPham;
		this.hoaDon = hoaDon;
	}

	public String getMa() {
		return ma;
	}

	public void setMa(String ma) {
		this.ma = ma;
	}

	public int getSoLuong() {
		return soLuong;
	}

	public void setSoLuong(int soLuong) {
		this.soLuong = soLuong;
	}

	public float getGia() {
		return Gia;
	}

	public void setGia(float gia) {
		Gia = gia;
	}

	public String getGhiChu() {
		return ghiChu;
	}

	public void setGhiChu(String ghiChu) {
		this.ghiChu = ghiChu;
	}

	public SanPham getSanpham() {
		return sanPham;
	}

	public void setSanpham(SanPham sanPham) {
		this.sanPham = sanPham;
	}

	public HoaDon getHoaDon() {
		return hoaDon;
	}

	public void setHoaDon(HoaDon hoaDon) {
		this.hoaDon = hoaDon;
	}
}
