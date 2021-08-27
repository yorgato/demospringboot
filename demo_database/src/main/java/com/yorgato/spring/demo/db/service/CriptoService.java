package com.yorgato.spring.demo.db.service;

import java.util.List;

import com.yorgato.spring.demo.db.entity.Cripto;
/**
 * CriptoService interface with standard methods for crud
 * @author User
 *
 */
public interface CriptoService {

	/**
	 * get coin for your code
	 * @param code
	 * @return
	 * @throws Exception
	 */
	public Cripto get(String code) throws Exception;
	/**
	 * List of coins
	 * @return
	 * @throws Exception
	 */
	public List<Cripto> list() throws Exception;
	/**
	 * Include the coin
	 * @param cripto
	 * @return
	 * @throws Exception
	 */
	public Cripto add(Cripto cripto) throws Exception;
	
	/**
	 * Delete the coin
	 * 
	 * @param code
	 * @return
	 * @throws Exception
	 */
	public Cripto delete(String code) throws Exception;
}
