package com.example.EcommerseApplication.models;

import java.time.LocalDateTime;
import java.util.List;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.OneToMany;
import javax.persistence.OneToOne;
import javax.persistence.Table;
import javax.validation.constraints.NotBlank;
import javax.validation.constraints.NotNull;
import javax.validation.constraints.Size;

@Entity
@Table(name = "orders")
public class Orders {
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	@Column(name = "id")
	private Long id;
	@OneToMany(mappedBy = "Orders")
    private List<OrderItem> orderItem;
	
	   @OneToOne(mappedBy = "orders")
	    private Shipment shipment;
	
	
	@OneToOne
	@JoinColumn(name = "payment_id")
	private Payment payment;
	@Column(name = "order_date")
	private LocalDateTime orderDate;
	@ManyToOne
	@JoinColumn(name = "customer_id")
	private Customers customers;
	
	@NotNull
	@Size(max = 100)
	@Column(name = "total_price")
	private Long totalPrice;

	public Orders() {

	}

	public Long getId() {
		return id;
	}

	public void setId(Long id) {
		this.id = id;
	}

	public LocalDateTime getOrderDate() {
		return orderDate;
	}

	public void setOrderDate(LocalDateTime orderDate) {
		this.orderDate = orderDate;
	}

	

}
