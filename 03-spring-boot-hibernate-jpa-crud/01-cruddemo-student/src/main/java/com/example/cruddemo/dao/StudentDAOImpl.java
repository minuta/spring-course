package com.example.cruddemo.dao;

import com.example.cruddemo.entity.Student;
import jakarta.persistence.EntityManager;
import jakarta.persistence.TypedQuery;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;

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

    @Override
    public Student findById(int id) {
        return entityManager.find(Student.class, id);
    }

    @Override
    public List<Student> findAll() {

        // create query
        // note: Student is not the DB schema, but the Entity class
        TypedQuery<Student> query = entityManager.createQuery("from Student order by lastName", Student.class);
        // return query results
        return query.getResultList();
    }

    @Override
    public List<Student> findByLastName(String lastName) {

        // create a query
        TypedQuery<Student> query = entityManager.createQuery("from Student where lastName = :theData", Student.class);

        // set query parameters
        query.setParameter("theData", lastName);

        // return query
        return query.getResultList();
    }


}
