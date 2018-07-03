import java.util.stream.Stream;

public class SomeRandomTest extends Thread implements Runnable {
	public static void main(String[] args) {
		Sometest target = () -> {System.out.println("i am a lambda function");};

//		BiConsumer<Integer, Integer> test2 = ( a, b) -> { System.out.println(a*b);};
//		test2.accept(5,6);

		
		boolean integer = Stream.of(25,1,2,3,4,5,6)
		.sorted().allMatch(a -> a.intValue() < 26 );
		System.out.println(integer);
	}
	

	
}

interface Sometest{
	void holla();
}
interface SomeaOperation<U, T, A>{
	A doSomething(T a, U b);
}