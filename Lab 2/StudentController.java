package Controller;

import java.util.List;

import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PatchMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import Model.Student;
import Service.StudentService;


@RestController
public class StudentController {
	StudentService stuService = new StudentService();
	
	//Create
	
	@PostMapping("api/v1/createStudent")
	public Student createStudent(@RequestBody Student student)
	{
		return stuService.createStudent(student);
	}
	
	//read
	@GetMapping("api/v1/students")
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
