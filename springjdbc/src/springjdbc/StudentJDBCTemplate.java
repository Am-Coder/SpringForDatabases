/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package springjdbc;

import java.util.List;
import javax.sql.DataSource;
import org.springframework.jdbc.core.JdbcTemplate;

/**
 *
 * @author HP
 */
public class StudentJDBCTemplate implements StudentDAO {
    
    private DataSource dataSource;
    private JdbcTemplate jdbcTemplateObject;
    
    
    @Override
    public void setDataSource(DataSource ds) {
        this.dataSource = ds;
        this.jdbcTemplateObject = new JdbcTemplate(ds); 
    }

    @Override
    public void create(String name, Integer age,Integer id) {
        String sql = "INSERT INTO Student(name,age,id) values(?,?,?)";
        jdbcTemplateObject.update(sql,name,age,id);
        System.out.println("Record Created Successfully");
    }

    @Override
    public Student getStudent(Integer id) {
        String sql="Select * from Student where id=?";
        Student student = jdbcTemplateObject.queryForObject(sql,new Object[]{id},new StudentMapper());
        return student;
    }

    @Override
    public List<Student> listStudents() {
        String sql = "select * from Student";
        List<Student> students = jdbcTemplateObject.query(sql,new StudentMapper());
        return students;
    }

    @Override
    public void delete(Integer id) {
        String sql = "delete * from Student where id=?";
        jdbcTemplateObject.update(sql,id);
    }

    @Override
    public void update(Integer id, Integer age) {
    String SQL = "update Student set age = ? where id = ?";
    jdbcTemplateObject.update(SQL, age, id);
    System.out.println("Updated Record with ID = " + id );
    
    }
    
}
