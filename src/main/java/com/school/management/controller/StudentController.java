package com.school.management.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;
import com.school.management.model.StudentEntity;
import com.school.management.services.StudentService;

@RestController
@RequestMapping(value="/api")  
public class StudentController {
	
	@Autowired  
    private StudentService studentservice;  
	
	@RequestMapping(value = "/getStudent", method=RequestMethod.GET)
	public List<StudentEntity> getStudents(){
		return studentservice.getStudents();
	
	}
      
	@RequestMapping(value = "/saveStudent", method=RequestMethod.POST)
    public void saveStudent(@RequestBody StudentEntity studentEntity) {  
         studentservice.addStudent(studentEntity);  
          
    }  
      
    /*@GetMapping("students-list")  
    public List<StudentEntity> allstudents() {  
         return studentservice.getStudents();  
          
    }  */     
      
	@RequestMapping(value = "/updateStudent/{student_id}", method=RequestMethod.PUT)
    public void updateStudent(@RequestBody StudentEntity studentEntity,@PathVariable("student_id") int student_id) {  
    	      studentservice.updateStudent(studentEntity, student_id);  
    }
}
