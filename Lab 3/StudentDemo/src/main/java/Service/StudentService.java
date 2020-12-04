package Service;


import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;


import Model.Student;
//@Autowired
//StudentRepository studentRepository;
public class StudentService {
	
	List<Student> studentList = new ArrayList<>();
	//create
	public Student createStudent(Student student) 
	{
		studentList.add(student);
		return student;	
	}
	
	//read
	public List<Student> findAllStudents()
	{
		return studentList;
		//return (ArrayList<Student>) studentRepository.findAll());
	}
	
	//update
	public void updateStudent(Integer id, Student s) 
	{
		for (int i = 0; i < studentList.size(); i++) 
		{
			if(studentList.get(i).getId().equals(id)) 
			{
				studentList.set(i, s);
			}
		}
	}
	//Delete
	public void deleteStudent(Integer id) {
		for (int i = 0; i < studentList.size(); i++) {
			if(studentList.get(i).getId() == (id)) {
				
				studentList.remove(i);
			}
	}
	}
}
	
