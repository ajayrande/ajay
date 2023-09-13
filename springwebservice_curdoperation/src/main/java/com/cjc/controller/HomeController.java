package com.cjc.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.cjc.model.Student;
import com.cjc.service.HomeService;


@CrossOrigin("*")
@RestController
public class HomeController 
{
	@Autowired
	HomeService hs;
	
	@PostMapping("/savedata")
	public String saveData(@RequestBody Student s)
	{
		hs.saveData(s);
		System.out.println(s);
		
		return "Student data save....";
	}
	@GetMapping("/getstu")
	public List getData()
	{
	   List l=	hs.getData();
	   return l;
		
	}
	@DeleteMapping("/deleted/{id}")
	public String deletedata(@PathVariable ("id")int id)
	{
		hs.deletedeta(id);
		return "delete data";
	}
	@PutMapping("/updatedata")
	public String updated(@RequestBody Student s)
	{
		hs.saveData(s);
		return "update data";
	}
	
	@GetMapping("/getbyid/{id}")
	public Student getid(@PathVariable("id")int id)
	{
		Student s=hs.getid(id);
		return s;
	}

}
