package main.schoolManagement;

import java.util.List;

public class School {
    private List <Teacher> teachers;
    private List<Student> students;
    private int totalMoneyEarned;
    private int totalMoneySpent;

    public School(List<Teacher> teacher, List<Student> student) {
        this.teachers = teacher;
        this.students = student;
        totalMoneyEarned = 0;
        totalMoneySpent = 0;
    }

    public List<Teacher> getTeacher() {
        return teachers;
    }

    public void addTeacher(Teacher teacher) {
        teachers.add(teacher);
    }

    public List<Student> addStudents() {
        return students;
    }

    public void addStudents(Student student) {
        students.add(student);
    }

    public int getTotalMoneyEarned() {
        return totalMoneyEarned;
    }

}
