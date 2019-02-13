/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.jpaprac.demo.entities;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.ManyToOne;
import javax.persistence.Table;

/**
 *
 * @author HP
 */
@Entity
@Table(name="Laptop")
public class Laptop {
    
    @Id
    private String id;
    
    @Column(name="company")
    private String company;

//    @ManyToOne
//    private Student stud;

    public Student getStud() {
        return stud;
    }

    public void setStud(Student stud) {
        this.stud = stud;
    }
    
    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getCompany() {
        return company;
    }

    public void setCompany(String company) {
        this.company = company;
    }

    public Laptop(String id, String company) {
        this.id = id;
        this.company = company;
    }

    public Laptop() {
    }
    
    
}
