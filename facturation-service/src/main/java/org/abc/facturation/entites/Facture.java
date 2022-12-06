package org.abc.facturation.entites;

import java.sql.Date;
import java.util.List;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

import javax.persistence.OneToMany;
import javax.persistence.Transient;

import org.abc.facturation.model.Customer;
import org.springframework.cloud.openfeign.EnableFeignClients;


@Entity
@EnableFeignClients
public class Facture {
	@Id @GeneratedValue(strategy = GenerationType.IDENTITY)
	private Long id;
	private int quantity;
	private double price;
	private Date dateFacturation;
	private Long CustomerId;
	private double discount;
	
	
	@OneToMany(mappedBy = "facture")
	private List<ProductItm> productItem;
	@Transient
	private Customer customer;
	
	public Facture() {
		
	}
	public Long getId() {
		return id;
	}
	public void setId(Long id) {
		this.id = id;
	}
	public int getQuantity() {
		return quantity;
	}
	public void setQuantity(int quantity) {
		this.quantity = quantity;
	}
	public double getPrice() {
		return price;
	}
	public void setPrice(double price) {
		this.price = price;
	}
	public Date getDateFacturation() {
		return dateFacturation;
	}
	public void setDateFacturation(Date dateFacturation) {
		this.dateFacturation = dateFacturation;
	}
	public Long getCustomerId() {
		return CustomerId;
	}
	public void setCustomerId(Long customerId) {
		CustomerId = customerId;
	}
	public List<ProductItm> getProductItem() {
		return productItem;
	}
	public void setProductItem(List<ProductItm> productItem) {
		this.productItem = productItem;
	}
	public Customer getCustomer() {
		return customer;
	}
	public void setCustomer(Customer customer) {
		this.customer = customer;
	}
	
	
	
	
	
	
	
	
	

}
