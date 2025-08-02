package com.example.cruddemo.dao;

import com.example.cruddemo.entity.Student;

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

}
