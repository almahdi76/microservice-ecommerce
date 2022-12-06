package org.abc.facturation.entites;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.ManyToOne;
import javax.persistence.Transient;

import org.abc.facturation.model.Product;
import org.springframework.cloud.openfeign.FeignClient;

import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonProperty.Access;

@Entity
@FeignClient
public class ProductItm {
	@Id @GeneratedValue(strategy = GenerationType.IDENTITY)
	private Long id;
	private int quantity;
	private Long price;
	@ManyToOne
	@JsonProperty(access = Access.READ_ONLY)
	private Facture facture;
	
	private Long productId;
	
	@Transient
	private Product product;

	public ProductItm(int quantity, Long price, Facture facture, Long productId, Product product) {
		
		this.quantity = quantity;
		this.price = price;
		this.facture = facture;
		this.productId = productId;
		this.product = product;
	}

	public ProductItm() {
		
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

	public Long getPrice() {
		return price;
	}

	public void setPrice(Long price) {
		this.price = price;
	}

	public Facture getFacture() {
		return facture;
	}

	public void setFacture(Facture facture) {
		this.facture = facture;
	}

	public Long getProductId() {
		return productId;
	}

	public void setProductId(Long productId) {
		this.productId = productId;
	}

	public Product getProduct() {
		return product;
	}

	public void setProduct(Product product) {
		this.product = product;
	}
	
	

}
