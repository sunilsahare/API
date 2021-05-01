package com.weather.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.weather.entity.Weather;
import com.weather.repository.WeatherRepository;

@Service
public class WeatherServiceImpl implements WeatherService {

	@Autowired
	private WeatherRepository weatherRepo;
	
	@Override
	public List<Weather> getAllWeather() {
		return weatherRepo.findAll();
	}
	
	@Override
	public Weather getAllWeatherByCity(String city) {
		return weatherRepo.findByCity(city);
	}

	@Override
	public Weather getWeather(Long id) {
		return weatherRepo.findById(id).get();
	}

	@Override
	public Weather addWeather(Weather weather) {
		return weatherRepo.save(weather);
	}

	@Override
	public Weather updateWeather(Weather weather) {
		Weather exstingWeather = weatherRepo.findById(weather.getId()).get();
		exstingWeather.setCity(weather.getCity());
		exstingWeather.setTemperature(weather.getTemperature());
		weatherRepo.save(exstingWeather);
		return exstingWeather;
	}

	@Override
	public void removeWeather(Long id) {
		weatherRepo.deleteById(id);
	}

}
