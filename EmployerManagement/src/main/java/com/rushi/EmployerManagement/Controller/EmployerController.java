package com.rushi.EmployerManagement.Controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.HttpStatusCode;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.rushi.EmployerManagement.DTO.EmInquiryResponse;
import com.rushi.EmployerManagement.Service.EmployerService;

@RestController
@RequestMapping("/emp")
public class EmployerController {
	
	private EmployerService employerService;
	
	@Autowired
	public EmployerController(EmployerService employerService) {
		super();
		this.employerService = employerService;
	}




	@GetMapping("/inq/{id}")
	public ResponseEntity<EmInquiryResponse>emInquiry(@PathVariable String id ){
		EmInquiryResponse inquiryResponse=employerService.emInquiry(id);
		System.out.println(inquiryResponse);

		return new ResponseEntity(inquiryResponse,inquiryResponse.getCode());
		
	}

}
