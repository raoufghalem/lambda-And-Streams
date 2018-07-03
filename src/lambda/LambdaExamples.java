package lambda;

/**  https://youtu.be/q5i_O4Uj_O8
  	 a way to pass a code to a method
 * 
 */

interface Executable{
	void execute();
}
interface ExecutableValue{
	int execute();
}
interface ExecutableValueParam{
	int execute(int a);
}
interface ExecutableValueParam2{
	int execute(int a, int b);
}
class someimplementation implements ExecutableValueParam{
	@Override
	public int execute(int a) {
		return a*a;
	}
	
}

/*
 * main class interface caller
 */
class Runner{
//	Executable
	public void run(Executable e) {
		System.out.println("executing block of code ");
		e.execute();
		System.out.println("example with return value ************************");
	}
//	ExecutableValue
	public void run(ExecutableValue ev) {
		int value = ev.execute() +1;
		System.out.println("returned value is : "+ value);
		System.out.println("example with return value + pass it a param************************");
	}
//	interface ExecutableValueParam
	public void run(ExecutableValueParam evp) {
		System.out.println("result value of 55 + a = 67 ==> "+ evp.execute(55));
	}
	
//	interface ExecutableValueParam
	public void run(ExecutableValueParam2 evp) {
		System.out.println("result value of 55 + a = 67 ==> "+ evp.execute(55 ,12));
	}
}

public class LambdaExamples {
	public static void main(String[] args) {
		Runner runner = new Runner();
		runner.run(new Executable() {
			public void execute() {
				System.out.println("hello there");
			}
		});
//		public void run(ExecutableValue ev)
		runner.run(() -> {return 5;});
		runner.run(() -> 4);
//		public void run(ExecutableValueParam evp)
		runner.run((a) -> {	return 12+a; });
//		public void run(ExecutableValueParam2 evp)		
		runner.run( (a ,b) -> {return 12 + a +  b;});
	}
}
