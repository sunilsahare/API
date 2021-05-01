package com.weather.entity;

import javax.persistence.Entity;
import javax.persistence.Id;

import lombok.Data;

@Entity
@Data
public class Weather {

	@Id
	private Long id;
	private String city;
	private String temperature;
}
