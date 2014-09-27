// : interfaces/music5/Music5.java
// Interfaces.
/**
 * File Name: Music5.java<br>
 * Jean-francois Nepton<br>
 * COMP 308 Java for Programmers<br>
 * Cordinator: Dr. Xiaokun Zhang<br>
 * Student ID# 2358976<br>
 * Created: Sep 23, 2014<br>
 * Reference: Music5.java Extended Exercise
 */
package com.jfbuilds.tme1.program4;

import static com.jfbuilds.tme1.program4.Note.print;

/**
 * Instrument class represents an instrument object
 * <p>
 * Field {@code VALUE} represents a constant value for the instrument, 5
 * <p>
 * Method adjust() should not have method definitions
 * 
 * @author Jean-francois Nepton
 * @version %I%, %G%
 * @since 1.0
 */
interface Instrument {

	// Compile-time constant:
	int VALUE = 5; // static & final

	// Cannot have method definitions:
	void adjust();
}

/**
 * Playable interface represents a playable object
 * <p>
 * Method play is used to execute code for a Playable object
 * 
 * @author Jean-francois Nepton
 * @version %I%, %G%
 * @since 1.0
 */
interface Playable {

	// Cannot have method definitions:
	/**
	 * Used by a Playable object to execute code in order to represent playing
	 * the Playable object
	 * 
	 * @param n
	 *            represents a music {@code Note}
	 */
	void play(Note n); // Automatically public
}

/**
 * Wind class represents objects that can be both an Instrument and is Playable
 * <p>
 * Method play adhere's to the Playable interface while toString offers a
 * readable representation of the object
 * 
 * @author Jean-francois Nepton
 * @version %I%, %G%
 * @since 1.0
 */
class Wind implements Instrument, Playable {

	/**
	 * @see com.jfbuilds.tme1.program4.Playable#play(com.jfbuilds.tme1.program4.Note)
	 */
	@Override
	public void play(Note n) {
		print(this + ".play() " + n);
	}

	/**
	 * Offers a readable representation of the object
	 * 
	 * @return a representation of the object's type: Wind
	 */
	@Override
	public String toString() {
		return "Wind";
	}

	/**
	 * @see com.jfbuilds.tme1.program4.Instrument#adjust()
	 */
	@Override
	public void adjust() {
		print(this + ".adjust()");
	}
}

/**
 * Percussion class represents objects that can be both an Instrument and is
 * Playable
 * <p>
 * Method play adhere's to the Playable interface while toString offers a
 * readable representation of the object
 * 
 * @author Jean-francois Nepton
 * @version %I%, %G%
 * @since 1.0
 */
class Percussion implements Instrument, Playable {

	/**
	 * @see com.jfbuilds.tme1.program4.Playable#play(com.jfbuilds.tme1.program4.Note)
	 */
	@Override
	public void play(Note n) {
		print(this + ".play() " + n);
	}

	/**
	 * Offers a readable representation of the object
	 * 
	 * @return a representation of the object's type: Percussion
	 */
	@Override
	public String toString() {
		return "Percussion";
	}

	/**
	 * @see com.jfbuilds.tme1.program4.Instrument#adjust()
	 */
	@Override
	public void adjust() {
		print(this + ".adjust()");
	}
}

/**
 * Stringed class represents objects that can be both an Instrument and is
 * Playable
 * <p>
 * Method play adhere's to the Playable interface while toString offers a
 * readable representation of the object
 * 
 * @author Jean-francois Nepton
 * @version %I%, %G%
 * @since 1.0
 */
class Stringed implements Instrument, Playable {

	/**
	 * @see com.jfbuilds.tme1.program4.Playable#play(com.jfbuilds.tme1.program4.Note)
	 */
	@Override
	public void play(Note n) {
		print(this + ".play() " + n);
	}

	/**
	 * Offers a readable representation of the object
	 * 
	 * @return a representation of the object's type: Stringed
	 */
	@Override
	public String toString() {
		return "Stringed";
	}

	/**
	 * @see com.jfbuilds.tme1.program4.Instrument#adjust()
	 */
	@Override
	public void adjust() {
		print(this + ".adjust()");
	}
}

/**
 * Brass class represents objects which belong to the Wind type which are both
 * an Instrument and Playable
 * 
 * @author Jean-francois Nepton
 * @version %I%, %G%
 * @since 1.0
 */
class Brass extends Wind {

	/**
	 * Offers a readable representation of the object
	 * 
	 * @return a representation of the object's type: Brass
	 */
	@Override
	public String toString() {
		return "Brass";
	}
}

/**
 * Woodwind class represents objects which belong to the Wind type which are
 * both an Instrument and Playable
 * 
 * @author Jean-francois Nepton
 * @version %I%, %G%
 * @since 1.0
 */
class Woodwind extends Wind {

	/**
	 * Offers a readable representation of the object
	 * 
	 * @return a representation of the object's type: Woodwind
	 */
	@Override
	public String toString() {
		return "Woodwind";
	}
}

/**
 * Music5 class, which is the core part of the class offers the ability to
 * adjust Instruments and tune/ play Playable objects
 * <p>
 * Method tune, which is static, offers the ability to play an object of type
 * Playable. It also has a companion method tuneAll, which can be used to play a
 * collection of Playable objects. This class's core main method acts as the
 * entry point in testing this application.
 * 
 * @author Jean-francois Nepton
 * @version %I%, %G%
 * @since 1.0
 */
public class Music5 {

	// Doesn't care about type, so new types
	// added to the system still work right:
	/**
	 * Method which represents tuning a Playable object
	 * 
	 * @param p
	 *            A Playable object which will be passed to be tuned
	 */
	static void tune(Playable p) {
		// ...
		p.play(Note.MIDDLE_C);
	}

	/**
	 * Method which is a companion to the tuning method for collection of
	 * Playable objects.
	 * 
	 * @param p
	 *            A Playable object which will be passed to be tuned
	 */
	static void tuneAll(Playable[] e) {
		for (Playable p : e)
			tune(p);
	}

	/**
	 * Main entry point of application to execute general testing of classes and
	 * implementation/ inheritance heirarchy.
	 * 
	 * @param args
	 *            Used only to conform to signature of main method.
	 */
	public static void main(String[] args) {
		// Upcasting during addition to the array:
		Playable[] orchestra = { new Wind(), new Percussion(), new Stringed(), new Brass(), new Woodwind() };
		tuneAll(orchestra);
	}
}

/**
 * Note enum was created to allow application to operate independently from book
 * examples and provide an implementation of a Note.
 * <p>
 * (description of core fields)
 * <p>
 * (description of core methods)
 * 
 * @author Jean-francois Nepton
 * @version %I%, %G%
 * @since 1.0
 */
enum Note {
	MIDDLE_A("MIDDLE_A"), MIDDLE_B("MIDDLE_B"), MIDDLE_C("MIDDLE_C"), MIDDLE_D("MIDDLE_D");

	/**
	 * The contents to be returned when a note is played
	 */
	private String note;

	/**
	 * Construction of a Note
	 * 
	 * @param note
	 */
	Note(String note) {
		this.note = note;
	}

	/**
	 * Offers a readable representation of the object
	 * 
	 * @return a representation of the Note "MIDDLE_C"
	 */
	@Override
	public String toString() {
		return note;
	}

	/**
	 * Used to simulate print method offered with sample demo application.
	 * 
	 * @param message
	 *            Content to be printed to the console.
	 */
	public static void print(String message) {
		System.out.println(message);
	}
}
