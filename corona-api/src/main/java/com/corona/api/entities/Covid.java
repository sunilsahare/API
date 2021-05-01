package com.corona.api.entities;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

@Entity
public class Covid {

	@Id
	private Long id;
	private String city;
	private Long totalPateints;
	private Long totalDeath;
	private Long recovered;
	private Long admitted;

	public Covid() {
		super();
		// TODO Auto-generated constructor stub
	}

	public Covid(String city, Long totalPateints, Long totalDeath, Long recovered, Long admitted) {
		super();
		this.city = city;
		this.totalPateints = totalPateints;
		this.totalDeath = totalDeath;
		this.recovered = recovered;
		this.admitted = admitted;
	}

	public Long getId() {
		return id;
	}

	public void setId(Long id) {
		this.id = id;
	}

	public String getCity() {
		return city;
	}

	public void setCity(String city) {
		this.city = city;
	}

	public Long getTotalPateints() {
		return totalPateints;
	}

	public void setTotalPateints(Long totalPateints) {
		this.totalPateints = totalPateints;
	}

	public Long getTotalDeath() {
		return totalDeath;
	}

	public void setTotalDeath(Long totalDeath) {
		this.totalDeath = totalDeath;
	}

	public Long getRecovered() {
		return recovered;
	}

	public void setRecovered(Long recovered) {
		this.recovered = recovered;
	}

	public Long getAdmitted() {
		return admitted;
	}

	public void setAdmitted(Long admitted) {
		this.admitted = admitted;
	}

	@Override
	public String toString() {
		return "Covid [id=" + id + ", city=" + city + ", totalPateints=" + totalPateints + ", totalDeath=" + totalDeath
				+ ", recovered=" + recovered + ", admitted=" + admitted + "]";
	}

}
