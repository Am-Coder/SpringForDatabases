/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.jpaprac.demo.repository;

import com.jpaprac.demo.entities.Student;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

/**
 *
 * @author HP
 */
@Repository
public interface StudRepo extends JpaRepository<Student,String>,StudRepoCustom{
//    public interface StudRepo extends CrudRepository<Student,String>{

}
