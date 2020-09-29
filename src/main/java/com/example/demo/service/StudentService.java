package com.example.demo.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.example.demo.dao.StudentRepository;
import com.example.demo.model.Student;

@Service
public class StudentService {
	
	private StudentRepository studentRepo;

	@Autowired
	public StudentService(StudentRepository studentRepo) {
		
		this.studentRepo = studentRepo;
	}


	@Transactional
	public Boolean saveStudentdata(Student student)
	{
		return studentRepo.saveSudentData(student);
	}
	
	

}
