package com.shivani.examples.functionalInterfaces;

import java.util.function.Consumer;
import java.util.function.Function;
import java.util.function.Predicate;
import java.util.function.Supplier;

import com.shivani.examples.comparator.Person;

/**
 * @author shivanijain1313
 * Demonstrate use of functional interfaces
 * Functional Interface: Interface with only one abstract method
 *
 */
public class FunctionalInterfacesDemo {
	
	public static void main(String args[]){
		
		// Predicate interface: abstract method @boolean test(T t)
		Predicate<String> p = s->s.length()>10;
		System.out.println("Predicate demo:"+p.test("Hello World"));
		
		//Consumer interface: abstract method @void accept(T t)
		Consumer<String> c =  s->System.out.println("Consumer demo:"+s);
		c.accept("Shivani");
		
		//Supplier interface: abstract method @T get()
		Supplier<Person> s = () -> new Person(12,"Shivani","Jain");
		System.out.println("Supplier demo:"+s.get());
		
		//Function interface: abstract method @R apply(T t ) R:Integer T:Person
		Function<Person,Integer> f = Person::getAge;
		Person person1 = new Person(21,"Shivani","Jain");
		System.out.println("Function demo:"+f.apply(person1));
		
	}

}
