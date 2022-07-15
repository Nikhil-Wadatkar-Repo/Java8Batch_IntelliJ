package com.aop.interfaces;

public class EmployeeImpl implements EmployeeInfo {

	@Override
	public String getEmployeeDesignation(int role) {
		String desg = "";
		// logic to get designation based on role
//		10 Doctor
//		11 Sweeper
//		12 Watchman
//		13 MR
		switch (role) {
		case 10:
			desg = "Doctor";
			break;
		case 11:
			desg = "Sweeper";
			break;
		case 12:
			desg = "Watchman";
			break;
		case 13:
			desg = "MR";
			break;

		default:
			desg = "Other";
			break;
		}

		return desg;
	}
}
