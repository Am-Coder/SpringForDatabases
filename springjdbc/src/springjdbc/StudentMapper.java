/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package springjdbc;

import java.sql.ResultSet;
import java.sql.SQLException;
import org.springframework.jdbc.core.RowMapper;

/**
 *
 * @author HP
 */
public class StudentMapper implements RowMapper<Student>{
        
    @Override
    public Student mapRow(ResultSet rs, int rownum) throws SQLException {
        Student student = new Student();
        student.setAge(rs.getInt("AGE"));
        student.setId(rs.getInt("ID"));
        student.setName(rs.getString("NAME"));
        
        return student;
    }   
        
}       
