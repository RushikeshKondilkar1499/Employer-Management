package com.rushi.EmployerManagement.Service;

import java.util.*;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.HttpStatusCode;
import org.springframework.stereotype.Service;

import com.rushi.EmployerManagement.DTO.EmInquiryResponse;
import com.rushi.EmployerManagement.Exceptions.EmployerNotFoundeExcepttion;
import com.rushi.EmployerManagement.Model.Employer;
import com.rushi.EmployerManagement.Repository.EmployerRepository;

@Service
public class EmployerService {

	private EmployerRepository employerRepository;

	@Autowired
	public EmployerService(EmployerRepository employerRepository) {
		super();
		this.employerRepository = employerRepository;
	}

	public EmInquiryResponse emInquiry(String id) {
		EmInquiryResponse inquiryResponse = new EmInquiryResponse();
		try {
			Optional<Employer> employer = employerRepository.findById(id);
			List<Employer>list=new ArrayList<>();
			System.out.println(employer);
			if (employer.isPresent()) {
				Employer employerObj=employer.get();
				inquiryResponse.setCode(HttpStatus.OK);
				inquiryResponse.setStatus("Sucess");
				System.out.println(employerObj);
				list.add(employer.get());
				inquiryResponse.setData(list);
				inquiryResponse.setMessage("Sucessfuly retrive the data");
				return inquiryResponse;
				
			} else {
				throw new EmployerNotFoundeExcepttion("Employer is not availble for code");
			}

		} catch (EmployerNotFoundeExcepttion ex) {
			inquiryResponse.setCode(HttpStatus.NOT_FOUND);
			inquiryResponse.setStatus("Failed");
			inquiryResponse.setData(null);
			inquiryResponse.setMessage("Data is not available for code");

			return inquiryResponse;
		} catch (Exception e) {
			inquiryResponse.setCode(HttpStatus.INTERNAL_SERVER_ERROR);
			inquiryResponse.setStatus("Failed");
			inquiryResponse.setData(null);
			inquiryResponse.setMessage("Internal Server Error");

			return inquiryResponse;
		}

		
	}

}
