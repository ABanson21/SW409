package com.sw409.Hospital.service;

	import java.util.ArrayList;
	import org.springframework.beans.factory.annotation.Autowired;
	import org.springframework.stereotype.Service;
	import org.springframework.web.bind.annotation.DeleteMapping;
	import org.springframework.web.bind.annotation.GetMapping;
	import org.springframework.web.bind.annotation.PathVariable;
	import org.springframework.web.bind.annotation.PostMapping;
	import org.springframework.web.bind.annotation.PutMapping;
	import org.springframework.web.bind.annotation.RequestBody;
	import org.springframework.web.bind.annotation.RestController;

import com.sw409.Hospital.controller.Repositories.PatientRepository;
import com.sw409.Hospital.model.Patient;
import com.sw409.Hospital.service.PatientService;

import java.util.List;
	
	
	
	
@Service
public class PatientService {
	List<Patient> patientList = new ArrayList<>();
		
	@Autowired
	PatientRepository patientRepository;
	public Patient createPatient(Patient patient) 
	{
		return patientRepository.save(patient);	
	}
		
	public List<Patient> findAllPatients()
	{
		return (ArrayList<Patient>) patientRepository.findAll();
	}
		
		//update
	public void updatePatient(Integer id, Patient patient) 
		{
		Patient oldPatient = patientRepository.findById(id).get();
		oldPatient.setAge(patient.getAge());
		oldPatient.setName(patient.getName());
		patientRepository.save(patient);
			}
	//Delete
	public void deletePatient(Integer id) {
		patientRepository.deleteById(id);
	}

	
		
}