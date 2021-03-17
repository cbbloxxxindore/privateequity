package com.vanguard.dao;

import org.springframework.data.jpa.repository.JpaRepository;

import com.vanguard.entites.Invester;

public interface InvestorRepo  extends JpaRepository<Invester, Integer>{

	Invester findByid(int id);

}
