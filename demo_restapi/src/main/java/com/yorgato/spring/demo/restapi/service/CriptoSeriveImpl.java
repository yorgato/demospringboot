package com.yorgato.spring.demo.restapi.service;

import java.sql.Timestamp;
import java.util.Collection;
import java.util.Collections;
import java.util.Comparator;
import java.util.LinkedList;
import java.util.List;

import org.springframework.stereotype.Component;
import org.springframework.stereotype.Service;

import com.yorgato.spring.demo.restapi.entity.Cripto;

/**
 * CriptoService class implementation standard methods for crud
 * 
 * @author User
 *
 */
@Service
@Component
public class CriptoSeriveImpl implements CriptoService {

	private List<Cripto> list = null;

	/**
	 * Default constructor: in this example we put 3 default coins BTC, ETH,LTC
	 */
	public CriptoSeriveImpl() {
		list = new LinkedList<>();
		// default criptos BTC, ETH, LTC
		Timestamp timestamp = new Timestamp(System.currentTimeMillis());
		Cripto cripto1 = new Cripto("BTC", "BTC", 40000d, 40134.0d, 40134.2d, timestamp);
		Cripto cripto2 = new Cripto("ETH", "ETH", 2000d, 2034.0d, 2035.2d, timestamp);
		Cripto cripto3 = new Cripto("LTC", "LTC", 300d, 301.0d, 304.2d, timestamp);
		list.add(cripto1);
		list.add(cripto2);
		list.add(cripto3);
	}

	/**
	 * get coin for your code
	 */
	@Override
	public Cripto get(String code) throws Exception {
		// TODO Auto-generated method stub
		Comparator<Cripto> c = (Cripto o1, Cripto o2) -> o1.getCode().compareTo(o2.getCode());
		int index = Collections.binarySearch(list, new Cripto(code, null, null, null, null, null), c);
		Cripto cripto = list.get(index);
		return cripto;
	}

	/**
	 * List of coins
	 */
	@Override
	public List<Cripto> list() throws Exception {
		// TODO Auto-generated method stub
		return list;
	}

	/**
	 * Include the coin
	 */
	@Override
	public Cripto add(Cripto cripto) throws Exception {
		// TODO Auto-generated method stub
		list.add(cripto);
		return cripto;
	}

	/**
	 * delete the coin
	 */
	@Override
	public Cripto delete(String code) throws Exception {
		// TODO Auto-generated method stub

		// comparator with lambda expression search for code
		Comparator<Cripto> c = (Cripto o1, Cripto o2) -> o1.getCode().compareTo(o2.getCode());

		int index = Collections.binarySearch(list, new Cripto(code, null, null, null, null, null), c);
		// remove coin
		Cripto cripto = list.remove(index);
		return cripto;
	}

}
