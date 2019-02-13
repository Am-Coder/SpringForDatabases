/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.jpaprac.demo.repository;

import com.jpaprac.demo.entities.Student;
import java.util.List;

/**
 *
 * @author HP
 */
public interface StudRepoCustom {
    
    List<Student> getFirstNamesLike(String firstName);
}
