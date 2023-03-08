package com.example.demo.Controller;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import com.example.demo.Model.BookingEntity;
//import com.example.demo.Entity.CustomerEntity;
//import com.example.demo.Service.CustomerServices;
//import com.example.demo.Entity.BookingEntity;
import com.example.demo.Service.BookingService;

@RestController
@CrossOrigin
public class Controller {
	
	@Autowired
	BookingService Bservice;
	

	//CREATE 
	@PostMapping("/addDetails")
	public String add(@RequestBody BookingEntity ee) {
		return Bservice.addDetails(ee);
	}

	@GetMapping("/showDetails")
	public List <BookingEntity> show() {
		return Bservice.showDetails();
	}

	
	@GetMapping("/showDetails/{id}")
	public Optional<BookingEntity> getById(@PathVariable int id) {
		return Bservice.getById(id);
	}
	
	
	
	
	@GetMapping("/pagination/{offset}/{pagesize}")
	public List <BookingEntity> pagination(@PathVariable("offset") int offset,@PathVariable("pagesize") int pagesize){
		return Bservice.getWithPagination(offset,pagesize);
	}
	
	//UPDATE
	@PutMapping("/updateDetails")
	public String update(@RequestBody BookingEntity ee) {
		return Bservice.updateDetails(ee);
	}

	
	//DELETE by ID
	@DeleteMapping("/deleteDetails/{eid}")
	public String delete(@PathVariable("eid") int id) {
		return Bservice.deleteDetails(id);
	}

	
	

}