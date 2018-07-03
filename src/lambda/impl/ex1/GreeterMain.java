package lambda.impl.ex1;



public class GreeterMain {

	public void greet() {
		System.out.println("hello");
	}
	public void greeting(Greeting greeting) {
		greeting.perform();
	}

	
	public static void main(String[] args) {
		GreeterMain greet = new GreeterMain();
		
/*
 * here are the same outcome 
 * 1) we implement the Greeting interface then use a class to define it then call the method from a class
 * 2) we use lambda of type Greeting interface and pass it the  function/code
 * 3) we use inner class to implement Greeting and provide the implementation
 */
		ImplementGreeting imp = new ImplementGreeting();
		Greeting LambdaHolder = () -> System.out.println("hello using lambda");		
		Greeting innerClassImpl = new Greeting() {
			public void perform() {
				System.out.println("hello inner class impl");		
			}
		}; 
		
		
		imp.perform();
		LambdaHolder.perform();
		innerClassImpl.perform();
		
	}

}
