// : interfaces/music5/Music5.java
// Interfaces.
package com.jfbuilds.tme1.program4;

import static com.jfbuilds.tme1.program4.Note.print;

interface Instrument {

	// Compile-time constant:
	int VALUE = 5; // static & final

	// Cannot have method definitions:
	void adjust();
}

interface Playable {

	// Cannot have method definitions:
	void play(Note n); // Automatically public
}

class Wind implements Instrument, Playable {

	public void play(Note n) {
		print(this + ".play() " + n);
	}

	public String toString() {
		return "Wind";
	}

	public void adjust() {
		print(this + ".adjust()");
	}
}

class Percussion implements Instrument, Playable {

	public void play(Note n) {
		print(this + ".play() " + n);
	}

	public String toString() {
		return "Percussion";
	}

	public void adjust() {
		print(this + ".adjust()");
	}
}

class Stringed implements Instrument, Playable {

	public void play(Note n) {
		print(this + ".play() " + n);
	}

	public String toString() {
		return "Stringed";
	}

	public void adjust() {
		print(this + ".adjust()");
	}
}

class Brass extends Wind {

	public String toString() {
		return "Brass";
	}
}

class Woodwind extends Wind {

	public String toString() {
		return "Woodwind";
	}
}

public class Music5 {

	// Doesn't care about type, so new types
	// added to the system still work right:
	static void tune(Playable p) {
		// ...
		p.play(Note.MIDDLE_C);
	}

	static void tuneAll(Playable[] e) {
		for (Playable p : e)
			tune(p);
	}

	public static void main(String[] args) {
		// Upcasting during addition to the array:
		Playable[] orchestra = { new Wind(), new Percussion(), new Stringed(), new Brass(), new Woodwind() };
		tuneAll(orchestra);
	}
}

class Note {

	static final Note MIDDLE_C = new Note();

	@Override
	public String toString() {
		return "MIDDLE_C: ";
	}

	public static void print(String message) {
		System.out.println(message);
	}
}
/*
 * Output: Wind.play() MIDDLE_C Percussion.play() MIDDLE_C Stringed.play()
 * MIDDLE_C Brass.play() MIDDLE_C Woodwind.play() MIDDLE_C
 */// :~
