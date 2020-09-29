package com.example.demo;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.ApplicationArguments;
import org.springframework.boot.ApplicationRunner;
import org.springframework.stereotype.Component;

import com.example.demo.model.Student;
import com.example.demo.service.StudentService;

@Component
public class Runner implements ApplicationRunner {

	
	private StudentService studentService;
	
	
	@Autowired
	public Runner(StudentService studentService) {
		
		this.studentService = studentService;
	}


	@Override
	public void run(ApplicationArguments args) throws Exception {
		
		System.out.println("Application Start to run");
		saveStudentdata();
		
	}
	
	
	private void saveStudentdata()
	{
		Boolean isSaved=false;
		Student student=new Student();
		student.setId(102);
		student.setName("kalasugana");
		
		isSaved=studentService.saveStudentdata(student);
		
		if(isSaved==true)
		{
			System.out.println("Data is saved sucessfully");
		}
		else
		{
			System.out.println("Data is not saved ");
		}
	}

}
