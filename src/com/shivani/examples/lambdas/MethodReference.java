package com.shivani.examples.lambdas;
import java.util.Arrays;
import java.util.List;
import java.util.function.Consumer;

/**
 * @author shivanijain1313
 * Alternate way to write Lambda Expression: Lambda Expression
 *
 */
public class MethodReference {

	public static void main(String[] args) {
		List<String> str = Arrays.asList("John","Joe","Shivani","Zoya");
		
		//Consumer: Functional interface in java 8
		Consumer<String> lambdaConsumer = s->System.out.println(s);
		System.out.println("Using Lambda expression:");
		str.forEach(lambdaConsumer);
		
		//Method references are passed using :: operator (classname::methodname)
		Consumer<String> methodRefConsumer = System.out::println;
		System.out.println("Using Method Reference:");
		str.forEach(methodRefConsumer);
		

	}

}
