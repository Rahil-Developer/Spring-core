package com.spring.practice.di.services;

import java.util.List;

import com.spring.practice.di.model.Student;

public interface StudentService {
	List<Student> getStudentInfo(Student student);
}
