package Controller;

import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import Model.PatientModel;
import Service.PatientService;
import java.util.List;

@RestController
public class PatientController {
	PatientService patService = new PatientService();
	
	//CREATE
	
	@PostMapping("api/v1/createPatient")
	public PatientModel createPatient(@RequestBody PatientModel patientModel)
	{	
	return patService.createPatient(patientModel);	
	}
	
	//READ
	@GetMapping("api/v1/getAllPatients")

	public List<PatientModel> getAllPatients(){
		return patService.findAllPatients();
	}
	
	//UPDATE
	@PutMapping("api/v1/updatePatient/{patientId}")
	public void updatePatient(@PathVariable("patientId") Integer id, @RequestBody PatientModel patientModel) {
	patService.updatePatient(id, patientModel);
	}
	
	//DELETE
	@DeleteMapping("api/v1/deletePatient/{patientId}")
	public void deletePatient(@PathVariable ("patientId") Integer id, @RequestBody PatientModel patientModel)
	{
		patService.deletePatient(id);
	}
	
	//GET PATIENT FROM ILLNESS
	@GetMapping("api/v1/getPatient/{patientDisease}")
	public List<String> getPatientFromDisease(@PathVariable ("patientDisease") String disease, @ RequestBody PatientModel patientModel)
	{
		return patService.getPatientFromDisease(disease);
	}
	
	}
	


