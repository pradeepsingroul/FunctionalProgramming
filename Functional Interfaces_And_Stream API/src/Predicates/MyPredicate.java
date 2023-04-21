package Predicates;

import java.util.function.Predicate;

public class MyPredicate implements Predicate<Integer>{

	@Override
	public boolean test(Integer t) {
		// TODO Auto-generated method stub
		return t > 10;
	}

}
