package dao;

import bean.Student;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.jdbc.core.RowMapper;
import org.springframework.stereotype.Repository;

import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.List;
import java.util.Random;

@Repository
public class StudentDao {

    @Autowired
    private JdbcTemplate template;


    public int save(Student student) {
        if(student.getId() == 0) {
            // Generate a new random id for the student
            int newId;
            do {
                Random random = new Random();
                newId = random.nextInt(Integer.MAX_VALUE);
            } while (idExists(newId));
            student.setId(newId);
        } else {
            // Check if a student with the given id already exists
            if(idExists(student.getId())) {
                throw new RuntimeException("Student with id " + student.getId() + " already exists");
            }
        }
        String sql = "INSERT INTO Student(id, name, course, courseCode, credits) VALUES (?, ?, ?, ?, ?)";
        return template.update(sql, student.getId(), student.getName(), student.getCourse(), student.getCourseCode(), student.getCredits());
    }

    private boolean idExists(int id) {
        String sql = "SELECT count(*) FROM Student WHERE id = ?";
        int count = template.queryForObject(sql, new Object[]{id}, Integer.class);
        return count > 0;
    }


    public int update(Student student) {
        String sql = "UPDATE Student SET name = ?, course = ?, courseCode = ?, credits = ? WHERE id = ?";
        return template.update(sql, student.getName(), student.getCourse(), student.getCourseCode(), student.getCredits(), student.getId());
    }

    public int delete(int id) {
        String sql = "DELETE FROM Student WHERE id = ?";
        return template.update(sql, id);
    }

    public Student getStudentById(int id) {
        String sql = "SELECT * FROM Student WHERE id = ?";
        return template.queryForObject(sql, new Object[]{id}, new StudentMapper());
    }

    public List<Student> getStudents() {
        String sql = "SELECT * FROM Student";
        return template.query(sql, new StudentMapper());
    }

    private static final class StudentMapper implements RowMapper<Student> {

        public Student mapRow(ResultSet rs, int rowNum) throws SQLException {
            Student student = new Student();
            student.setId(rs.getInt("id"));
            student.setName(rs.getString("name"));
            student.setCourse(rs.getString("course"));
            student.setCourseCode(rs.getString("courseCode"));
            student.setCredits(rs.getInt("credits"));
            return student;
        }
    }
}