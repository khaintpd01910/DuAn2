package edu.poly.spring.models;

import java.io.Serializable;
import java.util.Set;

import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.OneToMany;

@Entity
public class NhaCungCap implements Serializable {
	@Id
	@Column(name = "Ma",length = 10)
	private String ma;
	
	@Column(length = 50,name = "Ten")
	private String ten;
	
	@Column(length = 50,name = "Email")
	private String email;
	
	@Column(length = 15,name = "SoDienThoai")
	private String soDienThoai;
	
	@Column(name = "DiaChi")
	private String diaChi;
	
	@Column(length = 100, name = "Website")
	private String website;
	
	@Column(name = "GhiChu")
	private String ghiChu;
	
	@OneToMany(mappedBy = "nhaCungCap",cascade = CascadeType.ALL)
	private Set<SanPham> sanPham;

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

	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}

	public String getSoDienThoai() {
		return soDienThoai;
	}

	public void setSoDienThoai(String soDienThoai) {
		this.soDienThoai = soDienThoai;
	}

	public String getDiaChi() {
		return diaChi;
	}

	public void setDiaChi(String diaChi) {
		this.diaChi = diaChi;
	}

	public String getWebsite() {
		return website;
	}

	public void setWebsite(String website) {
		this.website = website;
	}

	public String getGhiChu() {
		return ghiChu;
	}

	public void setGhiChu(String ghiChu) {
		this.ghiChu = ghiChu;
	}

	public Set<SanPham> getSanPham() {
		return sanPham;
	}

	public void setSanPham(Set<SanPham> sanPham) {
		this.sanPham = sanPham;
	}

	public NhaCungCap(String ma, String ten, String email, String soDienThoai, String diaChi, String website,
			String ghiChu, Set<SanPham> sanPham) {
		super();
		this.ma = ma;
		this.ten = ten;
		this.email = email;
		this.soDienThoai = soDienThoai;
		this.diaChi = diaChi;
		this.website = website;
		this.ghiChu = ghiChu;
		this.sanPham = sanPham;
	}

	public NhaCungCap() {
		super();
	}
	
	
}
