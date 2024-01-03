package org.example;

    import java.util.List;
    
    public class Main {
        public static void main(String[] args) {
            //Test Classroom
            Classroom classroom = new Classroom("Class A");
            //Students
            Student s1 = new Student("A",1,67);
            Student s2 = new Student("B",2,77);
            Student s3 = new Student("C",3,57);
            Student s4 = new Student("D",4,87);
            classroom.addStudent(s1);
            classroom.addStudent(s2);
            classroom.addStudent(s3);
            classroom.addStudent(s4);
            List<Student> studentList = classroom.getStudentsWithMarks(70);
            for(int i=0;i<studentList.size();i++){
                System.out.println(studentList.get(i).getStudentName());
            }
        }
    }
