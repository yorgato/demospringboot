package com.yorgato.spring.demo.db.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;

import com.yorgato.spring.demo.db.entity.Cripto;

public interface CriptoRepository extends JpaRepository<Cripto, Long>{

	@Query("select c from Cripto c where c.code = ?1 ")
	public Cripto findByCode(String code);
	
}
