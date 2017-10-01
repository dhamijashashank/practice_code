package com.krishna.java8;

public class Greeter {

	// Suppose you want to pass something in greet method at run time and want
	// that it will do operation based on your input
	// Then you want if else bolck or Switch case to handle this case but that
	// is not good programming

	// public void greet(){
	// System.out.println("Greeting ....");
	// }
	//
	// public static void main(String[] args) {
	// // TODO Auto-generated method stub
	// Greeter obj = new Greeter();
	// obj.greet();
	// }

	// Using Java 7 we can do programming like below

	public void greet(Greeting greeting) {
		greeting.perform();
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Greeter obj = new Greeter();
		HelloWordGreeting hellowordGreet = new HelloWordGreeting();
		obj.greet(hellowordGreet);
		
//		MyLambda greetingFunction = () -> System.out.println("Hare krishna");
		Greeting greetingFunction = () -> System.out.println("Hare krishna");
		
		// Using Inner class
		Greeting greeting = new Greeting(){
			public void perform() {
				System.out.println("Hare krishna");
			}
		};
	}
	
	// Explination for Video 8 "Lambda as interface type"
	// For this one interface is required like below 
	
//	interface MyLambda {
//		
//		public void foo();
//		
//	}
	
	// we can use it like  "MyLambda greetingFunction = () -> System.out.println("Hare krishna");"
	// as compiler got all required info from the interface like return type , Number of parameter .
	
	//No we want to write lambda expression which take two parameter and return sum of both.
	// So we will add one more method declaration in interface like 
	//public int add(int a , int b);
	// It will create compilation error in implementation of both lambda expression because compiler are not able to differenciate 
	// between both method , so it is mandatory that interface has only one method decleration in case of implementation of lambda expression. 
	
	// Instead of using new interface we can use Greeting interface also.
	
	//Explanation of video 9 Lambda Vs Interface Implementations
	
	//There are 3 ways to achieve it 
//		1. As line Number 29 "HelloWordGreeting hellowordGreet = new HelloWordGreeting();" here we are creating new class which implement interface
	//  	Using object of this class we call the required method
	
//		2. As line Number 33 "Greeting greetingFunction = () -> System.out.println("Hare krishna");" by using lanbda Expression.

//		3. By Anonymous inner class as done in line number 36 , if we call perform method then its own method is called.
	
	
}
