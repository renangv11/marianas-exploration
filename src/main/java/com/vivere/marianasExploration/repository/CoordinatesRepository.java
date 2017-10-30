package com.vivere.marianasExploration.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.vivere.marianasExploration.entity.Coordinates;

public interface CoordinatesRepository extends JpaRepository<Coordinates, String>{
	
}
