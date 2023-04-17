package com.tns.shopping_mall;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

@Entity

public class Customer {
	private Integer customerId;
	private String customer_name;
	private String customer_location;
	private Integer customer_no;
	private String product;
	private Integer amount;
	public Customer() {
		super();
		// TODO Auto-generated constructor stub
	}
	public Customer(Integer customerId, String customer_name, String customer_location, Integer customer_no,
			String product, Integer amount) {
		super();
		this.customerId = customerId;
		this.customer_name = customer_name;
		this.customer_location = customer_location;
		this.customer_no = customer_no;
		this.product = product;
		this.amount = amount;
	}
	
	@Id
	@GeneratedValue (strategy=GenerationType.IDENTITY)
	
	public Integer getCustomerId() {
		return customerId;
	}
	public void setCustomerId(Integer customerId) {
		this.customerId = customerId;
	}
	public String getCustomer_name() {
		return customer_name;
	}
	public void setCustomer_name(String customer_name) {
		this.customer_name = customer_name;
	}
	public String getCustomer_location() {
		return customer_location;
	}
	public void setCustomer_location(String customer_location) {
		this.customer_location = customer_location;
	}
	public Integer getCustomer_no() {
		return customer_no;
	}
	public void setCustomer_no(Integer customer_no) {
		this.customer_no = customer_no;
	}
	public String getProduct() {
		return product;
	}
	public void setProduct(String product) {
		this.product = product;
	}
	public Integer getAmount() {
		return amount;
	}
	public void setAmount(Integer amount) {
		this.amount = amount;
	}
	@Override
	public String toString() {
		return "Customer [customerId=" + customerId + ", customer_name=" + customer_name + ", customer_location="
				+ customer_location + ", customer_no=" + customer_no + ", product=" + product + ", amount=" + amount
				+ "]";
	}
	
	

}

}
