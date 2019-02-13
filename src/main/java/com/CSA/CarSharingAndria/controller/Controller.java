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
import com.CSA.CarSharingAndria.excel.ExcelFactory;
import com.CSA.CarSharingAndria.service.MemberService;

@RestController
@RequestMapping("/api")
public class Controller {

	public static final Logger logger = LoggerFactory.getLogger(Controller.class);

	@Autowired
    MemberService memberService; 
	
	@RequestMapping(value = "/test", method = RequestMethod.GET)
	public ResponseEntity<String> getTestApi() {
		System.out.println("TEST OK");
		String output = "Test OK - with sheet";
		return new ResponseEntity<String>(output, HttpStatus.OK);
	}

	@RequestMapping(value = "/members", method = RequestMethod.GET)
	public ResponseEntity<List<Member>> getAllMembers() {
		System.out.println("member list");
		List<Member> listMembers =  memberService.findAllMembers();
		return new ResponseEntity<List<Member>>(listMembers, HttpStatus.OK);
	}
	
	@RequestMapping(value = "/testSheet/", method = RequestMethod.GET)
	public ResponseEntity<String> getTestSheet() throws Exception {
		System.out.println("Test OK Test Sheet");
		
		List<List<Object>> values = ExcelFactory.getInstance().getValueRange("CARSH!A3:G3");
		
		String output = "Test Sheet - ";	
		if (values == null || values.isEmpty()) {
			output= output.concat("No data found.");
		} else {
			for (List row : values) {
				output= output.concat(row.get(0) + " / " + row.get(3) + " | ");
			}
		}
		
		return new ResponseEntity<String>(output, HttpStatus.OK);
	}
}