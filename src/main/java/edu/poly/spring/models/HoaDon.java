package edu.poly.spring.models;


import java.io.Serializable;
import java.util.Date;
import java.util.Set;

import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.OneToMany;
import javax.persistence.OneToOne;
import javax.persistence.Temporal;
import javax.persistence.TemporalType;

import org.springframework.format.annotation.DateTimeFormat;

@Entity
public class HoaDon implements Serializable{
	@Id
	@Column(name = "Ma",length = 10)
	private String ma;
	
	@Column(name = "Tong")
	private float tong;
	
	@Column(name = "DiaChi",length = 200)
	private String diaChi;
	
	@Column(name = "GhiChu", length = 200)
	private String ghiChu;
	
	@Column(name = "TrangThai")
	private Boolean trangThai;
	
	@Column(name = "NgayDat")
	@Temporal(TemporalType.DATE)
	@DateTimeFormat(pattern = "dd/MM/yyyy")
	private Date ngayDat;
	
	@Column(name = "NgayNhan")
	@Temporal(TemporalType.DATE)
	@DateTimeFormat(pattern = "dd/MM/yyyy")
	private Date ngayNhan;
	
	@Column(name = "PhiVanChuyen")
	private float phiVanChuyen;
	
	@OneToOne
	@JoinColumn(name = "MaKhachHang")
	private KhachHang khachHang;

	@OneToMany(mappedBy = "hoaDon",cascade = CascadeType.ALL)
	private Set<HoaDonChiTiet> hoaDonChiTiet;

	public HoaDon() {
		super();
	}

	public String getMa() {
		return ma;
	}

	public void setMa(String ma) {
		this.ma = ma;
	}

	public float getTong() {
		return tong;
	}

	public void setTong(float tong) {
		this.tong = tong;
	}

	public String getDiaChi() {
		return diaChi;
	}

	public void setDiaChi(String diaChi) {
		this.diaChi = diaChi;
	}

	public String getGhiChu() {
		return ghiChu;
	}

	public void setGhiChu(String ghiChu) {
		this.ghiChu = ghiChu;
	}

	public Boolean getTrangThai() {
		return trangThai;
	}

	public void setTrangThai(Boolean trangThai) {
		this.trangThai = trangThai;
	}

	public Date getNgayDat() {
		return ngayDat;
	}

	public void setNgayDat(Date ngayDat) {
		this.ngayDat = ngayDat;
	}

	public Date getNgayNhan() {
		return ngayNhan;
	}

	public void setNgayNhan(Date ngayNhan) {
		this.ngayNhan = ngayNhan;
	}

	public float getPhiVanChuyen() {
		return phiVanChuyen;
	}

	public void setPhiVanChuyen(float phiVanChuyen) {
		this.phiVanChuyen = phiVanChuyen;
	}

	public KhachHang getKhachHang() {
		return khachHang;
	}

	public void setKhachHang(KhachHang khachHang) {
		this.khachHang = khachHang;
	}

	public Set<HoaDonChiTiet> getHoaDonChiTiet() {
		return hoaDonChiTiet;
	}

	public void setHoaDonChiTiet(Set<HoaDonChiTiet> hoaDonChiTiet) {
		this.hoaDonChiTiet = hoaDonChiTiet;
	}

	public HoaDon(String ma, float tong, String diaChi, String ghiChu, Boolean trangThai, Date ngayDat, Date ngayNhan,
			float phiVanChuyen, KhachHang khachHang, Set<HoaDonChiTiet> hoaDonChiTiet) {
		super();
		this.ma = ma;
		this.tong = tong;
		this.diaChi = diaChi;
		this.ghiChu = ghiChu;
		this.trangThai = trangThai;
		this.ngayDat = ngayDat;
		this.ngayNhan = ngayNhan;
		this.phiVanChuyen = phiVanChuyen;
		this.khachHang = khachHang;
		this.hoaDonChiTiet = hoaDonChiTiet;
	}
}
