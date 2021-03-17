package com.vanguard.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Service;

import com.sun.el.stream.Optional;
import com.vanguard.dao.InvestorRepo;
import com.vanguard.entites.Invester;

@Service
public class InvesterService
{
	@Autowired
	InvestorRepo ir;
public Invester AddInvester(Invester i) {
		
		
		Invester invester=null;
		
		invester=ir.save(i);
		if (invester==null) {
			throw ( new NullPointerException());
		}
		return  invester;
		
	}
public Invester UpdateInvester(Invester i) {
		
		
	Invester invester=null;

		
	invester=ir.save(i);
	if (invester==null) {
		throw ( new NullPointerException());
	}
	return  invester;
	
		
	}
public  void deleteInvester( int id) {
	
	try {
		ir.deleteById(id);
	}
	catch (Exception e) {
	
	System.out.println(e);
	}
	
	
	
	
}
public Invester InvestergetInvester( int id) {
	
	
	return  ir.findByid(id);

}
public List<Invester> getAllInvester() {
	
	
	
	
	return ir.findAll();
	
}

}
