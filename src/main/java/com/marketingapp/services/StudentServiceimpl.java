

package com.marketingapp.services;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.marketingapp.Repository.StudentRepository;
import com.marketingapp.entity.Student;

@Service
public class StudentServiceimpl implements StudentService {
	@Autowired
	private StudentRepository studentRepo;

	@Override
	public void saveStudent(Student student) {
		studentRepo.save(student);
	}

	@Override
	public List<Student> listAll() {
		List<Student> Students = studentRepo.findAll();
		return Students ;
	}

	

}
