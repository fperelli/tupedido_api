package com.tupedido.api.model;

import java.io.Serializable;
import java.time.LocalDateTime;

import javax.persistence.Access;
import javax.persistence.AccessType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.ManyToOne;
import javax.persistence.OneToOne;
import javax.persistence.Table;

@Entity
@Table(name = "catalog_item")
@Access(value = AccessType.FIELD)
public class CatalogItem implements Serializable {

	/**
	 * 
	 */
	private static final long serialVersionUID = 2255280137244918036L;

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Long catalogItemId;

	@Column(name = "created_date", columnDefinition = "TIMESTAMP")
	private LocalDateTime createdDate;
	@Column(name = "modified_time", columnDefinition = "TIMESTAMP")
	private LocalDateTime modifiedDate;
	@ManyToOne
	private Catalog catalog;

	private String name;

	private String description;

	private Integer stock;

	private Double price;

	@OneToOne
	private Discount discount;

	@OneToOne
	private Slider imageSlider;

	public Long getCatalogItemId() {
		return catalogItemId;
	}

	public void setCatalogItemId(Long catalogItemId) {
		this.catalogItemId = catalogItemId;
	}

	public LocalDateTime getCreatedDate() {
		return createdDate;
	}

	public void setCreatedDate(LocalDateTime createdDate) {
		this.createdDate = createdDate;
	}

	public LocalDateTime getModifiedDate() {
		return modifiedDate;
	}

	public void setModifiedDate(LocalDateTime modifiedDate) {
		this.modifiedDate = modifiedDate;
	}

	public Catalog getCatalog() {
		return catalog;
	}

	public void setCatalog(Catalog catalog) {
		this.catalog = catalog;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getDescription() {
		return description;
	}

	public void setDescription(String description) {
		this.description = description;
	}

	public Integer getStock() {
		return stock;
	}

	public void setStock(Integer stock) {
		this.stock = stock;
	}

	public Double getPrice() {
		return price;
	}

	public void setPrice(Double price) {
		this.price = price;
	}

	public Discount getDiscount() {
		return discount;
	}

	public void setDiscount(Discount discount) {
		this.discount = discount;
	}

	public Slider getImageSlider() {
		return imageSlider;
	}

	public void setImageSlider(Slider imageSlider) {
		this.imageSlider = imageSlider;
	}
}