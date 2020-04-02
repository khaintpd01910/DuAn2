package edu.poly.spring.models;

import java.io.Serializable;
import java.util.Set;

import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.OneToMany;

@Entity
public class DanhMuc implements Serializable {
	@Id
	@Column(name = "Ma", length = 10)
	private String ma;
	
	@Column(name = "Ten", length = 50)
	private String ten;
	
	@OneToMany(mappedBy = "danhMuc", cascade = CascadeType.ALL)
	private Set<SanPham> sanPham;

	public DanhMuc() {
		super();
	}

	public DanhMuc(String ma, String ten, Set<SanPham> sanPham) {
		super();
		this.ma = ma;
		this.ten = ten;
		this.sanPham = sanPham;
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

	public Set<SanPham> getSanPham() {
		return sanPham;
	}

	public void setSanPham(Set<SanPham> sanPham) {
		this.sanPham = sanPham;
	}

	
}
