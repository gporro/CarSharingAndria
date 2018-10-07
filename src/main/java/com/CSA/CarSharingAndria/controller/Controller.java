package com.CSA.CarSharingAndria.controller;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/api")
public class Controller {

	public static final Logger logger = LoggerFactory.getLogger(Controller.class);

	@RequestMapping(value = "/test/", method = RequestMethod.GET)
	public ResponseEntity<String> getTestApi() {

		String output = "Test OK";
		return new ResponseEntity<String>(output, HttpStatus.OK);
	}
}