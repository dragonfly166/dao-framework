import dao.StudentDao;
import daoImpl.StudentDaoImpl;
import java.util.List;
import model.Student;
import org.junit.Test;

public class DaoTest {
    /**
     * 测试dao
     */
    @Test
    public void daoTest() {
        StudentDao studentDao = new StudentDaoImpl();

        System.out.println(studentDao);
        //插入学生数据
        studentDao.insertStudent(1, "slf1");
        studentDao.insertStudent(2, "slf2");
        studentDao.insertStudent(3, "slf3");
        List<Student> students = studentDao.queryAll();
        System.out.println(students);

        //查询id为1的学生信息
        Student student = studentDao.queryStudentById(1);
        System.out.println(student);

        //更新id为2学生的name
        studentDao.updateStudentById(2, "张三");
        student = studentDao.queryStudentById(2);
        System.out.println(student);

        //删除id为3的学生信息
        studentDao.deleteStudentById(3);
        students = studentDao.queryAll();
        System.out.println(students);
    }
}
