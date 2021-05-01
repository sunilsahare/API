package com.weather.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.weather.entity.Weather;
import com.weather.service.WeatherService;

@RestController
public class WeatherRESTController {

	@Autowired
	private WeatherService service;
	
	@GetMapping("/weather")
	public List<Weather> getAllWeathers(){
		return service.getAllWeather();
	}
	
	@GetMapping("/weather/{id}")
	public Weather getWeather(@PathVariable("id") Long id){
		return service.getWeather(id);
	}
	
	@GetMapping("/weather/{city}")
	public Weather getWeatherByCity(@PathVariable("city") String city){
		return service.getAllWeatherByCity(city);
	}
	
	@PostMapping("/weather")
	public Weather addWeather(@RequestBody Weather weather){
		return service.addWeather(weather);
	}
	
	@PutMapping("/weather")
	public Weather updateWeather(@RequestBody Weather weather){
		return service.updateWeather(weather);
	}
	
	@DeleteMapping("/weather/{id}")
	public String deleteWeather(@PathVariable("id") Long id){
		service.removeWeather(id);
		return "Data deleted Successfully.";
	}
	
	
}
