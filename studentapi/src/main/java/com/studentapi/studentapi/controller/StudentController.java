package com.studentapi.studentapi.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.studentapi.studentapi.entity.Students;
import com.studentapi.studentapi.service.StudentService;
@RestController
public class StudentController {
	private final StudentService service;

    @Autowired
    public StudentController(StudentService service) {
        this.service = service;
    }
	
	@GetMapping("/students")
	public List<Students> AllStudents(){
		return service.getAllStudent();
		
	}
	
	@PostMapping("/students")
	public ResponseEntity<Void> addStudents(@RequestBody Students students) {
	    service.addStudent(students);
	    return new ResponseEntity<>(HttpStatus.CREATED);
	}

	@PutMapping("/students/{id}")
	public ResponseEntity<Void> updateStudent(@PathVariable long id, @RequestBody Students students) {
	    service.updateStudents(id, students);
	    return new ResponseEntity<>(HttpStatus.OK);
	}
@DeleteMapping("/students/{id}")
public void deleteStudent(@PathVariable long id) {
	service.deleteStudent(id);
	
}
}
