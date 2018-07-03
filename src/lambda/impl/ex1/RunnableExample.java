package lambda.impl.ex1;

public class RunnableExample {

	
	public static void main(String[] args) {
		
		Thread runnable = new Thread(new Runnable() {
			public void run() {
				System.out.println("i am running inside an inner class");
			}
		});
		runnable.run();
		
		Runnable iRun = () -> System.out.println("hey i am a lamba runnable");
		iRun.run();
		
		Thread iThread = new Thread(() -> System.out.println("hey i am a lamba runnable for Thread"));
		iThread.run();
	}
}
