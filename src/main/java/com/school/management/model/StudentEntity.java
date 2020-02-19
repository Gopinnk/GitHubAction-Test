package com.school.management.model;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity  
@Table(name="student")  
public class StudentEntity {
	
	    @Id  
	    @GeneratedValue(strategy=GenerationType.IDENTITY)
	    @Column(name = "student_id")
	    private int studentId;
	    
	    @Column(name = "student_name")
	    private String studentName;
	    
	    @Column(name = "student_age")
	    private String studentAge;
	    
	    @Column(name = "student_cource")
	    private String studentCourse;
	    
	    
	    

		public int getStudentId() {
			return studentId;
		}

		public void setStudentId(int studentId) {
			this.studentId = studentId;
		}

		public String getStudentName() {
			return studentName;
		}

		public void setStudentName(String studentName) {
			this.studentName = studentName;
		}

		public String getStudentAge() {
			return studentAge;
		}

		public void setStudentAge(String studentAge) {
			this.studentAge = studentAge;
		}

		public String getStudentCourse() {
			return studentCourse;
		}

		public void setStudentCourse(String studentCourse) {
			this.studentCourse = studentCourse;
		}

		@Override
		public String toString() {
			return "StudentEntity [studentId=" + studentId + ", studentName=" + studentName + ", studentAge="
					+ studentAge + ", studentCourse=" + studentCourse + "]";
		}
	
	      
	}  


