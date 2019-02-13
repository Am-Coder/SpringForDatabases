/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.jpaprac.demo.entities;

import java.io.Serializable;
import java.util.List;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.OneToMany;
import javax.persistence.OneToOne;
import javax.persistence.Table;
//import org.springframework.data.annotation.Id;

/**
 *
 * @author HP
 */
@Entity
@Table(name="Details")
public class Student implements Serializable {
    
    @Id
    private String rollNo;
    
    @Column(name="fname")
    private String firstName;
    
    @Column(name="lname")
    private String lastName;
    
    @Column(name="batchyear")
    private String batchYear;

    @OneToMany
    private List<Laptop> laptop;
    
    public Student() {
    }

    public Student(String rollNo, String firstName, String lastName, String batchYear, List<Laptop> laptop) {
        this.rollNo = rollNo;
        this.firstName = firstName;
        this.lastName = lastName;
        this.batchYear = batchYear;
        this.laptop = laptop;
    }

    public List<Laptop> getLaptop() {
        return laptop;
    }

    public void setLaptop(List<Laptop> laptop) {
        this.laptop = laptop;
    }





    public String getBatchYear() {
        return batchYear;
    }

    public void setBatchYear(String batchYear) {
        this.batchYear = batchYear;
    }



    public String getRollNo() {
        return rollNo;
    }

    public void setRollNo(String rollNo) {
        this.rollNo = rollNo;
    }

    public String getFirstName() {
        return firstName;
    }

    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    public String getLastName() {
        return lastName;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }


    
}
