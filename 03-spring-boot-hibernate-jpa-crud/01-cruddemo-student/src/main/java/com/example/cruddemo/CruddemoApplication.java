package com.example.cruddemo;

import com.example.cruddemo.dao.StudentDAO;
import com.example.cruddemo.entity.Student;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.Bean;

import java.util.List;

@SpringBootApplication
public class CruddemoApplication {

	public static void main(String[] args) {
		SpringApplication.run(CruddemoApplication.class, args);
	}

	@Bean
	public CommandLineRunner commandLineRunner(StudentDAO studentDAO) {
		return runner -> {
			System.out.println("---> CommandLineRunner is running!");

//			saveStudents(studentDAO);

//			readStudent(studentDAO);

			queryForStudents(studentDAO);
		};
	}

	private void queryForStudents(StudentDAO studentDAO) {

		// get a list of students
		List<Student> students = studentDAO.findAll();

		// display the list of students
		for (Student student : students) {
			System.out.println(student);
		}
	}

	private void readStudent(StudentDAO studentDAO) {

		// create a new student
		Student newStudent = new Student(
				"Luffy",
				"Monkey",
				"luffy@foo.org");

		// save student
		System.out.println("Saving student: " + newStudent.toString());
		studentDAO.save(newStudent);

		// display the id of the saved student
		int studentId = newStudent.getId();
		System.out.println("the id of the saved student : " +  studentId);

		// retrieve the student based on the id
		System.out.println("finding student with id: " + studentId);
		Student retrievedStudent = studentDAO.findById(studentId);

		// display the retrieved student
		System.out.println("Retrieved student : " + retrievedStudent.toString());
	}

	private void saveStudents(StudentDAO studentDAO) {
		// Create a new student
		Student student1 = new Student(
				"Jacky",
				"Chan",
				"jacky@foo.org");

		Student student2 = new Student(
				"Bob",
				"Smith",
				"bobfoo.org");

		Student student3 = new Student(
				"Mary",
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
