package lambda;

import java.util.stream.IntStream;
import java.util.stream.Stream;
// https://youtu.be/t1-YZ6bF-g0
public class SomeStreams {
	
	public static void main(String[] args) {
		
		IntStream.range(1, 10).forEach(System.out::print);
		System.out.println(" :: print all the elements from the Steam");
		IntStream.range(1, 10).skip(5).forEach(System.out::print);
		System.out.println(" ::skip the first 5 elements");
		System.out.println(IntStream.range(1, 5).sum()+ " :: The sum of the stream");
		// Stream of Strings
		Stream.of("Ava","Aneri","Alberto","Almani").sorted().findFirst().ifPresent(System.out::print);
		System.out.println(" :: sort the strem , then find first element if present");
		
		
		
		
		
		
		
	}

}
