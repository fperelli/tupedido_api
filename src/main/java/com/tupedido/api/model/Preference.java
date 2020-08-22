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
@Table(name = "preference")
@Access(value = AccessType.FIELD)
public class Preference implements Serializable {

	/**
	 * 
	 */
	private static final long serialVersionUID = -4072104356868796517L;

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Long preferenceId;

	private Boolean isDayMode;

	public Long getPreferenceId() {
		return preferenceId;
	}

	public void setPreferenceId(Long preferenceId) {
		this.preferenceId = preferenceId;
	}

	public Boolean getIsDayMode() {
		return isDayMode;
	}

	public void setIsDayMode(Boolean isDayMode) {
		this.isDayMode = isDayMode;
	}

}
