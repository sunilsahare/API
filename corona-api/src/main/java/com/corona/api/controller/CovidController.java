package com.corona.api.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

import com.corona.api.entities.Covid;
import com.corona.api.service.CovidService;

@RestController
public class CovidController {

	@Autowired
	CovidService covidService;
	
	//send all covid details
	@GetMapping("/covid")
	@ResponseBody
	public List<Covid> getAllCovidDetails() {
		return covidService.getAllCovidDetails();
	}
	
	//sent single covid details by id
	@GetMapping("/covid/{id}")
	public Covid getCovidDetails(@PathVariable Long id) {
		return covidService.getCovidDetails(id);
	}
	
	//add covid details
	@PostMapping("/covid")
	public Covid addCovidDetails(@RequestBody Covid covid) {
		return covidService.addCovidDetails(covid);
	}
	
	//update covid details
	@PutMapping("/covid")
	public Covid updateCovidDetails(@RequestBody Covid covid) {
		return covidService.updateCovidDetails(covid);
	}
	
	//delete covid Details
	@DeleteMapping("/covid/{id}")
	public String deleteCovidDetails(@PathVariable Long id) {
		return covidService.deleteCovidDetails(id);
	}
}
