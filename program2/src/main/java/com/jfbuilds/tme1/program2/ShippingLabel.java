/**
 * File Name: ShippingLabel.java<br>
 * Jean-francois Nepton<br>
 * COMP 308 Java for Programmers<br>
 * Cordinator: Dr. Xiaokun Zhang<br>
 * Student ID# 2358976<br>
 * Created: Sep 19, 2014
 */
package com.jfbuilds.tme1.program2;

/**
 * ShippingLabel class provides a shipping label to be used for mailing of items
 * within Canada.
 * <p>
 * Fields include two MailingAddress objects representing the person and address
 * shipping from and to
 * <p>
 * Methods include a default constructor which creates two Mailling address
 * which contain a John Doe and a Jane Doe FullName objects within a
 * MailingAddress object with default shipping addresses. There is also an
 * overrriden toString method to offer readable shipping label information.
 * 
 * @author Jean-francois Nepton
 * @version %I%, %G%
 * @since 1.0
 */
public class ShippingLabel {

	/**
	 * Represnts the sender's information in a shipping label
	 */
	private MailingAddress shipFrom;

	/**
	 * Represnts the reciever's information in a shipping label
	 */
	private MailingAddress shipTo;

	/**
	 * Default constructor which creates a default shipping label for John Doe
	 * and Jane Doe with addresses of government builds in Ottawa and Toronto
	 * respectfully.
	 */
	ShippingLabel() {
		shipFrom = new MailingAddress();
		shipTo = shipFrom;
	}

	/**
	 * Parameterized constructor to offer the creation of a unique ShippingLabel
	 * object with unique fields.
	 * 
	 * @param shipFrom
	 *            MailingAddress object to represent the sender
	 * @param shipTo
	 *            MailingAddress object to represent the receiver
	 */
	ShippingLabel(MailingAddress shipFrom, MailingAddress shipTo) {
		this.shipFrom = shipFrom;
		this.shipTo = shipTo;
	}

	/**
	 * Entry point to test the creation of a Shipping label.
	 * 
	 * @param args
	 *            Not used by required to satisfy signature requirments.
	 */
	public static void main(String[] args) {
		ShippingLabel label =
				new ShippingLabel(new MailingAddress(), new MailingAddress(
						new FullName("Mrs.", "Jane", "Middle", "Doe"), "880 Bay Street Province",
						"Main Building, Room 203", "Toronto", "Ontario", "M7A 1A5"));
		System.out.println(label);
	}

	/**
	 * Overriden implementation of the String value of a ShippingLabel to offer
	 * readable information.
	 * 
	 * @return readable representation string of shipping label details
	 */
	@Override
	public String toString() {
		return "Ship From:\n" + shipFrom.toString() + "\nShip To:\n" + shipTo.toString();
	}
}
