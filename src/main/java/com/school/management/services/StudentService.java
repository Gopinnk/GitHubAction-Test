package com.school.management.services;

import java.util.ArrayList;
import java.util.List;

import javax.persistence.EntityManager;
import javax.sql.DataSource;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.school.management.model.StudentEntity;
import com.school.management.repository.StudentRepository;

@Service
public class StudentService {

	/*
	 * public boolean saveStudent(StudentEntity studentEntity); public
	 * List<StudentEntity> getStudents(); public boolean updateStudent(StudentEntity
	 * studentEntity);
	 */
	@Autowired
	DataSource dataSource;

	@Autowired
	private StudentRepository studentRepository;
	
	
	/*@Autowired
	private EntityManager entityManager;
*/
	// Get All Students
	public List<StudentEntity> getStudents() {

		List<StudentEntity> students = new ArrayList<>();
		studentRepository.findAll().forEach(students::add);
		return students;
		
	}

	// Save or Add Student
	public void addStudent(StudentEntity studentEntity) {
		studentRepository.save(studentEntity);
		//entityManager.flush();
	}

	// Upadate Student
	public void updateStudent(StudentEntity studentEntity, int student_id) {

		studentRepository.save(studentEntity);
		//entityManager.flush();
	}

}
