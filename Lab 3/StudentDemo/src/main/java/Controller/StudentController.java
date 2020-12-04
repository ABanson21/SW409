package Controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;


import Model.Student;
import Service.StudentService;

@Component
@RestController
public class StudentController {
	@Autowired
	StudentService stuService = new StudentService();
	
	//Create
	
	@PostMapping("api/v1/createStudent")
	public Student createStudent(@RequestBody Student student)
	{
		return stuService.createStudent(student);
	}
	
	//read
	@GetMapping("api/v1/getStudents")
	public List<Student> findAllStudents()
	{
		
		return stuService.findAllStudents();
	}

	//update
	@PutMapping("api/v1/updateStudent/{studentid}")
	public void updateStudent(@PathVariable("studentid") Integer id, @RequestBody Student student)
	{
		stuService.updateStudent(id, student);
	}
	
	//delete
	@DeleteMapping("api/v1/deleteStudent/{studentid}")
	public void deleteStudent(@PathVariable("studentid") Integer id, @RequestBody Student student)
	{
		stuService.deleteStudent(id);
	}
	
}
