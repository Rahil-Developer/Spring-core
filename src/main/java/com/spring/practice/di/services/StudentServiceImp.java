package com.spring.practice.di.services;

import java.util.ArrayList;
import java.util.List;

import org.springframework.stereotype.Service;

import com.spring.practice.di.model.Student;

@Service
public class StudentServiceImp implements StudentService{
	List<Student> studentLst = new ArrayList<Student>();
	
	public List<Student> getStudentInfo(Student student) {
		studentLst.add(student);
		return studentLst;
	}	
}
