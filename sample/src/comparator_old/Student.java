package comparator_old;
//Java Comparator Example (Non-generic Old Style)
//
//Let's see the example of sorting the elements of List on the basis of age and name. In this example, we have created 4 java classes:
//
//Student.java
//AgeComparator.java
//NameComparator.java
//Simple.java
//Student.java
//This class contains three fields rollno, name and age and a parameterized constructor.

class Student {
	int rollno;
	String name;
	int age;

	Student(int rollno, String name, int age) {
		this.rollno = rollno;
		this.name = name;
		this.age = age;
	}
}