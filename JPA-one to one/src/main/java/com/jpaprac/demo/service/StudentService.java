/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.jpaprac.demo.service;

import com.jpaprac.demo.dao.StudentDAO;
import com.jpaprac.demo.entities.Laptop;
import com.jpaprac.demo.entities.Student;
import com.jpaprac.demo.repository.StudRepo;
import java.util.Optional;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

/**
 *
 * @author HP
 */
@Service
public class StudentService implements StudentDAO{

    @Autowired
    private StudRepo repo;
    
    @Override
    @Transactional
    public Optional<Student> getStudent(String Id) {
         Optional<Student> stud=repo.findById(Id);
         return stud;
    }

    @Override
    @Transactional
    public void addStudent(String id, String firstName, String lastName, String batchYear,Laptop laptop) {
        Student stud = new Student(id,firstName,lastName,batchYear,laptop);
        repo.save(stud);
    }

    @Override
    @Transactional
    public void updateStudent(String id,String batchYear) {
         Optional<Student> stud=repo.findById(id);
         
         if(stud.isPresent()){
            Student student = stud.get();
            student.setBatchYear(batchYear);
            repo.save(student);
            
         }
    }

    @Override
    @Transactional
    public void deleteStudent(String id) {
        repo.deleteById(id);
        
    }
    
}
