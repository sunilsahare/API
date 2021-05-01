package com.corona.api.repos;

import org.springframework.data.jpa.repository.JpaRepository;

import com.corona.api.entities.Covid;

public interface CovidRepository extends JpaRepository<Covid, Long> {

}
