package com.corona.api.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.corona.api.entities.Covid;
import com.corona.api.repos.CovidRepository;

@Service
public class CovidServiceImpl implements CovidService {

	@Autowired
	CovidRepository covidRepository;
	
	@Override
	public Covid addCovidDetails(Covid covid) {
		return covidRepository.save(covid);
	}

	@Override
	public List<Covid> getAllCovidDetails() {
		return covidRepository.findAll();
	}

	@Override
	public Covid getCovidDetails(Long id) {
		return covidRepository.findById(id).orElse(null);
	}

	@Override
	public Covid updateCovidDetails(Covid covid) {
		Long id = covid.getId();
		Covid lastDetails = covidRepository.findById(id).orElse(null);
		lastDetails.setCity(covid.getCity());
		lastDetails.setTotalPateints(covid.getTotalPateints());
		lastDetails.setTotalDeath(covid.getTotalDeath());
		lastDetails.setRecovered(covid.getRecovered());
		lastDetails.setAdmitted(covid.getAdmitted());
		
		//now save the current received covid details
		return covidRepository.save(lastDetails);
	}

	@Override
	public String deleteCovidDetails(Long id) {
		covidRepository.deleteById(id);
		return "Data Deleted Succesfully";
	}

}
