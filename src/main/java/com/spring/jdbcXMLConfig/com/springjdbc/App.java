package com.spring.jdbcXMLConfig.com.springjdbc;


import com.spring.jdbcXMLConfig.dao.StudentDao;
import com.spring.jdbcXMLConfig.entities.Student;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;
import org.springframework.jdbc.core.JdbcTemplate;

/**
 * Hello world!
 *
 */
public class App 
{
    public static void main( String[] args )
    {
        System.out.println( "Hello World!" );
        ApplicationContext context = new ClassPathXmlApplicationContext("com\\spring\\jdbc\\com\\springjdbc\\config.xml");
        //getting the bean
          JdbcTemplate temp = context.getBean("jdbcTemplate",JdbcTemplate.class);
          StudentDao studentDao =context.getBean("stDao", StudentDao.class);


          //inserting the student
          Student s1= new Student();
          s1.setId(333);
          s1.setCity("bhilai");
          s1.setName("Rupali");
          int result1 = studentDao.insert(s1);
          System.out.println("student added "+result1);


          //updating the student

//          student s2= new student();
//          s2.setId(200);
////          s2.setCity("Bilaspur");
////          s2.setName("Aanchal");
//
//          //int res = st.change(s2);
//          //int res = st.delete(s2);
//
//          /////
////          student s1 = st.getStudentData(200);
////          System.out.println("student added    "+s1);
//
//          //////
//          List<student> ss= st.getAllStudents();
//          for(student s:ss) {
//        	  System.out.println(s);
//          }
    }
}

