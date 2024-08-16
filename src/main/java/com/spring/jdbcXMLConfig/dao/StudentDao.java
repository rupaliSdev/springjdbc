package com.spring.jdbcXMLConfig.dao;

import com.spring.jdbcXMLConfig.entities.Student;

import java.util.List;

public interface StudentDao {
 public int insert(Student s1);
 public int change(Student s1);
 public int delete(Student s1);
 public Student getStudentData(int id);
 public List<Student> getAllStudents();
}
