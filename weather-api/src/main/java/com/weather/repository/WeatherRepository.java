package com.weather.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.weather.entity.Weather;

@Repository
public interface WeatherRepository extends JpaRepository<Weather, Long> {

	public Weather findByCity(String city);
	
}

