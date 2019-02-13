/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.jpaprac.demo.dao;

import com.jpaprac.demo.entities.Laptop;
import com.jpaprac.demo.entities.Student;
import java.util.List;
import java.util.Optional;

/**
 *
 * @author HP
 */
public interface StudentDAO {
    
    public Optional<Student> getStudent(String Id);
    
    public void addStudent(String id,String firstName,String lastName,String batchYear,List<Laptop> laptop);
    
    public void updateStudent(String id,String batchYear);
    
    public void deleteStudent(String id);
    
}
