package com.student.dao;

import java.util.List;

import com.student.pojo.Student;

public interface studentdao {
	boolean addstudent(Student s);
	boolean UpdateStudent (Student s);
	boolean DeleteStudent(int rollno );
    List<Student>ShowAll();
}
