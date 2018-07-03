package lambda.impl.ex1;

import lambda.impl.ex1.TypeInferenceExample.TheLength;

public class TypeInferenceExample {
	
	public static void main(String[]  args) {
		
		TheLength mylength = s-> s.length(); 
		System.out.println(mylength.stringLength("hello there"));
		
		SomeTest s = new SomeTest();
		s.testMe(p-> p.length());

	}
	
	
	interface TheLength{
		int stringLength(String s);
	}

}
class SomeTest{
	public void testMe(TheLength lengh) {
		System.out.println(lengh.stringLength("some string fom the method"));
	}
}
