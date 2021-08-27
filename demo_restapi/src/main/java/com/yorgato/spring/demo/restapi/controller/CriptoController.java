package com.yorgato.spring.demo.restapi.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RestController;

import com.yorgato.spring.demo.restapi.entity.Cripto;
import com.yorgato.spring.demo.restapi.service.CriptoService;

/**
 * Controller for rest api, allow map of route and parameters for execute the
 * function.
 * 
 * @author User
 *
 */
@RestController
@CrossOrigin
public class CriptoController {

	@Autowired
	CriptoService criptoService;

	/**
	 * Defalt constructor
	 */
	public CriptoController() {
	}

	/**
	 * get coin for your code http://localhost:8081/cripto/get
	 * 
	 * @param code
	 * @return
	 */
	@GetMapping("/cripto/get/{code}")
	public Object getCripto(@PathVariable String code) {
		Cripto cripto = null;
		try {
			cripto = criptoService.get(code);
		} catch (Exception e) {
			// TODO: handle exception
		}
		return cripto;
	}

	/**
	 * List of coins
	 * 
	 * @param code
	 * @return
	 */
	@GetMapping("/cripto/list")
	public List<Cripto> listCripto(@PathVariable String code) {
		List<Cripto> list_cripto = null;
		try {
			list_cripto = criptoService.list();
		} catch (Exception e) {
			// TODO: handle exception
		}
		return list_cripto;
	}

	/**
	 * Include the coin
	 * 
	 * @param cripto
	 * @return
	 */
	@PostMapping("/cripto/add")
	public Object addCripto(@PathVariable Cripto cripto) {
		Cripto cripto_new = null;
		try {
			cripto_new = criptoService.add(cripto);
		} catch (Exception e) {
			// TODO: handle exception
		}
		return cripto_new;
	}

	/**
	 * Delete the coin
	 * 
	 * @param code
	 * @return
	 */
	@PostMapping("/cripto/delete/{code}")
	public Object deleteCripto(@PathVariable String code) {
		Cripto cripto_new = null;
		try {
			cripto_new = criptoService.delete(code);
		} catch (Exception e) {
			// TODO: handle exception
		}
		return cripto_new;
	}

}
