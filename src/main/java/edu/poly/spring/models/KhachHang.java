package edu.poly.spring.models;

import java.io.Serializable;
import java.util.Date;
import java.util.Set;

import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.OneToOne;
import javax.persistence.Temporal;
import javax.persistence.TemporalType;

import org.springframework.format.annotation.DateTimeFormat;

@Entity
public class KhachHang implements Serializable {
	@Id
	@Column(length = 10,name = "Ma")
	private String ma;
	
	@Column(length = 50,name = "Ten")
	private String ten;
	
	@Column(length = 50,name = "TaiKhoan")
	private String taiKhoan;
	
	@Column(length = 50,name = "MatKhau")
	private String matKhau;
	
	@Column(length = 50,name = "Email")
	private String email;
	
	@Column(length = 100,name = "Hinh")
	private String hinh;
	
	@Column(length = 15,name = "SoDienThoai")
	private String soDienThoai;
	
	@Column(name = "DiaChi",length = 200)
	private String diaChi;
	
	@Column(name = "NgayTao")
	@Temporal(TemporalType.DATE)
	@DateTimeFormat(pattern = "dd/MM/yyyy")
	private Date ngayTao;
	
	@Column(name = "GhiChu",length = 200)
	private String ghiChu;
	
	@OneToOne(mappedBy = "khachHang",cascade = CascadeType.ALL)
	private HoaDon hoaDon;

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

	public String getHinh() {
		return hinh;
	}

	public void setHinh(String hinh) {
		this.hinh = hinh;
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

	public Date getNgayTao() {
		return ngayTao;
	}

	public void setNgayTao(Date ngayTao) {
		this.ngayTao = ngayTao;
	}

	public String getGhiChu() {
		return ghiChu;
	}

	public void setGhiChu(String ghiChu) {
		this.ghiChu = ghiChu;
	}

	public HoaDon getHoaDon() {
		return hoaDon;
	}

	public void setHoaDon(HoaDon hoaDon) {
		this.hoaDon = hoaDon;
	}

	public KhachHang(String ma, String ten, String taiKhoan, String matKhau, String email, String hinh,
			String soDienThoai, String diaChi, Date ngayTao, String ghiChu, HoaDon hoaDon) {
		super();
		this.ma = ma;
		this.ten = ten;
		this.taiKhoan = taiKhoan;
		this.matKhau = matKhau;
		this.email = email;
		this.hinh = hinh;
		this.soDienThoai = soDienThoai;
		this.diaChi = diaChi;
		this.ngayTao = ngayTao;
		this.ghiChu = ghiChu;
		this.hoaDon = hoaDon;
	}

	public KhachHang() {
		super();
	}
	
	
}
