package com.example.student.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.student.model.Student;
import com.example.student.repository.StudentRepository;

@Service
public class StudentService {

	@Autowired
	private StudentRepository studentRepository;
	public Student registerStudent(Student student) {
		
		return studentRepository.save(student);
	}
	public List<Student> getStudents(){
		return (List<Student>) studentRepository.findAll();
		
		
	}
	public void deleteStudent(Integer id) {
		studentRepository.deleteById(id);
	}
	public Student updateStudent(Student student) {
		Integer rollNumber = student.getRollNumber();
		Student std = studentRepository.findById(rollNumber).get();
		std.setName(student.getName());
		std.setPhone(student.getPhone());
		std.setPercentage(student.getPercentage());
		std.setAddress(student.getAddress());
		std.setCourse(student.getCourse());
		std.setEmail(student.getEmail());
		std.setGrade(student.getGrade());
		std.setFathersName(student.getFathersName());
		return studentRepository.save(std);
		
		
	}
}
