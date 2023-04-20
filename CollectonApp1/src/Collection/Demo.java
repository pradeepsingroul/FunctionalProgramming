package Collection;

import java.util.TreeSet;

public class Demo {
	
	public static void main(String[] args) {
		TreeSet<Integer> trset = new TreeSet<>();
		
		trset.add(80);
		trset.add(20);
		trset.add(30);
		trset.add(40);
		trset.add(50);
		trset.add(60);
		
		System.out.println(trset);
		
		TreeSet<String> trSetString = new TreeSet<>();
		
		trSetString.add("seaven");
		trSetString.add("two");
		trSetString.add("three");
		trSetString.add("four");
		trSetString.add("a");
		
		System.out.println(trSetString);
		
		
	}

}
