package com.CSA.CarSharingAndria.controller;

import java.util.List;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import com.CSA.CarSharingAndria.entity.Member;
import com.CSA.CarSharingAndria.service.MemberService;

@RestController
@RequestMapping("/api")
public class Controller {

	public static final Logger logger = LoggerFactory.getLogger(Controller.class);

	@Autowired
    MemberService memberService; 
	
	@RequestMapping(value = "/test", method = RequestMethod.GET)
	public ResponseEntity<String> getTestApi() {

		String output = "Test OK";
		return new ResponseEntity<String>(output, HttpStatus.OK);
	}

	@RequestMapping(value = "/members", method = RequestMethod.GET)
	public ResponseEntity<List<Member>> getAllMembers() {

		List<Member> listMembers =  memberService.findAllMembers();
		return new ResponseEntity<List<Member>>(listMembers, HttpStatus.OK);
	}
}