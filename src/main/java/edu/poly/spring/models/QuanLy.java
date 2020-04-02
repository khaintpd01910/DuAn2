package edu.poly.spring.models;

import java.io.Serializable;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;

@Entity
public class QuanLy implements Serializable {
	@Id
	@Column(length = 50, name = "TaiKhoan")
	private String taiKhoan;
	
	@Column(length = 50, name = "MatKhau")
	private String matKhau;
	
	@Column(length = 50,name = "Email")
	private String email;
	
	@Column(length = 15, name = "SoDienThoai")
	private String soDienThoai;

	public QuanLy(String taiKhoan, String matKhau, String email, String soDienThoai) {
		super();
		this.taiKhoan = taiKhoan;
		this.matKhau = matKhau;
		this.email = email;
		this.soDienThoai = soDienThoai;
	}

	public QuanLy() {
		super();
	}

	public String getTaiKhoan() {
		return taiKhoan;
	}

	public void setTaiKhoan(String taiKhoan) {
		this.taiKhoan = taiKhoan;
	}

	public String getMatKhau() {
		return matKhau;
	}

	public void setMatKhau(String matKhau) {
		this.matKhau = matKhau;
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
	
}
