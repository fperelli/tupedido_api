package com.tupedido.api.model;

import java.io.Serializable;
import java.util.List;

import javax.persistence.Access;
import javax.persistence.AccessType;
import javax.persistence.ElementCollection;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name = "slider")
@Access(value = AccessType.FIELD)
public class Slider implements Serializable {

	/**
	 * 
	 */
	private static final long serialVersionUID = -7965247206450845561L;

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Long sliderId;

	@ElementCollection
	private List<String> imgUrls;

	public Long getSliderId() {
		return sliderId;
	}

	public void setSliderId(Long sliderId) {
		this.sliderId = sliderId;
	}

	/**
	 * @return the imgUrls
	 */
	public List<String> getImgUrls() {
		return imgUrls;
	}

	/**
	 * @param imgUrls
	 *            the imgUrls to set
	 */
	public void setImgUrls(List<String> imgUrls) {
		this.imgUrls = imgUrls;
	}
}
