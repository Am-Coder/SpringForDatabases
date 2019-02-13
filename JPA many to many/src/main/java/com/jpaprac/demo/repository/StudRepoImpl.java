/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.jpaprac.demo.repository;

import com.jpaprac.demo.entities.Student;
import java.util.List;
import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;
import javax.persistence.Query;
import org.springframework.stereotype.Repository;
import org.springframework.transaction.annotation.Transactional;

/**
 *
 * @author HP
 */
@Repository
@Transactional
public class StudRepoImpl implements StudRepoCustom{

    @PersistenceContext
    EntityManager entityManager;
    
    @Override
    public List<Student> getFirstNamesLike(String firstName) {
        Query query = entityManager.createNativeQuery("SELECT * FROM STUDENT s WHERE s.firstName LIKE ?", Student.class);
        query.setParameter(1,firstName+"%");
        return query.getResultList();
    }
    
}
