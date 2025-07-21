package com.example.cruddemo;

import com.example.cruddemo.dao.StudentDAO;
import com.example.cruddemo.entity.Student;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.Bean;

@SpringBootApplication
public class CruddemoApplication {

	public static void main(String[] args) {
		SpringApplication.run(CruddemoApplication.class, args);
	}

	@Bean
	public CommandLineRunner commandLineRunner(StudentDAO studentDAO) {
		return runner -> {
			System.out.println("---> CommandLineRunner is running!");
			saveStudents(studentDAO);
		};
	}

	private void saveStudents(StudentDAO studentDAO) {
		// Create a new student
		Student student1 = new Student("Jacky",
				"Chan",
				"jacky@foo.org");

		Student student2 = new Student("Bob",
				"Smith",
				"bobfoo.org");

		Student student3 = new Student("Mary",
				"Johnson",
				"mary@foo.org");


		// Save the student using the DAO
		studentDAO.save(student1);
		studentDAO.save(student2);
		studentDAO.save(student3);

		System.out.println("Saved student: " + student1.toString());
		System.out.println("Saved student: " + student2.toString());
		System.out.println("Saved student: " + student3.toString());

	}


}
