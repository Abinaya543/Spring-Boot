package com.example.demo;

import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController

public class StudentController 
{
	@Value("${value.name}")
	private String newnameString;
	@GetMapping("/")
	public String homepage() {
		return newnameString + " to student list";
		
	}
	
	@GetMapping("/list")
	public List<Monday>getList(){
		List<Monday>detailsList=new ArrayList<>();
		detailsList.add(new Monday(1,"XXXX",23));
		
		return detailsList;
	}
	

}
