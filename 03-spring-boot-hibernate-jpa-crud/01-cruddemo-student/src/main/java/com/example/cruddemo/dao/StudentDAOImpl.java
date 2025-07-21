package com.example.cruddemo.dao;

import com.example.cruddemo.entity.Student;
import jakarta.persistence.EntityManager;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;
import org.springframework.transaction.annotation.Transactional;

@Repository
public class StudentDAOImpl implements StudentDAO {

    // define field for EntityManager
    private EntityManager entityManager;

    // define constructor for dependency injection
    @Autowired
    public StudentDAOImpl(EntityManager entityManager) {
        this.entityManager = entityManager;
    }

    @Override
    @Transactional
    public void save(Student student) {
        entityManager.persist(student);
        // Implementation for saving the student to the database
        // This could involve using an EntityManager or a Spring Data repository
        System.out.println("Saving student: " + student.getFirstName() + " " + student.getLastName());
    }
}
