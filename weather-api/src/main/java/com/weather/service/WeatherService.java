package com.weather.service;

import java.util.List;

import com.weather.entity.Weather;

public interface WeatherService {

	public List<Weather> getAllWeather();
	public Weather getWeather(Long id);
	public Weather addWeather(Weather weather);
	public Weather updateWeather(Weather weather);
	public void removeWeather(Long id);
	public Weather getAllWeatherByCity(String city);
	
}
