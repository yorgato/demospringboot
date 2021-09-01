package com.yorgato.spring.demo.util.controller;

import java.util.HashMap;
import java.util.Map;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import com.yorgato.spring.demo.util.UtilService;

@RestController
@CrossOrigin
public class LambdaController {

	@Autowired
	UtilService utilService;

	public LambdaController() {
		super();
		// TODO Auto-generated constructor stub
	}

	/**
	 * Single parameter lambda and list iterator
	 * 
	 * @return
	 */
	@GetMapping("/lambda/run")
	public ResponseEntity<?> run() {
		Map<String, Object> response = new HashMap<>();
		response = utilService.listAdd();
		return new ResponseEntity<Map<String, Object>>(response, HttpStatus.OK);
	}

	/**
	 * single parameter lambda
	 * 
	 * @return
	 */
	@GetMapping("/lambda/runsimpleparam")
	public ResponseEntity<?> runSimgleVar() {
		double responseq = utilService.operationAdd();
		return new ResponseEntity<Object>(responseq, HttpStatus.OK);
	}

	/**
	 * multiple parameter lambda example
	 * 
	 * @return
	 */
	@GetMapping("/lambda/runmultipleparamopc1")
	public ResponseEntity<?> runMultipleVar1() {
		String responseq = utilService.strconcat();
		return new ResponseEntity<Object>(responseq, HttpStatus.OK);
	}

	/**
	 * multiple parameter lambda example
	 * 
	 * @return
	 */
	@GetMapping("/lambda/runmultipleparamopc2")
	public ResponseEntity<?> runMultipleVar2() {
		double responseq = utilService.operacionMa();
		return new ResponseEntity<Object>(responseq, HttpStatus.OK);
	}
}
