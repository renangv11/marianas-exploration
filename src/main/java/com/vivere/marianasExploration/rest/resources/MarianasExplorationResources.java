package com.vivere.marianasExploration.rest.resources;

import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PathVariable;

import com.vivere.marianasExploration.rest.response.CoordinatesResponse;

public interface MarianasExplorationResources {

	ResponseEntity<CoordinatesResponse> moveSubmarine(@PathVariable Integer submarine,
			@PathVariable String coordinates);

}
