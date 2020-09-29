package com.example.demo.dao;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.stereotype.Repository;

import com.example.demo.model.Student;

@Repository
public class StudentRepository {
	
	@Autowired
	private JdbcTemplate jdbcTemplate;

	public StudentRepository(JdbcTemplate jdbcTemplate) {
		
		this.jdbcTemplate = jdbcTemplate;
	}
	
  public static String Save_Student_Data="Insert into student values(?,?)";		
  
  
  
  public Boolean saveSudentData(Student student)
  {
	  
	  
	  int saveCode=jdbcTemplate.update(Save_Student_Data,student.getId(),student.getName());
	  
	  if(saveCode==1)
	  {
		return true;  
	  }
	  else
	  {
		  return true;
	  }
	
	  
  }
  
  
}
