/**
 * File Name: MailingAddress.java<br>
 * Jean-francois Nepton<br>
 * COMP 308 Java for Programmers<br>
 * Cordinator: Dr. Xiaokun Zhang<br>
 * Student ID# 2358976<br>
 * Created: Sep 19, 2014
 */
package com.jfbuilds.tme1.program2;

/**
 * MailingAddress class represents an address to be used in a shipping label.
 * <p>
 * Fields represents an address of up to two lines, a city, province, postal
 * code, and an Object of type FullName which represents a person's full name.
 * <p>
 * Methods include a default constructor which creates a default address with a
 * default FullName object of a person, John Doe. It also includes a
 * parameterized constructor and an overriden method of toString to offer a
 * textual representation of a mailing address.
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

	/**
	 * Default Constructor which creates John Doe in the Parliment of Canada.
	 */
	public MailingAddress() {
		contact = new FullName();
		addressLine1 = "111 Wellington Street";
		addressLine2 = "";
		city = "Ottawa";
		province = "Ontario";
		postalCode = "K1A 0A9";
	}

	/**
	 * Parameterized Constructor which takes a supplied name
	 * 
	 * @param contact
	 *            FullName object which represents a person.
	 * @param addressLine1
	 * @param addressLine2
	 *            Optional address line to be included in address
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

	/**
	 * Overriden implementation of the String value of a MailingAddress object
	 * 
	 * @return readable representation string of mailing address details
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
