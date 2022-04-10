package com.spring.practice.di;

import org.apache.log4j.LogManager;
import org.apache.log4j.Logger;
import org.apache.log4j.xml.DOMConfigurator;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.spring.practice.di.model.Student;

public class DIXmlApp {
	//@Autowired
	//private static StudentService studentService;
	private static ApplicationContext applicationContext;
	private static final Logger logger = LogManager.getLogger(DIXmlApp.class);
	
	public static void main(String... args) {
		DOMConfigurator.configure("log4j.xml");
		applicationContext = new ClassPathXmlApplicationContext("applicationContext.xml");
		Student studentObj = (Student)applicationContext.getBean("student1");
		logger.info(studentObj.toString());
	}
}
