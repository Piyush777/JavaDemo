package org.ust.Association;

import java.util.ArrayList;
import java.util.List;

class Course {

    private final String courseName;
    private final List<Student> studentList;

    public Course(String courseName) {
        this.courseName = courseName;
        this.studentList = new ArrayList<>();
    }

    public void addStudent(Student student){
        studentList.add(student);
    }

    public List<Student> getStudentList(){
        return studentList;
    }

    public String getCourseName(){
        return courseName;
    }
}

class Student{
    private final String name;
    private final List<Course> courseList;

    public Student(String name){
        this.name = name;
        this.courseList = new ArrayList<>();
    }

    public void enrollInCourse(Course course){
        courseList.add(course);
        course.addStudent(this);
    }

    public List<Course> getCourseList(){
        return courseList;
    }

    public String getName(){
        return name;
    }
}

public class ManyToManyAssociation {
    public static void main(String[] args) {
        Course math = new Course("Mathematics");
        Course science = new Course("Science");

        Student alice = new Student("Alice");
        Student bob = new Student("Bob");

        alice.enrollInCourse(math);
        alice.enrollInCourse(science);

        bob.enrollInCourse(math);

        System.out.println("Students in Mathematics ");
        for(Student student: math.getStudentList()){
            System.out.println(student.getName());
        }

        System.out.println("Courses Alice enrolled for  ");
        for(Course course: alice.getCourseList()){
            System.out.println(course.getCourseName());
        }

        System.out.println("Students in Science ");
        for(Student student: science.getStudentList()){
            System.out.println(student.getName());
        }

        System.out.println("Courses Bob enrolled for  ");
        for(Course course: bob.getCourseList()){
            System.out.println(course.getCourseName());
        }


    }
}
