package com.in28minutes.springboot.learnjpaandhibernate.course;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.stereotype.Component;

import com.in28minutes.springboot.learnjpaandhibernate.course.jpa.CourseJpaRepository;
import com.in28minutes.springboot.learnjpaandhibernate.course.springdatajpa.CourseSpringDataJpaRepository;

@Component
public class CourseCommandLineRunner implements CommandLineRunner {
	
	//@Autowired
	//private CourseJdbcRepository repository;
	
	//@Autowired
	//private CourseJpaRepository repository;
	
	@Autowired
	private CourseSpringDataJpaRepository repository;
	
	@Override
	public void run(String... args) throws Exception{
		Course course1 = new Course(1,"Learn AWS Jpa!","in28minutes");
		Course course2 = new Course(2,"Learn Azure Jpa!","in28minutes");
		Course course3 = new Course(3,"Learn DevOps Jpa!","in28minutes");
		repository.save(course1);
		repository.save(course2);
		repository.save(course3);
		repository.deleteById(1l);
		System.out.println(repository.findById(2l));
		System.out.println(repository.findById(3l));
		
		System.out.println(repository.findAll());
		System.out.println(repository.count());
		System.out.println(repository.findByAuthor("in28minutes"));
		System.out.println(repository.findByAuthor("vipul"));
		
		System.out.println(repository.findByName("Learn Azure Jpa!"));


	} 
} 
