package com.marketingapp.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

import com.marketingapp.controllerDTO.StudentData;
import com.marketingapp.entity.Student;
import com.marketingapp.services.StudentService;


  @Controller
  public class Studentcontroller {
	  
	  @Autowired
	  private StudentService studentService;
	  
	@RequestMapping("/createStudent")
     public String viewCreateStudentPage() {
    	 
    	 return "create_new_student";   
     }
	@RequestMapping("/saveStudent")
	 public String saveoneStudent(@ModelAttribute("student") Student student,ModelMap model) {
		
		studentService.saveStudent(student);
		model.addAttribute("saveMsg", "record is saved!!!");
		 return "create_new_student";
	 }
//	@RequestMapping("/saveStudent")
//	public String saveOneStudent(@RequestParam("firstName") String fname,@RequestParam("email") String Eemail,@RequestParam("mobile") Long Mmobile,@RequestParam("roll") long Lroll) {
//		Student s= new Student();
//		s.setFirstName(fname); 
//		s.setEmail(Eemail);
//		s.setMobile(Mmobile);
//		s.setRoll(Lroll);
//		studentService.saveStudent(s);
//		 return "create_new_student";
//	}
	
	 @RequestMapping("/listStudents")
	public String getAllStudents(ModelMap model) {
		 List<Student> Students = studentService.listAll();
		model.addAttribute("Students", Students);
		return"search_result";
	}
	
	
	
	  
	
	
	
	
	
	
}