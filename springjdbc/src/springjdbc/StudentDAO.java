/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package springjdbc;

import java.util.List;
import javax.sql.DataSource;

/**
 *
 * @author HP
 */
public interface StudentDAO {
    public void setDataSource(DataSource ds);
   public void create(String name, Integer age,Integer id);
   
   /** 
      * This is the method to be used to list down
      * a record from the Student table corresponding
      * to a passed student id.
   */
   public Student getStudent(Integer id);
   
   /** 
      * This is the method to be used to list down
      * all the records from the Student table.
   */
   public List<Student> listStudents();
   
   /** 
      * This is the method to be used to delete
      * a record from the Student table corresponding
      * to a passed student id.
   */
   public void delete(Integer id);
   
   /** 
      * This is the method to be used to update
      * a record into the Student table.
   */
   public void update(Integer id, Integer age);    
}
