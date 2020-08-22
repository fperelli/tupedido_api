package com.tupedido.api.model;

import java.io.Serializable;

import javax.persistence.Access;
import javax.persistence.AccessType;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name = "store_format")
@Access(value = AccessType.FIELD)
public class StoreFormat implements Serializable {

	/**
	 * 
	 */
	private static final long serialVersionUID = -4800237777267159141L;
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Long storeFormatId;

	public Long getStoreFormatId() {
		return storeFormatId;
	}

	public void setStoreFormatId(Long storeFormatId) {
		this.storeFormatId = storeFormatId;
	}
}
