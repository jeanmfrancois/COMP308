/**
 * File Name: FullName.java Jean-francois Nepton COMP 308 Java for Programmers
 * Cordinator: Dr. Xiaokun Zhang Student ID# 2358976 Created: Sep 19, 2014
 */
package com.jfbuilds.tme1.program2;

/**
 * FullName (description of class)
 * <p>
 * (description of core fields)
 * <p>
 * (description of core methods)
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

	/*
	 * Default Constructor which creates John Doe
	 */
	public FullName() {
		title = "Mr.";
		firstName = "John";
		middleName = "Middle";
		lastName = "Doe";
	}

	/*
	 * Parameterized Constructor which takes a supplied name
	 */
	public FullName(String title, String firstName, String middleName, String lastName) {
		this.title = title;
		this.firstName = firstName;
		this.middleName = middleName;
		this.lastName = lastName;
	}

	/*
	 * Overriden implementation of the String value of a FullName object
	 */
	@Override
	public String toString() {
		return (title + " " + firstName + " " + middleName + " " + lastName);
	}
}
