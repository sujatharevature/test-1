package com.example.EcommerseApplication.models;

import java.util.List;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.OneToMany;
import javax.persistence.OneToOne;
import javax.persistence.Table;
import javax.validation.constraints.Email;
import javax.validation.constraints.NotBlank;
import javax.validation.constraints.Size;

@Entity
@Table(name = "customers")

public class Customers {
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	@Column(name = "id")
	private Long id;

	   @OneToOne(mappedBy = "customers")
	    private Cart cart;

	@OneToMany(mappedBy = "customers")
	private List<Address> address;

	@OneToMany(mappedBy = "customers")
	private List<Orders> orders;
	@NotBlank
	@Size(max = 100)
	@Column(name = "first_name")

	private String firstName;
	@NotBlank
	@Size(max = 100)
	@Column(name = "last_name")
	private String lastName;
	@Email
	@Column(name = "email")
	private String email;
	@NotBlank
	@Size(max = 100)
	@Column(name = "password")
	private String password;
	@NotBlank
	@Size(max = 10)
	@Column(name = "phone_number")
	private Long phoneNumber;

	public Customers() {

	}

	public Long getId() {
		return id;
	}

	public void setId(Long id) {
		this.id = id;
	}

	public String getFirstName() {
		return firstName;
	}

	public void setFirstName(String firstName) {
		this.firstName = firstName;
	}

	public String getLastName() {
		return lastName;
	}

	public void setLastName(String lastName) {
		this.lastName = lastName;
	}

	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}

	public String getPassword() {
		return password;
	}

	public void setPassword(String password) {
		this.password = password;
	}

	public Long getPhoneNumber() {
		return phoneNumber;
	}

	public void setPhoneNumber(Long phoneNumber) {
		this.phoneNumber = phoneNumber;
	}

}
