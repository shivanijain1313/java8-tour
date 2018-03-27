package com.shivani.examples.comparator;

import java.util.Arrays;
import java.util.Comparator;
import java.util.List;

public class ComparatorFeatures {

	public static void main(String[] args) {
		Person person1 = new Person(21,"Shivani","Jain");
		Person person2 = new Person(25,"John","Raz");
		Person person3 = new Person(13,"Jack","Raz");
		List<Person> persons = Arrays.asList(person1,person2,person3);
		
       comparing(persons);
       reversed(persons);
       thenComparing(persons);
	}
	
	/**
	 *reversed: static method
	 * accepts Function as argument and returns Comparator instance
	 * reverse the order of comparison
	 */
	private static void reversed(List<Person> persons) {
		Comparator<Person> comparator = Comparator.comparing(Person::getAge).reversed();
		persons.sort(comparator);
		System.out.println("reversed method demo:");
		persons.forEach(System.out::println);
		
	}

	/**
	 * thenComparing: default method
	 * accepts Function as argument and returns Comparator instance
	 * Sorts on the basis of LastName and if lastname are equal then sort on the basis
	 * of FirstName
	 */
	private static void thenComparing(List<Person> persons) {
		Comparator<Person> comparator = Comparator.comparing(Person::getLastname).thenComparing(Person::getFirstName);
		persons.sort(comparator);
		System.out.println("thenComparing method demo:");
		persons.forEach(System.out::println);
	}


	/**
	 *comparing: static method
	 * accepts Function as argument and returns Comparator instance
	 */
	private static void comparing(List<Person> persons) {
		Comparator<Person> comparator = Comparator.comparing(Person::getAge);
		persons.sort(comparator);
		System.out.println("comparing method demo:");
		persons.forEach(System.out::println);
	}
	
	

}
