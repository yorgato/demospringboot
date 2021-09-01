package com.yorgato.spring.demo.util;

import java.util.HashMap;
import java.util.LinkedList;
import java.util.List;
import java.util.Map;
import java.util.Random;
import java.util.stream.Collectors;

import org.springframework.stereotype.Component;
import org.springframework.stereotype.Service;

/**
 * Class that implement many FunctionalInterface for execution of lambdas examples with parameters
 * @author User
 *
 */
@Service
@Component
public class UtilService {
	
	/**
	 * Interface for operation of example multiple parameters
	 * @author User
	 *
	 */
	@FunctionalInterface	
	interface MathMul {
		public double operation(double x, double y);
	}
	
	/**
	 * Interface for operation of example one parameters
	 * @author User
	 *
	 */
	@FunctionalInterface
	interface MathOne {
		public int incrementByFive(int a);
	}

	/**
	 * Interface for operation of example multiple parameters
	 * @author User
	 *
	 */
	@FunctionalInterface
	interface StringConcat {
	    public String sconcat(String a, String b);
	}
		

	/**
	 * Execution of lambda example for multiplex parameters operation of sum 
	 * @return
	 */
	public double operacionMa() {
		MathMul o = (x, y) -> x + y;
		return o.operation(5, 6);
	}
	
	/**
	 * Execution of lambda example for multiple parameters that make concatenation String
	 * @return
	 */
	public String strconcat() {
		StringConcat s = (str1, str2) -> str1 + str2;		
		return s.sconcat("Hello ", "Everyone");
	}
	
	/**
	 * Execution of lambda example for one parameter that increment By Five the value
	 * @return
	 */
	public double operationAdd() {
		MathOne o = (x) -> x + 2;
		return o.incrementByFive(5);
	}
	
	/**
	 * Execution of lambda example for Foreach
	 * @return
	 */
	public Map<String, Object> listAdd() {
		Random rn = new Random();
		List<Integer> list_random = rn.ints(10, 0, 100).boxed().collect(Collectors.toList());
		List<Integer> list_random_new = new LinkedList<Integer>();		
		Map<String, Object> response= new HashMap<>();
		list_random.forEach( (n) -> { list_random_new.add(n+10); } );		
		response.put("list_random",list_random);
		response.put("list_random_new",list_random_new);		
		return response;
	}
	
	

}