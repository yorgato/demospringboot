package com.yorgato.spring.demo.util.sort;

import java.util.Collection;
import java.util.Comparator;
import java.util.List;
import java.util.ArrayList;

/**
 * 
 * Version of implementation of Algoritm  BubbleSort
 * @author yorgato
 *
 * @param <T>
 */
public class BubbleSort<T> implements SortAlgorithm<T> {

	/**
	 * Sort Method: this method compare each element, from left to right 
	 * and switching their positions if they out the order until ordering the list
	 */
    @Override    
    public List<T> sort(Collection<T> collection, Comparator<T> comparator) {
        List<T> list = new ArrayList<>(collection);
        for (int i = 0; i < list.size(); ++i) {
            for (int j = 1; j < list.size() - i; ++j) {
                T a = list.get(j - 1);
                T b = list.get(j);
                if (comparator.compare(a, b) > 0) {
                    swap(list, j - 1, j);
                }
            }
        }
        return list;
    }
}