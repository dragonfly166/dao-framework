package dao;

import java.util.List;
import model.Student;

public interface StudentDao {

    List<Student> queryAll();

    Student queryStudentById(int id);

    void insertStudent(int id, String name);

    void updateStudentById(int id, String name);

    void deleteStudentById(int id);
}
