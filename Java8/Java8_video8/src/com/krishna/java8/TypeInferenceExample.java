package com.krishna.java8;

public class TypeInferenceExample {
	
	public static void main(String[] args) {
		// Way 1
//		GetStringLenLambda obj = (String str) -> str.length();
		GetStringLenLambda obj = ( str) -> str.length();
		System.out.println(obj.getStringLen("Testing String"));// output must be 14
		
		
		//Way 2
		
		printMethod(obj);
		
		//Way 3
		printMethod((str) -> str.length());
	}
	
	private static void printMethod(GetStringLenLambda obj){
		System.out.println(obj.getStringLen("In Static Method"));// Output 16
	}

	interface GetStringLenLambda
	{
		int getStringLen(String s);
	}


//	GetStringLenLambda obj = (String str) -> str.length(); and GetStringLenLambda obj = ( str) -> str.length(); both are same and perform same operation 
//	means there is no need to pass parameter type 
	
	
	
}