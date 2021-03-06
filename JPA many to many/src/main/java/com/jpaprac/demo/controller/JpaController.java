/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.jpaprac.demo.controller;

import com.jpaprac.demo.entities.Laptop;
import com.jpaprac.demo.entities.Student;
import com.jpaprac.demo.service.StudentService;
import java.util.ArrayList;
import java.util.List;
import java.util.Optional;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

/**
 *
 * @author HP
 */
@Controller
public class JpaController { 
    @Autowired
    private static final Logger logger=LoggerFactory.getLogger(JpaController.class);;
    
    @Autowired
    StudentService studServe;
    
    @RequestMapping("/")
    public String home(){
        return "index";
    }
    
    @GetMapping("/update")
    public String makeUpdate(@RequestParam("id") String id, @RequestParam("batchYear") String year){
        studServe.updateStudent(id, year);
        return "index";
    }
    
    @GetMapping("/delete")
    public String makeDelete(@RequestParam("id") String id){
        studServe.deleteStudent(id);
        return "index";
    }
    
    @GetMapping("/add")
    public String addingStudent(@RequestParam("id") String id, @RequestParam("firstName") String firstName,
            @RequestParam("lastName") String lastName,@RequestParam("batchYear") String batchYear,@RequestParam("laptopId1") String lapid1
            ,@RequestParam("company1") String company1,@RequestParam("laptopId2") String lapid2
            ,@RequestParam("company2") String company2){
            List<Laptop> laptops = new ArrayList<>();
            List<Student> student = new ArrayList<>();
            Student stud = new Student(id,firstName,lastName,batchYear);
            Laptop lap1 = new Laptop(lapid1,company1);
            Laptop lap2 = new Laptop(lapid2,company2);
            laptops.add(lap1);
            laptops.add(lap2);
            student.add(stud);
            stud.setLaptop(laptops);
            lap1.setStudent(student);
            lap2.setStudent(student);
            studServe.addStudent(stud);
            return "index";
    }
    
    @GetMapping("/find")
    public String find(@RequestParam("id") String id){
        Optional<Student> stud=studServe.getStudent(id);
        Student student = stud.get();
        logger.info(student.getRollNo() +"-"+student.getBatchYear()+"-"+student.getFirstName()+" "+student.getLastName());
        return "index";
    }
}
