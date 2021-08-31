package com.yorgato.spring.demo.util.sort;

import java.util.Collection;
import java.util.Comparator;
import java.util.List;
/**
 * Sort Algorithm is a interface, their main objective is implementacion unique sort method 
 * @author yorgato
 *
 * @param <T>
 */
public interface SortAlgorithm<T> {

	/**
	 * Sort method
	 * @param collection
	 * @param comparator
	 * @return
	 */
	List<T> sort(Collection<T> collection, Comparator<T> comparator);

	/**
	 * Defulta swap method
	 * @param list
	 * @param i
	 * @param j
	 */
    default void swap(List<T> list, int i, int j) {
        T ti = list.get(i);
        T tj = list.get(j);
        list.set(j, ti);
        list.set(i, tj);
    }
    
    default void print() {
    	System.out.print("hola");
    }
}
