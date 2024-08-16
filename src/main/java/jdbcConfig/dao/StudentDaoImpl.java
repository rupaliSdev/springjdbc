package jdbcConfig.dao;

import jdbcConfig.entities.Student;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.jdbc.core.RowMapper;

import java.util.List;

public class StudentDaoImpl implements StudentDao {

    JdbcTemplate jdbcTemplate;

    public StudentDaoImpl(JdbcTemplate jdbcTemplate){
        this.jdbcTemplate = jdbcTemplate;
    }

    public void setJdbcTemplate(JdbcTemplate jdbcTemplate) {
        this.jdbcTemplate = jdbcTemplate;
    }

    @Override
    public int insert(Student s1) {

        String query="insert into student(id,name,city) values(?,?,?)";
        int r=this.jdbcTemplate.update(query,s1.getId(),s1.getName(),s1.getCity());
        return r;
    }

    @Override
    public int change(Student s1)
    {
        String query="update student set name=?,city=? where id=?";
        int r=this.jdbcTemplate.update(query,s1.getName(),s1.getCity(),s1.getId());
        return r;
    }

    @Override
    public int delete(Student s1) {
        return 0;
    }

    @Override
    public Student getStudentData(int id) {

        String query="select * from student where id=?";
        RowMapper<Student> rowMapper=new rowMapperImpl();
        return this.jdbcTemplate.queryForObject(query,rowMapper,id);
    }

    @Override
    public List<Student> getAllStudents() {

        String query="select * from student";
        List<Student> students=this.jdbcTemplate.query(query,new rowMapperImpl());
        return students;
    }
}
