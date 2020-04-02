package edu.poly.spring.models;

import java.io.Serializable;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;

@Entity
public class MoTa implements Serializable{
	@Id
	@Column(name = "Ma",length = 10)
	private String ma;
	
	@Column(name = "HinhTruoc", length = 100)
	private String hinhTruoc;
	
	@Column(name = "HinhSau",length = 100)
	private String hinhSau;
	
	@Column(name = "Kieu", length = 50)
	private String kieu;
	
	@Column(name = "Mau", length = 50)
	private String mau;
	
	@Column(name = "KichCo", length = 50)
	private String kichCo;
	
	@Column(name = "DoTuoi")
	private Boolean doTuoi;
	
	@Column(name = "SoLuong")
	private int soLuong;
	
	@Column(name = "GhiChu", length = 200)
	private String ghiChu;
	
	@ManyToOne
	@JoinColumn(name = "MaSanPham")
	private SanPham sanPham;

	public MoTa(String ma, String hinhTruoc, String hinhSau, String kieu, String mau, String kichCo, Boolean doTuoi,
			int soLuong, String ghiChu, SanPham sanPham) {
		super();
		this.ma = ma;
		this.hinhTruoc = hinhTruoc;
		this.hinhSau = hinhSau;
		this.kieu = kieu;
		this.mau = mau;
		this.kichCo = kichCo;
		this.doTuoi = doTuoi;
		this.soLuong = soLuong;
		this.ghiChu = ghiChu;
		this.sanPham = sanPham;
	}

	public MoTa() {
		super();
	}

	public String getMa() {
		return ma;
	}

	public void setMa(String ma) {
		this.ma = ma;
	}

	public String getHinhTruoc() {
		return hinhTruoc;
	}

	public void setHinhTruoc(String hinhTruoc) {
		this.hinhTruoc = hinhTruoc;
	}

	public String getHinhSau() {
		return hinhSau;
	}

	public void setHinhSau(String hinhSau) {
		this.hinhSau = hinhSau;
	}

	public String getKieu() {
		return kieu;
	}

	public void setKieu(String kieu) {
		this.kieu = kieu;
	}

	public String getMau() {
		return mau;
	}

	public void setMau(String mau) {
		this.mau = mau;
	}

	public String getKichCo() {
		return kichCo;
	}

	public void setKichCo(String kichCo) {
		this.kichCo = kichCo;
	}

	public Boolean getDoTuoi() {
		return doTuoi;
	}

	public void setDoTuoi(Boolean doTuoi) {
		this.doTuoi = doTuoi;
	}

	public int getSoLuong() {
		return soLuong;
	}

	public void setSoLuong(int soLuong) {
		this.soLuong = soLuong;
	}

	public String getGhiChu() {
		return ghiChu;
	}

	public void setGhiChu(String ghiChu) {
		this.ghiChu = ghiChu;
	}

	public SanPham getSanPham() {
		return sanPham;
	}

	public void setSanPham(SanPham sanPham) {
		this.sanPham = sanPham;
	}
	
	
}
