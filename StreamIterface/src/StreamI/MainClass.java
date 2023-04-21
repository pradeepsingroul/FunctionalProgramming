package StreamI;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;
import java.util.Optional;



public class MainClass {
	
	
	public static void main(String[] args) {
		
        List<Student> students = new ArrayList<>();
		
		students.add(new Student("mandeep", 1245, 852));
		students.add(new Student("Suresh", 1011, 960));
		students.add(new Student("nandu", 2584, 789));
		students.add(new Student("mahesh", 7777, 784));
		students.add(new Student("deepak", 4561, 584));
		
		
		//printing using stream and foreach
		students.stream().forEach(s -> System.out.println(s));
		
		
		//using lambda expression
		Optional<Student> s = students.stream().min((s1,s2) -> s1.getMarks()-s2.getMarks());
		System.out.println(s.get());
		
		
		//using annonymous class
		Optional<Student> opt = students.stream().max(new Comparator<Student>() {

			@Override
			public int compare(Student o1, Student o2) {
				// TODO Auto-generated method stub
				return o1.getName().compareTo(o2.getName());
			}
			
		});
		System.out.println(opt.get());
		
		boolean b = students.stream().anyMatch(st -> st.getMarks() > 960);
		System.out.println(b);
			
		
	}

}
