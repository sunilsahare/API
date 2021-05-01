package com.corona.api.service;

import java.util.List;

import com.corona.api.entities.Covid;

public interface CovidService {

	public Covid addCovidDetails(Covid covid);
	public List<Covid> getAllCovidDetails();
	public Covid getCovidDetails(Long id);
	public Covid updateCovidDetails(Covid covid);
	public String deleteCovidDetails(Long id);
}
