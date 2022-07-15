package com.aop.diamondProblem;

public class TestClass implements Interface1, Interface2 {

	@Override
	public String getName() {
		if (true)
			return null;
		else
			return "";
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}

}
