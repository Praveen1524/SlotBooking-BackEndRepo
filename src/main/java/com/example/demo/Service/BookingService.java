package com.example.demo.Service;

import java.util.List; 
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.PageRequest;
import org.springframework.data.domain.Sort;
import org.springframework.stereotype.Service;

import com.example.demo.Repository.BookingRepository;
import com.example.demo.Model.BookingEntity;

@Service
public class BookingService {

	@Autowired
	BookingRepository Brepo;
	public String addDetails(BookingEntity ee) {
		Brepo.save(ee);
		return "Data added";
	}
	
	public String updateDetails(BookingEntity ee) {
		Brepo.saveAndFlush(ee);
		return "Data updated";
	}
	
	public String deleteDetails(int id) {
		Brepo.deleteById(id);
		return "data Deleted";
	}
	public List<BookingEntity> sortByAsc(String field){
		return Brepo.findAll(Sort.by(Sort.Direction.ASC,field));
	}
	public List<BookingEntity> sortByDesc(String field){
		return Brepo.findAll(Sort.by(Sort.Direction.DESC,field));
	}
	public Optional<BookingEntity> getById(int id) {
		return Brepo.findById(id);
	}
	public List<BookingEntity> showDetails(){
		return Brepo.findAll();
	}
	
	public List<BookingEntity> getWithPagination(int offset,int pageSize){
		Page<BookingEntity> page = Brepo.findAll(PageRequest.of(offset,pageSize));
		return page.getContent();
	}
}