/**
 * File Name: MailingAddress.java Jean-francois Nepton COMP 308 Java for
 * Programmers Cordinator: Dr. Xiaokun Zhang Student ID# 2358976 Created: Sep
 * 19, 2014
 */
package com.jfbuilds.tme1.program2;

/**
 * MailingAddress (description of class)
 * <p>
 * (description of core fields)
 * <p>
 * (description of core methods)
 * 
 * @author Jean-francois Nepton
 * @version %I%, %G%
 * @since 1.0
 */
public class MailingAddress {

	private FullName contact;

	private String addressLine1;

	private String addressLine2;

	private String city;

	private String province;

	private String postalCode;

	/*
	 * Default Constructor which creates John Doe in the Parliment
	 */
	public MailingAddress() {
		contact = new FullName();
		addressLine1 = "111 Wellington Street";
		addressLine2 = "";
		city = "Ottawa";
		province = "Ontario";
		postalCode = "K1A 0A9";
	}

	/*
	 * Parameterized Constructor which takes a supplied name
	 * @param contact
	 * @param addressLine1
	 * @param addressLine2
	 * @param city
	 * @param province
	 * @param postalCode
	 */
	public MailingAddress(FullName contact, String addressLine1, String addressLine2, String city, String province,
			String postalCode) {
		this.contact = contact;
		this.addressLine1 = addressLine1;
		this.addressLine2 = addressLine2;
		this.city = city;
		this.province = province;
		this.postalCode = postalCode;
	}

	/*
	 * Overriden implementation of the String value of a MailingAddress object
	 */
	@Override
	public String toString() {
		String address;
		if (addressLine2 == "") {
			address = addressLine1;
		} else {
			address = addressLine1 + "\n" + addressLine2;
		}
		return contact.toString() + "\n" + address + "\n" + city + ", " + province + " " + postalCode + "\n";
	}
}
