package com.example.NewProject.Controller;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.HttpStatusCode;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.example.NewProject.ErrBean;
import com.example.NewProject.Bean.newBean;
import com.example.NewProject.Entity.newEntity;
import com.example.NewProject.Services.ImpService;
import com.example.NewProject.exception.CustomExceoption;

@RestController
@RequestMapping("/new")
@CrossOrigin(origins = "http://localhost:3000")
public class MainController {
	
	@Autowired
	ImpService service;
	
	@PostMapping("/postData")
	public String postData(@RequestBody newBean request) {
		return service.postData(request);
	}
	
	@GetMapping("/getData")
	public List<newEntity> getData() {
		return service.getData();
	}
	
	@GetMapping("/getData/{id}")
	public Optional<newEntity> getById(@PathVariable int id){
		return service.getById(id);
	}
	
	@PostMapping("/updateData/{id}")
	public String updateData(@RequestBody newBean request,@PathVariable int id) {
		return service.updateData(request,id);
	}
	
	@DeleteMapping("/deleteData/{id}")
	public String deleteData(@PathVariable int id) {
		return service.deleteData(id);
	}
	
	@GetMapping("/exp")
	public ResponseEntity<String> hello(){
		
	
//		try {
//	        int r = 10 / 0; 
//		}catch(ArithmeticException e) {
//	        return new ResponseEntity<>("Division by zero error!", HttpStatusCode.valueOf(300));
//		}
//		return null;
		
//		int r=10/0;
		String s=null;
		s.equals("hello");
		throw new CustomExceoption("invalid number");
//		return new ResponseEntity<String>("hello",HttpStatusCode.valueOf(300));
	}
}
