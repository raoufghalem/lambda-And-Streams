package lambda.exceptionHandling;

import java.util.function.BiConsumer;

public class ExceptionHandling {
	
	public static void main(String[] args) {
		int [] array = {1,2,3,4,5};
		int key =2;
		process(array, key, (a,b)-> System.out.println(a*b));
		
	}
	
	
	
	private static void process(int [] array, int key ,BiConsumer<Integer, Integer> bc) {
		for(int tmp : array) {
			bc.accept(tmp, key);
		}
	}

}
