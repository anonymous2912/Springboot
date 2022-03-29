package com.example.restapi;

import java.util.ArrayList;
import java.util.List;

import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;

@RestController
public class RestApiController {

	private List<Student> students = new ArrayList<>();
	
	public RestApiController()
	{
		students.add(new Student("123","Param"));
		students.add(new Student("456","Adnan"));
	}
	
	@GetMapping("students/all")
	Iterable<Student> getStudents()
	{
		return students;
	}
	
	@PostMapping("/students/add")
	Student addStudent(@RequestBody Student stu)
	{
		students.add(stu);
		return stu;
	}
	
	
	@PutMapping("/{rollno}")
	Student updateStudent(@PathVariable String rollno, @RequestBody Student stu) {
		int studentIndex = -1;

	    for (Student s: students) {
	        if (s.getRollno().equals(rollno)) {
	        	studentIndex = students.indexOf(s);
	            students.set(studentIndex, stu);
	        }
	    }

	    return (studentIndex == -1) ? addStudent(stu) : stu;
	}
	
	@DeleteMapping("/{rollno}")
	String deleteStudent(@PathVariable String rollno) {
		students.removeIf(stu->stu.getRollno().equals(rollno));
		return "deleted";
	}
	
}
