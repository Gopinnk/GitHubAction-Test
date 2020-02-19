package com.school.management.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.school.management.model.StudentEntity;

@Repository
public interface StudentRepository extends JpaRepository<StudentEntity, Long> {
	
		

}
