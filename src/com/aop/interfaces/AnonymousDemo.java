package com.aop.interfaces;

public class AnonymousDemo {
	public static void main(String[] args) {
		// implement interface using annonymous inner class
		EmployeeInfo empInfo = new EmployeeInfo() {

			@Override
			public String getEmployeeDesignation(int role) {
				String desg = "";
				// logic to get designation based on role
//				10 Doctor
//				11 Sweeper
//				12 Watchman
//				13 MR
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
		};

		EmployeeImpl impl = new EmployeeImpl();
		System.out.println(impl.getEmployeeDesignation(10)); // Doctor
		System.out.println(empInfo.getEmployeeDesignation(25)); // Other
	}
}
