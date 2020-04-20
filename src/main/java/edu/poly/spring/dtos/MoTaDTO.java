package edu.poly.spring.dtos;

import java.io.Serializable;

import javax.persistence.Column;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.validation.constraints.NotNull;

import org.springframework.web.multipart.MultipartFile;

import edu.poly.spring.models.Products;

public class MoTaDTO implements Serializable {
	
	private String ma;

	@NotNull
	private MultipartFile hinhTruoc;

	@NotNull
	private MultipartFile  hinhSau;

	@NotNull
	private String kieu;

	@NotNull
	private String mau;

	@NotNull
	private String kichCo;
	
	@NotNull
	private Boolean doTuoi;

	@NotNull
	private int soLuong;


	private String ghiChu;

	
	private Products products;


	public String getMa() {
		return ma;
	}


	public void setMa(String ma) {
		this.ma = ma;
	}


	public MultipartFile getHinhTruoc() {
		return hinhTruoc;
	}


	public void setHinhTruoc(MultipartFile hinhTruoc) {
		this.hinhTruoc = hinhTruoc;
	}


	public MultipartFile getHinhSau() {
		return hinhSau;
	}


	public void setHinhSau(MultipartFile hinhSau) {
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


	public Products getSanPham() {
		return products;
	}


	public void setSanPham(Products products) {
		this.products = products;
	}

	
}