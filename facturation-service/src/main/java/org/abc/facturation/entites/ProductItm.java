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

}
