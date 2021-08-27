package com.yorgato.spring.demo.db.service;

import java.sql.Timestamp;
import java.util.Collection;
import java.util.Collections;
import java.util.Comparator;
import java.util.LinkedList;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;
import org.springframework.stereotype.Service;

import com.yorgato.spring.demo.db.entity.Cripto;
import com.yorgato.spring.demo.db.repository.CriptoRepository;

/**
 * CriptoService class implementation standard methods for crud
 * 
 * @author User
 *
 */
@Service
@Component
public class CriptoSeriveImpl implements CriptoService {

	
	@Autowired
	CriptoRepository criptoRepository;

	/**
	 * Default constructor: in this example we put 3 default coins BTC, ETH,LTC
	 */
	public CriptoSeriveImpl() {
		// default criptos BTC, ETH, LTC
//		Timestamp timestamp = new Timestamp(System.currentTimeMillis());
//		Cripto cripto1 = new Cripto("BTC", "BTC", 40000d, 40134.0d, 40134.2d, timestamp);
//		Cripto cripto2 = new Cripto("ETH", "ETH", 2000d, 2034.0d, 2035.2d, timestamp);
//		Cripto cripto3 = new Cripto("LTC", "LTC", 300d, 301.0d, 304.2d, timestamp);
//		criptoRepository.save(cripto1);
//		criptoRepository.save(cripto2);
//		criptoRepository.save(cripto3);
	}

	/**
	 * get coin for your code
	 */
	@Override
	public Cripto get(String code) throws Exception {
		Cripto cripto = criptoRepository.findByCode(code);		
		return cripto;
	}

	/**
	 * List of coins
	 */
	@Override
	public List<Cripto> list() throws Exception {
		// TODO Auto-generated method stub
		return criptoRepository.findAll();
	}

	/**
	 * Include the coin
	 */
	@Override
	public Cripto add(Cripto cripto) throws Exception {
		// TODO Auto-generated method stub
		cripto=criptoRepository.save(cripto);
		return cripto;
	}

	/**
	 * delete the coin
	 */
	@Override
	public Cripto delete(String code) throws Exception {
		Cripto cripto = criptoRepository.findByCode(code);		
		criptoRepository.delete(cripto);
		return cripto;
	}

}
