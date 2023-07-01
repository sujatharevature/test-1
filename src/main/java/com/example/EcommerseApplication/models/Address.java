package com.example.EcommerseApplication.models;

import java.util.List;

import javax.persistence.*;
import javax.validation.constraints.*;

@Entity
@Table(name = "address")

public class Address {
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	@Column(name = "id")
	private Long id;

	@ManyToOne
	@JoinColumn(name = "customer_id")
	private Customers customers;
	@OneToMany(mappedBy = "address")
	private List<Shipment> shipment;
	@NotBlank
	@Size(max = 100)
	@Column(name = "city")
	private String city;
	@NotBlank
	@Size(max = 100)
	@Column(name = "state")
	private String state;
	@NotBlank
	@Size(max = 100)
	@Column(name = "country")
	private String country;
	@NotNull
	@Min(6)
	@Max(6)
	@Column(name = "zip_code")
	private Integer zipCode;

	@NotNull
	@Column(name = "is_default")
	private Boolean isDefault;

	public Address() {
	}

	public Long getId() {
		return id;
	}

	public void setId(Long id) {
		this.id = id;
	}

	public String getCity() {
		return city;
	}

	public void setCity(String city) {
		this.city = city;
	}

	public String getState() {
		return state;
	}

	public void setState(String state) {
		this.state = state;
	}

	public String getCountry() {
		return country;
	}

	public void setCountry(String country) {
		this.country = country;
	}

	public Integer getZipCode() {
		return zipCode;
	}

	public void setZipCode(Integer zipCode) {
		this.zipCode = zipCode;
	}

	public Boolean getIsDefault() {
		return isDefault;
	}

	public void setIsDefault(Boolean isDefault) {
		this.isDefault = isDefault;
	}

}
