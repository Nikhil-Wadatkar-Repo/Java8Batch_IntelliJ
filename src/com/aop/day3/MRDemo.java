package com.aop.day3;

public class MRDemo {

	public static void main(String[] args) {
		// implement interface using lambda expression
		PersonInfo personInfo = (name) -> name.toUpperCase();

		//MR to non-static: object::instance_method_name

		// creating object of PersonDetails
		PersonDetails obj = new PersonDetails();
		// sending reference to instance method of class
		//PersonInfo personInfo = obj::getNameInBlockLetters;

		String nameInUppercase = personInfo.getNameInUppercase("nana");
		System.out.println("Name: " + nameInUppercase);

		// MR to static method : ClassName::static_Method_name;
		InfoDetails infoDetails = PersonDetails::getLengthOfString;
		int nameLength = infoDetails.getNameLength("Shivprasad");
		System.out.println("length: "+nameLength);
	}

}
