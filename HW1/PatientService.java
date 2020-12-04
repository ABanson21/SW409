package Service;

	import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;
import java.util.List;

	import Model.PatientModel;

	public class PatientService {
		List<PatientModel> patientList = new ArrayList<>();
		//create
		public PatientModel createPatient(PatientModel patientModel) 
		{
			patientList.add(patientModel);
			return patientModel;	
		}
		
		//read
		public List<PatientModel> findAllPatients()
		{
			return patientList;
		}
		
		//update
		public void updatePatient(Integer id, PatientModel p) 
		{
			for (int i = 0; i < patientList.size(); i++) 
			{
				if(patientList.get(i).getId().equals(id)) 
				{
					patientList.set(i, p);
				}
			}
		}
		//Delete
		public void deletePatient(Integer id) {
			for (int i = 0; i < patientList.size(); i++) {
				if(patientList.get(i).getId() == (id)) {
					
					patientList.remove(i);
				}
		}
		}
		//GET PATIENT NAME DISEASE FROM ILLNESS
		public List<String> getPatientFromDisease(String disease) {
			List<String> patientNames = new ArrayList<>();
			for(int i = 0; i < patientList.size(); i++)
			{
				if(disease.equalsIgnoreCase(patientList.get(i).getDisease())) 
				{
					patientNames.add(patientList.get(i).getName());
					
				}
			}
			return patientNames;
		}
		
		//GET PATIENT FROM ID
		public List<String> getPatientFromId(Integer id){
			List<String> patients = new ArrayList<>();
			for(int i = 0; i < patientList.size(); i++) {
				if(patientList.get(i).getId() == id) {
					patients.add(patientList.get(i).printString());
				}
				
			}
			return patients;
		}
}