package com.example.demo;
import java.util.ArrayList;
import java.util.List;
import java.util.Optional;

import org.springframework.stereotype.Service;

@Service
public class StudentService {


	List<Student> students = new ArrayList<>();


	public void createStudents() {

		students.add(new Student(1, "lahari", 5, 11));
		students.add(new Student(2, "srujan", 3, 22));
		students.add(new Student(3, "alekhya",9, 33));
		students.add(new Student(4, "hyma", 8, 44));
	}

	public List<Student> getStudents(){
		createStudents();
		return students;
	}
	
	public Student getStudent(int id) {
		Student student=  students.stream().filter(s -> s.getId() == id ).findFirst().get();
		return student;
	}

	public void addStudent(Student student) {
		System.out.println("controllers add student");
		students.add(student);
	}

	public void updateStudent(Student student, int id) {
		for(int i = 0; i< students.size(); i++) {
			Student s = students.get(0);
			if(s.getId() == id) {
				students.set(id, student);
				return;
			}
		}
	}
	public void removeStudent(int id) {
		students.removeIf(s -> s.getId() == id);
	}

}