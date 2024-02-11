package com.in28minutes.springboot.learnjpaandhibernate.course.jdbc;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.stereotype.Component;

import com.in28minutes.springboot.learnjpaandhibernate.course.Course;

@Component
public class CourseJdbcCommandLineRunner implements CommandLineRunner {
	
	@Autowired
	private CourseJdbcRepository repository;
	
	@Override
	public void run(String... args) throws Exception{
		Course course1 = new Course(1,"Learn AWS Now!","in28minutes");
		Course course2 = new Course(2,"Learn Azure Now!","in28minutes");
		Course course3 = new Course(3,"Learn DevOps Now!","in28minutes");
		repository.insert(course1);
		repository.insert(course2);
		repository.insert(course3);
		repository.delete(course1);
		System.out.println(repository.findById(2));
		System.out.println(repository.findById(3));

	} 
} 
