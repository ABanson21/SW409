package Model;

public class PatientModel {
	String name;
	Integer id;
	int age;
	String disease;
	String doctor;

	public PatientModel(Integer id, String name, int age, String disease, String doctor) {
		
		this.id = id;
		this.name=name;
		this.age = age;
		this.disease = disease;
		this.doctor  = doctor;
		
	}
	
	public PatientModel() 
	{
		
	}

	public String getName(){
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}
	
	public Integer getId() {
		return id;
	}
	
	public void setId(Integer id) {
		this.id = id;
	}
	
	public int getAge() {
		return age;
	}
	
	public void setAge(int age) {
		this.age= age;
	}
	
	public String getDisease() {
		return disease;
	}
	
	public void setDisease(String disease) {
		this.disease = disease;
	}
	
	public String getDoctor() {
		return doctor;
	}
	
	public void setDoctor(String doctor) {
		this.doctor = doctor;
	}
	
	public String printString() {
		return "Id: "+ id + "Name: " + name + "Age: " + age + "Disease: " + disease + "Doctor: " + doctor;
}	
	
	
}