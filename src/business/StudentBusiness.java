package business;

import java.util.ArrayList;
import java.util.List;
import dao.StudentDao;
import models.Student;

public class StudentBusiness implements StudentDao {

    private List<Student> students;

    public StudentBusiness(){
        this.students = new ArrayList<>();
    }

    @Override
    public List<Student> selectALL() {
        return this.students;
    }

    @Override
    public void create(
            String cin,
            String name,
            int age) {
        Student student = new Student(cin, name, age);
        this.students.add(student);
    }

    @Override
    public Student find(String cin) {
        for (Student student : students) {
            if (student.getCin().equals(cin)) {
                return student;
            }
        }
        return null;
    }

    @Override
    public void update(String cin, String name, int age) {
        Student student = this.find(cin);
        student.setName(name);
        student.setCin(cin);
    }

    @Override
    public void delete(String cin) {
        Student student = this.find(cin);
        this.students.remove(student);
    }
}