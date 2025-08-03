package com.example.cruddemo.dao;

import com.example.cruddemo.entity.Student;

import java.util.List;

public interface StudentDAO {

    /**
     * Save a student to the database.
     *
     * @param student the student to save
     */
    void save(Student student);


    /**
     * Find a student by their ID.
     *
     * @param id the ID of the student to find
     * @return the found student, or null if no student with that ID exists
     */
    Student findById(int id);


    /**
     * get all Stundent entries
     *
     * @return a list of all Student entries
     */
    List<Student> findAll();

    /**
     * find students by the given lastname
     *
     * @param lastName
     * @return list of students
     */
    List<Student> findByLastName(String lastName);

    
    /**
     * Update an existing student in the database.
     * This method will replace the existing student record with the new data provided.
     * 
     * @param student
     */
    void update(Student student);

    /**
     * Delete a student from the database by their ID.
     *
     * @param id the ID of the student to delete
     */
    void delete(int id);


    /**
     * Delete all students from the database.
     *
     * @return the number of deleted students
     */
    int deleteAll();
}
