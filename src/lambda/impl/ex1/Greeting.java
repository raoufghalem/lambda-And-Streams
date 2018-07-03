package lambda.impl.ex1;


// we use the annotation to enforce that it stays functional interface
@FunctionalInterface
interface Greeting {
	public void perform();
}