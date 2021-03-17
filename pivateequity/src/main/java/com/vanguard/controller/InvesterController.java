package com.vanguard.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.vanguard.entites.Invester;
import com.vanguard.service.InvesterService;

@RestController
public class InvesterController {

	
	@Autowired
	InvesterService  is;
	
	
	@PostMapping("/addinvester")
	public ResponseEntity<Invester> AddInvester(@RequestBody Invester invester) 
	{
		
		Invester invester2=null;
	invester2	=is.AddInvester(invester);
		if (invester2==null) {
			return ResponseEntity.status(HttpStatus.INTERNAL_SERVER_ERROR).build();
		}
		
		return  ResponseEntity.ok(invester2);
		
	}
	@PutMapping("/upadateInvester")
public ResponseEntity<Invester> UpdateInvester(@RequestBody  Invester invester) {
		
		
		
		
	Invester invester2=null;
	invester2	=is.AddInvester(invester);
		if (invester2==null) {
			return ResponseEntity.status(HttpStatus.INTERNAL_SERVER_ERROR).build();
		}
		
		return  ResponseEntity.ok(invester2);
		
		
	}
	@DeleteMapping("/deleteInvester/{id}")
public ResponseEntity<Void> deleteInvester( @PathVariable("id")int id) {
	
	
	try {
		
		is.deleteInvester(id);
		return ResponseEntity.status(HttpStatus.NO_CONTENT).build();
	}
	catch (Exception e) {
		// TODO: handle exception
	}
	return ResponseEntity.status(HttpStatus.OK).build();
	
}
	/**
	 * @param id
	 * @return
	 */
	@GetMapping("/getInvester/{id}")
public ResponseEntity<Invester> getInvester(@PathVariable("id")int id) 
	{
		Invester  i=null;
		try {
			i=is.InvestergetInvester(id);
		 
		 
	} catch (Exception e) {

	ResponseEntity.status(HttpStatus.NOT_FOUND);
	}
	
		return  ResponseEntity.of(java.util.Optional.of(i));
	
}
	@GetMapping("/getInvester")
public ResponseEntity<List<Invester>> getAllInvester() 
	{
	
	List <Invester>list=null;
	
	
		try {
			
		list =is.getAllInvester();
		 
	} catch (Exception e) {

	ResponseEntity.status(HttpStatus.NOT_FOUND);
	}
	
		return  ResponseEntity.of(java.util.Optional.of(list));
	
}	
}

