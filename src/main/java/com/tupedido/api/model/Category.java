package com.tupedido.api.model;

import java.io.Serializable;
import java.util.List;

import javax.persistence.Access;
import javax.persistence.AccessType;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.OneToMany;
import javax.persistence.Table;

@Entity
@Table(name = "category")
@Access(value = AccessType.FIELD)
public class Category implements Serializable {

	/**
	 * 
	 */
	private static final long serialVersionUID = 1659007541940920437L;

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Long categoryId;

	private String name;

	private String imgUrl;

	@OneToMany(mappedBy = "catalog")
	private List<CatalogItem> catalogItems;

	public Long getCategoryId() {
		return categoryId;
	}

	public void setCategoryId(Long categoryId) {
		this.categoryId = categoryId;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getImgUrl() {
		return imgUrl;
	}

	public void setImgUrl(String imgUrl) {
		this.imgUrl = imgUrl;
	}

	/**
	 * @return the catalogItems
	 */
	public List<CatalogItem> getCatalogItems() {
		return catalogItems;
	}

	/**
	 * @param catalogItems
	 *            the catalogItems to set
	 */
	public void setCatalogItems(List<CatalogItem> catalogItems) {
		this.catalogItems = catalogItems;
	}

}
