package com.amit.parallelStream;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Stream;

import com.amit.model.Student;

public class StreamMethods {
	public static void main(String[] args) {
		
		List<Student> list = new ArrayList<>();
		
		list.add(new Student("Amit", 26));
		list.add(new Student("Sumit", 29));
		list.add(new Student("Mikrant", 30));
		list.add(new Student("Ravi", 31));
		list.add(new Student("Shyam", 32));
		
		Stream<Student> filteredList = list.stream().filter(s-> s.getAge()>30);
		filteredList.forEach(System.out::println);
		
		boolean anyMatch = list.stream().anyMatch(s->s.getName().contains("S"));
		System.out.println(anyMatch);
		
		boolean allMatch = list.stream().allMatch(s->s.getName().contains("S"));
		System.out.println(allMatch);
		
		boolean anyMatch2 = list.stream().anyMatch(s->s.getAge()>32);
		System.out.println(anyMatch2);
		
		
	}

}
