package com.demo.entity;

import java.util.Set;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.Id;
import javax.persistence.OneToMany;
import javax.persistence.Table;

import com.fasterxml.jackson.annotation.JsonIgnore;

@Entity
@Table(name = "customer")
public class CustomerEntity {

	@Id
	@Column(name = "customer_phone", nullable = false)
	private int phone;

	@Column(name = "customer_name")
	private String customerName;

	@JsonIgnore
	@OneToMany(mappedBy = "customerEntity", fetch = FetchType.LAZY)
	private Set<OrdersEntity> ordersEntity;

//	@OneToMany(mappedBy = "customerEntity", fetch = FetchType.LAZY)
//	private Set<VoucherEntity> voucherEntity;

	public Set<OrdersEntity> getOrdersEntity() {
		return ordersEntity;
	}

	public void setOrdersEntity(Set<OrdersEntity> ordersEntity) {
		this.ordersEntity = ordersEntity;
	}

	public CustomerEntity() {
		// TODO Auto-generated constructor stub
	}

	public int getPhone() {
		return phone;
	}

	public void setPhone(int phone) {
		this.phone = phone;
	}

	public String getCustomerName() {
		return customerName;
	}

	public void setCustomerName(String customerName) {
		this.customerName = customerName;
	}

//	public Set<VoucherEntity> getVoucherEntity() {
//		return voucherEntity;
//	}
//
//	public void setVoucherEntity(Set<VoucherEntity> voucherEntity) {
//		this.voucherEntity = voucherEntity;
//	}

}
