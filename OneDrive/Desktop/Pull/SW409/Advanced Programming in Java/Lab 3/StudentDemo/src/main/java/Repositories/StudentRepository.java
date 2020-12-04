package Repositories;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import Model.Student;
@Repository
public interface StudentRepository extends CrudRepository<Student, Integer> {
	 
}
