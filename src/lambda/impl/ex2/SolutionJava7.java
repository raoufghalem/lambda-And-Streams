package lambda.impl.ex2;

import java.util.Arrays;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

public class SolutionJava7 {
	
	public static void main(String[] args) {
		List<Person> myList = Arrays.asList(
					new Person("raouf", "gh", 25),
					new Person("yacine", "gh", 6),
					new Person("yassmine", "gh", 24),
					new Person("hassane", "gh",56)
					);
		
		//1 sort by last name
		Collections.sort(myList, new Comparator<Person>() {
			public int compare(Person arg0, Person arg1) {
				return arg0.getFirstname().compareTo(arg1.getFirstname());
			}
		});
		

		
		//2 create method that prints all elements
		printAll(myList);
		
		//3 print all name that starts with H
		System.out.println();
		printAllWithH(myList, "h");
		//OR we use a Condition and inner class to implement it
		printAllWithHCondition(myList, new Condition() {
			public boolean test(Person p) {
				return p.getFirstname().startsWith("r");
			}
		});
		
		
		}
	private static void printAll(List<Person> p) {
		for(Person temp : p) {
		System.out.println(temp);
		}
	}
	
	private static void printAllWithH(List<Person> p, String l) {
		for(Person temp : p) {
			if(temp.getFirstname().startsWith(l))
				System.out.println(temp);
		}
	}
	private static void printAllWithHCondition(List<Person> p, Condition c) {
		for(Person temp : p) {
			if(c.test(temp))
				System.out.println(temp);
		}
	}
}


interface Condition{
	boolean test(Person p);
}
