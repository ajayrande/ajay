package com.cjc.service;

import java.util.List;

import com.cjc.model.Student;


public interface HomeService {

	void saveData(Student s);

	List<Student> getData();

	void deletedeta(int id);

	Student getid(int id);

}
