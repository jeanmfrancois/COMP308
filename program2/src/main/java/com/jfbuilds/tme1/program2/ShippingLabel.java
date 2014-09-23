/**
 * File Name: ShippingLabel.java Jean-francois Nepton COMP 308 Java for
 * Programmers Cordinator: Dr. Xiaokun Zhang Student ID# 2358976 Created: Sep
 * 19, 2014
 */
package com.jfbuilds.tme1.program2;

/**
 * ShippingLabel (description of class)
 * <p>
 * (description of core fields)
 * <p>
 * (description of core methods)
 * 
 * @author Jean-francois Nepton
 * @version %I%, %G%
 * @since 1.0
 */
public class ShippingLabel {

	private MailingAddress shipFrom;

	private MailingAddress shipTo;

	ShippingLabel() {
		shipFrom = new MailingAddress();
		shipTo = shipFrom;
	}

	ShippingLabel(MailingAddress shipFrom, MailingAddress shipTo) {
		this.shipFrom = shipFrom;
		this.shipTo = shipTo;
	}

	public static void main(String[] args) {
		ShippingLabel label =
				new ShippingLabel(new MailingAddress(), new MailingAddress(
						new FullName("Mrs.", "Jane", "Middle", "Doe"), "880 Bay Street Province",
						"Main Building, Room 203", "Toronto", "Ontario", "M7A 1A5"));
		System.out.println(label);
	}

	@Override
	public String toString() {
		return "Ship From:\n" + shipFrom.toString() + "\nShip To:\n" + shipTo.toString();
	}
}
