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
	}
	
	// Now we are passing behaviour to greet method insted of passing direct value, this is classical example of OOP.

}
