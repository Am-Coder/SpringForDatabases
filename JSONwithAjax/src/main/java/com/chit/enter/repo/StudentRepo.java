package com.chit.enter.repo;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.chit.enter.entity.Student;

@Repository
public interface StudentRepo extends JpaRepository<Student,String>{
	
}
