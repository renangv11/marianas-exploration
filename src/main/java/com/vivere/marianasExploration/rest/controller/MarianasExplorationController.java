package com.vivere.marianasExploration.rest.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RestController;

import com.vivere.marianasExploration.entity.Coordinates;
import com.vivere.marianasExploration.repository.CoordinatesRepository;
import com.vivere.marianasExploration.rest.resources.MarianasExplorationResources;
import com.vivere.marianasExploration.rest.response.CoordinatesResponse;

@RestController
public class MarianasExplorationController implements MarianasExplorationResources {

	@Autowired
	CoordinatesRepository coordinatesRepository;

	@Override
	@PostMapping(value = "move/{submarine}/{coordinates}")
	public ResponseEntity<CoordinatesResponse> moveSubmarine(@PathVariable("submarine") Integer submarine,
			@PathVariable("coordinates") String coordinates) {

		Coordinates submarineCoordinates = new Coordinates();
		submarineCoordinates.setSubmarine(submarine);
		submarineCoordinates.setDirection("north");

		coordinatesRepository.save(submarineCoordinates);

		System.out.println(coordinatesRepository.findBySubmarine(submarine).getDirection());
		// return ResponseEntity.ok(coordina);
		return null;
	}

}
