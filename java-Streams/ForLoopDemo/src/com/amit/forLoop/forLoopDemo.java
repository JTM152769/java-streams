package com.amit.forLoop;

import java.util.Arrays;
import java.util.Iterator;
import java.util.List;

public class forLoopDemo {
	
	public static void main(String[] args) {
		
		List<Integer> values = Arrays.asList(1,2,3,4,5,6,7);
		//Simple forloop
		for(int i=0; i<7;i++) {
			System.out.println(values.get(i));
		}
		
		System.out.println("----------------------------------");
		//
		//IteratorLoop
		Iterator<Integer> i = values.iterator();
		while(i.hasNext()) {
			System.out.println(i.next());
		}
		System.out.println("----------------------------------");
		
		//Enhanced for loop
		
		for(int j : values) {
			System.out.println(j);
		}
		System.out.println("----------------------------------");
		
		//forEach method 1.8 version
		
		values.forEach(k-> System.out.println(k));
	}

}
