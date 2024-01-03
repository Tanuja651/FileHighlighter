package org.example;

import java.util.ArrayList;
import java.util.List;

public class Classroom {
    private String className;
    private List<Student> studentList;

    public String getClassName() {
        return className;
    }

    public void setClassName(String className) {
        this.className = className;
    }

    public List<Student> getStudentList() {
        return studentList;
    }

    public void setStudentList(List<Student> studentList) {
        this.studentList = studentList;
    }

    public Classroom(){};

    public Classroom(String className){
        this.className=className;
        this.studentList=new ArrayList<>();
    }

    public void addStudent(Student student){
        this.studentList.add(student);
    }

    public List<Student> getStudentsWithMarks(Integer marks){
        List<Student> students = new ArrayList<>();
        for(int i=0;i<studentList.size();i++){
            if(studentList.get(i).getMarks()>marks){
                students.add(studentList.get(i));
            }
        }
        return students;
    }
}
    