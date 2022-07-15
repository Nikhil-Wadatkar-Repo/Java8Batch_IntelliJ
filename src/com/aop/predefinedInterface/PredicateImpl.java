package com.aop.predefinedInterface;

import java.util.function.Predicate;

public class PredicateImpl implements Predicate<String> {

	@Override
	public boolean test(String name) {
		if (name.length() > 5)
			return true;
		else
			return false;
	}

}
