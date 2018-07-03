package lambda.impl.ex2;

import java.util.Arrays;
import java.util.Collections;
import java.util.List;
import java.util.function.Predicate;


public class SolutionJava8 {

	public static void main(String[] args) {
		List<Person> myList = Arrays.asList(
					new Person("raouf", "gh", 25),
					new Person("yacine", "gh", 6),
					new Person("yassmine", "gh", 24),
					new Person("hassane", "gh",56)
					);
		
		myList.stream();
		
		//1 sort by last name
		Collections.sort(myList, (a,b)-> a.getFirstname().compareTo(b.getFirstname()));
		
		//2 create method that prints all elements
		printAllWithHCondition(myList, p->true);
		/*  */
		
		//3 print all name that starts with H
		printAllWithHCondition(myList,  p-> p.getFirstname().startsWith("yac"));
		System.out.println();
		
		}

	
	private static void printAllWithHCondition(List<Person> p, Predicate<Person> c) {
		for(Person temp : p) {
			if(c.test(temp))
				System.out.println(temp);
		}
	}
}

