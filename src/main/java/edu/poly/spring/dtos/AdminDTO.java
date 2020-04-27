package edu.poly.spring.dtos;

import java.io.Serializable;

import javax.validation.constraints.Email;
import javax.validation.constraints.Min;
import javax.validation.constraints.NotBlank;
import javax.validation.constraints.NotEmpty;
import javax.validation.constraints.NotNull;
import javax.validation.constraints.Pattern;
import javax.validation.constraints.Size;

import org.hibernate.validator.constraints.Length;

public class AdminDTO implements Serializable{

	@NotNull
	@NotEmpty(message = "Username is empty")
	@Length(min = 5, max = 50, message = "Username is out of range")
	private String username;

	@NotNull
	@NotEmpty(message = "Password is empty")
	@Length(min = 5, max = 50, message = "Password is out of range")
	private String password;

	@NotNull
	@Email(message = "Email invalidate")
	@NotEmpty(message = "Email is empty")
	private String email;

	@NotNull
	@NotEmpty(message = "Phone is empty")
	@Pattern(regexp = "[0-9] {10}",message = "The phone number is not correct")
	private String phone;

	public String getUsername() {
		return username;
	}

	public void setUsername(String username) {
		this.username = username;
	}

	public String getPassword() {
		return password;
	}

	public void setPassword(String password) {
		this.password = password;
	}

	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}

	public String getPhone() {
		return phone;
	}

	public void setPhone(String phone) {
		this.phone = phone;
	}

}
