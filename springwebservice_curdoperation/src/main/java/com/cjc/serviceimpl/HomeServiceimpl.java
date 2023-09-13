package com.cjc.serviceimpl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;

import com.cjc.model.Student;
import com.cjc.repository.HomeRepository;
import com.cjc.service.HomeService;


@Service
public class HomeServiceimpl implements HomeService 
{
	@Autowired
	HomeRepository hr;

	@Override
	public void saveData(Student s) 
	{
	  hr.save(s);
		
	}

	@Override
	public List getData() {
		List<Student> l= (List<Student>) hr.findAll();
		return l;


	}

	@Override
	public void deletedeta(int id) {
		hr.deleteById(id);
		
	}

	@Override
	public Student getid(int id) {
	Student s= hr.findAllById(id);
		return s;
	}
	
	

}
