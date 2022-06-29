package idh.java;

import java.util.Collection;
import java.util.LinkedList;
import java.util.function.Predicate;

class Student {
	public String getClasses() {
	 return null;	
	};
	
}

//class InThisClass implements Predicate<Student> {
//	
//	public boolean test(Student s) {
//		return s.getClasses().contains("Java2");
//	}
//}

public class PredicateDemo {
	public static void main(String[] args) {
		// Predicate<Student> p_inThisClass = new InThisClass();
		Predicate<Student> p_inThisClass = ( s -> s.getClasses().contains("Java2") );
		
		p_inThisClass.test(new Student());
		
		Collection<Student> coll = new LinkedList<Student>();
		
		coll.removeIf(s -> s.getClasses().contains("Java2"));
		
		
		
	}
}
