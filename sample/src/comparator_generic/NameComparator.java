//NameComparator.java
//This class provides comparison logic based on the name. In such case, we are using the compareTo() method 
//of String class, which internally provides the comparison logic.

package comparator_generic;

import java.util.*;

class NameComparator implements Comparator<Student> {
	public int compare(Student s1, Student s2) {
		return s1.name.compareTo(s2.name);
	}
}