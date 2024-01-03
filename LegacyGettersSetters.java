package org.example;

import java.util.ArrayList;
import java.util.List;
import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
public class Classroom {

    private String className;

    private List<Student> studentList;

    public Classroom() {
    }

    public Classroom(String className) {
        this.className = className;
        this.studentList = new ArrayList<>();
    }

    public void addStudent(Student student) {
        this.studentList.add(student);
    }

    public List<Student> getStudentsWithMarks(Integer marks) {
        List<Student> students = new ArrayList<>();
        for (Student student : studentList) {
            if (student.getMarks() > marks) {
                students.add(student);
            }
        }
        return students;
    }
} 