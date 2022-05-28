package com.example.javaguide.springbackendhosp.controller;

import java.util.List;



import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;


import com.example.javaguide.springbackendhosp.model.doctor;
import com.example.javaguide.springbackendhosp.model.patient;
import com.example.javaguide.springbackendhosp.repository.doctorRepository;
import com.example.javaguide.springbackendhosp.repository.patientRepository;

@RestController
@CrossOrigin("*")
@RequestMapping("/api/v1/")
public class hospiController {

	@Autowired
	private doctorRepository doctorR;
	
	@RequestMapping("/doctors")
	public List<doctor> getAllDoctors()
	{
		return doctorR.findAll();
	}
	
   @Autowired
	private patientRepository patientR;
	
	@GetMapping("/patient")
	public List<patient> getPatientDetails()
	{
		return  patientR.findAll();
	}
	
	@GetMapping("/getDoctor")
	public List<String> getDoctor()
	{   
		return  doctorR.findAllDoctor() ;
		
	}
	@PostMapping("/patient")
	public patient createPatient( @RequestBody patient p)
	{
		return patientR.save(p);
	}
	@GetMapping(path="/doctor/{name}")
	public List<String> getDoctorDetailByname(@PathVariable String name)
	{
		return doctorR.findbydoctorName(name);
	}
	@GetMapping("/getCount")
	public List<String> getPatientNumber()
	{   
		return  doctorR.findPatientNumber();
		
	}
	
	
	

	
}
