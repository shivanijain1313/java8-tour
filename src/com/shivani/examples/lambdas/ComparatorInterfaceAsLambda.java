package com.shivani.examples.lambdas;
import java.util.Arrays;
import java.util.Comparator;

/**
 * @author shivanijain1313
 * Convert anonymous class to Lambda Expression
 *
 */
public class ComparatorInterfaceAsLambda {

	public static void main(String[] args) {

		String names[] = new String[] { "Shivani", "John", "Prince", "Zoya" };
      basicComparator(names);
      basicComparatorToLambda(names);
		
	}
	
	//Convert comparator to corresponding lambda expression
	private static void basicComparatorToLambda(String[] names) {

		// Skipping {} and return keyword
		Arrays.sort(names, (String s1, String s2) -> Integer.compare(s1.length(), s2.length()));
		
		//Skipping parameter type
		Arrays.sort(names, (s1, s2) -> Integer.compare(s1.length(), s2.length()));
		System.out.println("Lambda Expression result:"+Arrays.toString(names));
		
	}
	
	
	// Basic comparator passed as parameter to sort on the basis of string length
	private static void basicComparator(String[] names) {
		Arrays.sort(names, new Comparator<String>() {
			public int compare(String s1, String s2) {
				return Integer.compare(s1.length(), s2.length());
			}
		});
		System.out.println("Basic Comparator result:" + Arrays.toString(names));
	}

}