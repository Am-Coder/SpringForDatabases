/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.jpaprac.demo.entities;

import java.io.Serializable;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
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

    @OneToOne
    private Laptop laptop;
    
    public Student() {
    }

    public Student(String rollNo, String firstName, String lastName, String batchYear, Laptop laptop) {
        this.rollNo = rollNo;
        this.firstName = firstName;
        this.lastName = lastName;
        this.batchYear = batchYear;
        this.laptop = laptop;
    }

    public Laptop getLaptop() {
        return laptop;
    }

    public void setLaptop(Laptop laptop) {
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
