package lambda.impl.ex2;

import java.util.Arrays;
import java.util.Collections;
import java.util.List;
import java.util.function.Consumer;
import java.util.function.Predicate;
/*
 *  WE USE THE DEFAULT INTERFACES GIVEN BY JAVA AND REPLACE Condition by Predicate
 *  which is the equivalent and already exists in java 8 
 */
public class SolutionJava8FullLambda {
	public static void main(String[] args) {
		List<Person> myList = Arrays.asList(new Person("raouf", "gh", 25), 	
		new Person("yacine", "gh", 6), new Person("yassmine", "gh", 24),new Person("hassane", "gh",56));
	
		Collections.sort(myList, (a,b)-> a.getFirstname().compareTo(b.getFirstname()));

		DoStuff(myList, p->true , p -> System.out.println(p)); 

		DoStuff(myList,  p-> p.getFirstname().startsWith("yac"), p -> System.out.println(p));
	}

	private static void DoStuff(List<Person> list, Predicate<Person> p, Consumer<Person> c) {
		for(Person temp : list) { if(p.test(temp)) c.accept(temp);	}System.out.println();}
}

