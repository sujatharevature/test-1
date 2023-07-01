package com.example.EcommerseApplication.models;

import java.time.LocalDateTime;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.OneToOne;
import javax.persistence.Table;
import javax.validation.constraints.NotNull;
@Entity
@Table(name = "shipment")
public class Shipment {
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	@Column(name = "id")
	private Long id;
	
	@OneToOne
	@JoinColumn(name = "orders_id")
	private Orders orders;
	@NotNull
	@Column(name = "shipment_status")
	private String shipmentStatus;
	
	@NotNull
	@Column(name = "shipment_date")
	private LocalDateTime shipmentDate;
	 @ManyToOne
	    @JoinColumn(name = "address_id")
	    private Address address;
	
	public Shipment() {
		
	}
	public Long getId() {
		return id;
	}
	public void setId(Long id) {
		this.id = id;
	}
	
	public String getShipmentStatus() {
		return shipmentStatus;
	}
	public void setShipmentStatus(String shipmentStatus) {
		this.shipmentStatus = shipmentStatus;
	}
	
	public LocalDateTime getShipmentDate() {
		return shipmentDate;
	}
	public void setShipmentDate(LocalDateTime shipmentDate) {
		this.shipmentDate = shipmentDate;
	}

}
