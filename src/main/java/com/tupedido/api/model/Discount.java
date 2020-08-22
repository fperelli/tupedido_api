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
@Table(name = "discount")
@Access(value = AccessType.FIELD)
public class Discount implements Serializable {

	/**
	 * 
	 */
	private static final long serialVersionUID = -3889226368146391717L;

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Long discountId;

	private Double percentage;

	private Double fixedValue;

	public Long getDiscountId() {
		return discountId;
	}

	public void setDiscountId(Long discountId) {
		this.discountId = discountId;
	}

	public Double getPercentage() {
		return percentage;
	}

	public void setPercentage(Double percentage) {
		this.percentage = percentage;
	}

	public Double getFixedValue() {
		return fixedValue;
	}

	public void setFixedValue(Double fixedValue) {
		this.fixedValue = fixedValue;
	}

}
