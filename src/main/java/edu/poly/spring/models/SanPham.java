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
	private HoaDonChiTiet hoaDonChiTiet;

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

	public String getHinh() {
		return hinh;
	}

	public void setHinh(String hinh) {
		this.hinh = hinh;
	}

	public Date getNgayDang() {
		return ngayDang;
	}

	public void setNgayDang(Date ngayDang) {
		this.ngayDang = ngayDang;
	}

	public Float getGiamGia() {
		return giamGia;
	}

	public void setGiamGia(Float giamGia) {
		this.giamGia = giamGia;
	}

	public Float getGia() {
		return gia;
	}

	public void setGia(Float gia) {
		this.gia = gia;
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

	public Boolean getTinhTrang() {
		return tinhTrang;
	}

	public void setTinhTrang(Boolean tinhTrang) {
		this.tinhTrang = tinhTrang;
	}

	public String getGhiChu() {
		return ghiChu;
	}

	public void setGhiChu(String ghiChu) {
		this.ghiChu = ghiChu;
	}

	public DanhMuc getDanhMuc() {
		return danhMuc;
	}

	public void setDanhMuc(DanhMuc danhMuc) {
		this.danhMuc = danhMuc;
	}

	public NhaCungCap getNhaCungCap() {
		return nhaCungCap;
	}

	public void setNhaCungCap(NhaCungCap nhaCungCap) {
		this.nhaCungCap = nhaCungCap;
	}

	public HoaDonChiTiet getHoaDonChiTiet() {
		return hoaDonChiTiet;
	}

	public void setHoaDonChiTiet(HoaDonChiTiet hoaDonChiTiet) {
		this.hoaDonChiTiet = hoaDonChiTiet;
	}

	public SanPham(String ma, String ten, String hinh, Date ngayDang, Float giamGia, Float gia, Date ngayBatDau,
			Date ngayKetThuc, String moTa, Boolean tinhTrang, String ghiChu, DanhMuc danhMuc, NhaCungCap nhaCungCap,
			HoaDonChiTiet hoaDonChiTiet) {
		super();
		this.ma = ma;
		this.ten = ten;
		this.hinh = hinh;
		this.ngayDang = ngayDang;
		this.giamGia = giamGia;
		this.gia = gia;
		this.ngayBatDau = ngayBatDau;
		this.ngayKetThuc = ngayKetThuc;
		this.moTa = moTa;
		this.tinhTrang = tinhTrang;
		this.ghiChu = ghiChu;
		this.danhMuc = danhMuc;
		this.nhaCungCap = nhaCungCap;
		this.hoaDonChiTiet = hoaDonChiTiet;
	}

	public SanPham() {
		super();
	}
	
}
