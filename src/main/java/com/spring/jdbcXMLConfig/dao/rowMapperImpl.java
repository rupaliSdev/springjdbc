package com.spring.jdbcXMLConfig.dao;

import java.sql.ResultSet;
import java.sql.SQLException;

import org.springframework.jdbc.core.RowMapper;

import com.spring.jdbcXMLConfig.entities.Student;

public class rowMapperImpl implements RowMapper<Student> {

	public Student mapRow(ResultSet rs, int rowNum) throws SQLException {
		// TODO Auto-generated method stub
		Student s= new Student();
		//first column
		s.setId(rs.getInt(1));
		//2nd column
		s.setName(rs.getString(2));
		//3rd column
		s.setCity(rs.getString(3));
		return s;
	}

}
