
package com.example.demo;

import java.util.ArrayList;
import java.util.List;

import org.springframework.stereotype.Service;

@Service
public class StudentService {


	List<Student> students = new ArrayList<>();


	public void createStudents() {

		students.add(new Student(1, "aaa",1, 89));
		students.add(new Student(2, "bbb",2,67));
		students.add(new Student(3, "ccc", 4,55));
		students.add(new Student(4, "ddd", 1,87));
	}

	public List<Student> getStudents(){
		createStudents();
		return students;
	}

}