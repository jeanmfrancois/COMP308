/**
 * File Name: FullName.java<br>
 * Jean-francois Nepton<br>
 * COMP 308 Java for Programmers<br>
 * Cordinator: Dr. Xiaokun Zhang<br>
 * Student ID# 2358976<br>
 * Created: Sep 19, 2014
 */
package com.jfbuilds.tme1.program2;

/**
 * FullName class hold the contains of a person's title, first, midle, and last
 * name
 * <p>
 * All the fields are represented by strings as parts of the person's name
 * <p>
 * Methods exist for the COnstruction of a default full name as well as a
 * parameterized full name object as well as an override of the toString method
 * of the Object class to offer a readable representaion of the person's full
 * name
 *
 * @author Jean-francois Nepton
 * @version %I%, %G%
 * @since 1.0
 */
public class FullName {

	private String title;

	private String firstName;

	private String middleName;

	private String lastName;

	/**
	 * Default Constructor which creates John Doe
	 */
	public FullName() {
		title = "Mr.";
		firstName = "John";
		middleName = "Middle";
		lastName = "Doe";
	}

	/**
	 * Parameterized Constructor which takes a supplied name
	 */
	public FullName(String title, String firstName, String middleName, String lastName) {
		this.title = title;
		this.firstName = firstName;
		this.middleName = middleName;
		this.lastName = lastName;
	}

	/**
	 * Overriden implementation of the String value of a FullName object
	 * 
	 * @return readable representation string of person's full name details
	 */
	@Override
	public String toString() {
		return (title + " " + firstName + " " + middleName + " " + lastName);
	}
}
