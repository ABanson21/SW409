package com.sw409.Hospital.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.sw409.Hospital.model.Patient;
import com.sw409.Hospital.service.PatientService;

import java.util.List;

@RestController
public class PatientController {
	@Autowired
	PatientService patService;
	
	//CREATE
	
	@PostMapping("api/v1/createPatient")
	public Patient createPatient(@RequestBody Patient patient)
	{	
	return patService.createPatient(patient);	
	}
	
	//READ
	@GetMapping("api/v1/getPatients")

	public List<Patient> getAllPatients(){
		return patService.findAllPatients();
	}
	
	//UPDATE
	@PutMapping("api/v1/updatePatient/{patientId}")
	public void updatePatient(@PathVariable("patientId") Integer id, @RequestBody Patient patient) {
	patService.updatePatient(id, patient);
	}
	
	//DELETE
	@DeleteMapping("api/v1/deletePatient/{patientId}")
	public void deletePatient(@PathVariable ("patientId") Integer id, @RequestBody Patient patient)
	{
		patService.deletePatient(id);
	}
	
	
	
	}
	


