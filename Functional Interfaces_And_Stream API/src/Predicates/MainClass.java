package Predicates;

import java.util.function.Predicate;

public class MainClass {
	
	public static void main(String[] args) {
		
//		predicate is a onekind of functional interface that contains one abstract methos that is test();
//		using implemntaion class
		MyPredicate my = new MyPredicate();
		System.out.println(my.test(2));
		
		
//		using annonymous class
		Predicate<Integer> pred = new Predicate<Integer>() {

			@Override
			public boolean test(Integer t) {
				// TODO Auto-generated method stub
				return t > 10;
			}
			
			
		};
		System.out.println(pred.test(15));
		
		
//		using lambda expression
		Predicate<Integer> lambdaPred = n ->{
			return n > 12;
		};
		System.out.println(lambdaPred.test(15));
		
		
	}

}
