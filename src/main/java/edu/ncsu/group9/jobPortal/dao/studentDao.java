package edu.ncsu.group9.jobPortal.dao;

import edu.ncsu.group9.jobPortal.model.Student;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.BatchPreparedStatementSetter;
import org.springframework.jdbc.core.RowMapper;
import org.springframework.jdbc.core.support.JdbcDaoSupport;
import org.springframework.stereotype.Repository;

import javax.annotation.PostConstruct;
import javax.sql.DataSource;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;
import java.util.Map;

@Repository
public class studentDao extends JdbcDaoSupport implements studentDaoInterface{
    @Autowired
    DataSource dataSource;

    @PostConstruct
    private void initialize(){
        setDataSource(dataSource);
    }

    @Override
    public void insertStudent(Student student) {
        String sql = "INSERT INTO Student " +
                "(studentId, studentName) VALUES (?, ?)" ;
        getJdbcTemplate().update(sql, new Object[]{
                student.getStudentId(), student.getStudentName()
        });
    }

    @Override
    public void insertStudents(List<Student> students) {
        String sql = "INSERT INTO student " + "(studentId, studentName) VALUES (?, ?)";
        getJdbcTemplate().batchUpdate(sql, new BatchPreparedStatementSetter() {
            public void setValues(PreparedStatement ps, int i) throws SQLException {
                Student student = students.get(i);
                ps.setString(1, student.getStudentId());
                ps.setString(2, student.getStudentName());
            }

            public int getBatchSize() {
                return students.size();
            }
        });

    }
    @Override
    public List<Student> getAllStudents(){
        String sql = "SELECT * FROM student";
        List<Map<String, Object>> rows = getJdbcTemplate().queryForList(sql);

        List<Student> result = new ArrayList<Student>();
        for(Map<String, Object> row:rows){
            Student student = new Student();
            student.setStudentId((String)row.get("studentId"));
            student.setStudentName((String)row.get("studentName"));
            result.add(student);
        }

        return result;
    }

    @Override
    public Student getStudentById(String studentId) {
        String sql = "SELECT * FROM student WHERE studentId = ?";
        return (Student)getJdbcTemplate().queryForObject(sql, new Object[]{studentId}, new RowMapper<Student>(){
            @Override
            public Student mapRow(ResultSet rs, int rwNumber) throws SQLException {
                Student student = new Student();
                student.setStudentId(rs.getString("empId"));
                student.setStudentName(rs.getString("empName"));
                return student;
            }
        });
    }

}
