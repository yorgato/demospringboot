package com.yorgato.spring.demo.util.controller;

import java.util.Collections;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.Random;
import java.util.stream.Collectors;

import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;

import com.yorgato.spring.demo.util.sort.BubbleSort;
import com.yorgato.spring.demo.util.sort.MergeSort;
import com.yorgato.spring.demo.util.sort.QuickSort;

/**
 * Controller for rest api, allow map of route and parameters for execute the sort algorithm
 * function.
 * 
 * @author yorgato
 *
 */
@RestController
@CrossOrigin
public class SortController {

	public SortController() {
		super();
		// TODO Auto-generated constructor stub
	}
	
	/**
	 * run the sort algorithm and return the times, the main idea is print of  response  time of each algorithm
	 * Example: http://localhost:8081/sort/runall
	 * 
	 * @param code
	 * @return
	 */
	@GetMapping("/sort/runall")
	public ResponseEntity<?> runAll() {
		
		Random rn = new Random();
		//Map that include response
		Map<String, Object> response= new HashMap<>();

		//List that have the number of values to generate and values of random
		List<Integer> al = rn.ints(5000, 0, 10000000).boxed().collect(Collectors.toList());
				
        final long start = System.nanoTime();
        Collections.sort(al);
        final long end = System.nanoTime();
        response.put("Algorithm Default implementation", "Time end:"+((end-start)/1000000)+ "ms");
        
        final long start1 = System.nanoTime();
        List<Integer> bubbleSort = new BubbleSort<Integer>().sort(al, Integer::compareTo);        
        final long end1 = System.nanoTime();  
        response.put("Algorithm BubbleSort", "Time end:"+((end1-start1)/1000000)+ "ms");
        
        final long start2 = System.nanoTime();
        List<Integer> mergeSort = new MergeSort<Integer>().sort(al, Integer::compareTo);        
        final long end2 = System.nanoTime();        
        response.put("Algorithm MergeSort", "Time end:"+((end2-start2)/1000000)+ "ms");
        
        final long start3 = System.nanoTime();
        List<Integer> quickSort = new QuickSort<Integer>().sort(al, Integer::compareTo);        
        final long end3 = System.nanoTime();        
        response.put("algorithm QuickSort", "Time end:"+((end3-start3)/1000000)+ "ms");
				
		return new ResponseEntity<Map<String, Object>>(response,HttpStatus.OK);
	}

}
