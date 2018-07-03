package lambda.exceptionHandling;

public class ClosureExample {

	public static void main(String[] args) {
		int a = 20;
		int b = 40;
		int i = 30;int ii = 30;
		doProcess(a , p-> System.out.println(p+i));
	}
	public static void doProcess(int i, Process p) {
		p.process(i);
	}

}




interface Process{
	void process(int i);
}
