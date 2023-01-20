package com.marketingapp.services;

import java.util.List;

import com.marketingapp.entity.Student;

public interface StudentService {
public void saveStudent(Student student) ;
	public List <Student> listAll();

}
