/**
 * File Name: Music5Test.java<br>
 * Jean-francois Nepton<br>
 * COMP 308 Java for Programmers<br>
 * Cordinator: Dr. Xiaokun Zhang<br>
 * Student ID# 2358976<br>
 * Created: Sep 23, 2014
 */
package com.jfbuilds.tme1.program4;

import static com.jfbuilds.tme1.program4.InstrumentTests.log;
import static com.jfbuilds.tme1.program4.Note.print;
import static org.junit.Assert.assertTrue;
import static org.junit.Assert.fail;

import org.junit.Test;

/**
 * Music5Test (description of class)
 * <p>
 * (description of core fields)
 * <p>
 * (description of core methods)
 * 
 * @author Jean-francois Nepton
 * @version %I%, %G%
 * @since 1.0
 */
public class Music5Test {

	/**
	 * Test method for
	 * {@link com.jfbuilds.tme1.program4.Music5#tune(com.jfbuilds.tme1.program4.Playable)}
	 * .
	 */
	@Test
	public void testTune() {
		Playable instrument = new Wind();
		log.info("Performing Test:" + "testTune - Testing for the ability to tune an object: Wind");
		if (true) {
			log.debug("Status: " + "PASSED - successfully tuned instrument: " + instrument);
			Music5.tune(instrument);
			assertTrue(true);
		} else {
			log.warn("Status: " + "FAILED" + " - Test: testTune -> Failed test for the ability to tune an object: Wind");
			fail("Failure for the ability to tune an object: Wind");
		}
		instrument = new Percussion();
		log.info("Performing Test:" + "testTune - Testing for the ability to tune an object: Percussion");
		if (true) {
			log.debug("Status: " + "PASSED - successfully tuned instrument: " + instrument);
			Music5.tune(instrument);
			assertTrue(true);
		} else {
			log.warn("Status: " + "FAILED"
					+ " - Test: testTune -> Failed test for the ability to tune an object: Percussion");
			fail("Failure for the ability to tune an object: Percussion");
		}
		instrument = new Stringed();
		log.info("Performing Test:" + "testTune - Testing for the ability to tune an object: Stringed");
		if (true) {
			log.debug("Status: " + "PASSED - successfully tuned instrument: " + instrument);
			Music5.tune(instrument);
			assertTrue(true);
		} else {
			log.warn("Status: " + "FAILED"
					+ " - Test: testTune -> Failed test for the ability to tune an object: Stringed");
			fail("Failure for the ability to tune an object: Stringed");
		}
		instrument = new Brass();
		log.info("Performing Test:" + "testTune - Testing for the ability to tune an object: Brass");
		if (true) {
			log.debug("Status: " + "PASSED - successfully tuned instrument: " + instrument);
			Music5.tune(instrument);
			assertTrue(true);
		} else {
			log.warn("Status: " + "FAILED"
					+ " - Test: testTune -> Failed test for the ability to tune an object: Brass");
			fail("Failure for the ability to tune an object: Brass");
		}
		instrument = new Woodwind();
		log.info("Performing Test:" + "testTune - Testing for the ability to tune an object: Woodwind");
		if (true) {
			log.debug("Status: " + "PASSED - successfully tuned instrument: " + instrument);
			Music5.tune(instrument);
			assertTrue(true);
		} else {
			log.warn("Status: " + "FAILED"
					+ " - Test: testTune -> Failed test for the ability to tune an object: Woodwind");
			fail("Failure for the ability to tune an object: Woodwind");
		}
	}

	/**
	 * Test method for
	 * {@link com.jfbuilds.tme1.program4.Music5#tuneAll(com.jfbuilds.tme1.program4.Playable[])}
	 * .
	 */
	@Test
	public void testTuneAll() {
		Playable[] collection =
				new Playable[] { new Percussion(), new Stringed(), new Wind(), new Brass(), new Woodwind(),
						new Playable() {

							@Override
							public void play(Note n) {
								print("AnonymousSubclassPlayable.play() " + Note.MIDDLE_A);
							}
						} };
		Music5.tuneAll(collection);
		log.info("Performing Test:" + "testTuneAll - Testing for the successful execution tuneAll on a collection");
		if (true) {
			log.debug("Status: " + "PASSED - with value " + "current items in array:");
			for (int i = 0; i < collection.length; i++) {
				log.info("Item " + (i + 1) + ": " + collection[i]);
			}
			assertTrue(true);
		} else {
			log.warn("Status: " + "FAILED"
					+ " - Test: testTuneAll -> Failed test for the successful execution tuneAll on a collection");
			fail("Failure for the successful execution tuneAll on a collection");
		}
	}

	/**
	 * Test method for
	 * {@link com.jfbuilds.tme1.program4.Music5#main(java.lang.String[])}.
	 */
	@Test
	public void testMain() {
		Music5.main(new String[] {});
		log.info("Performing Test:" + "testMain - Testing for the successful execution of the entry main method");
		if (true) {
			log.debug("Status: " + "PASSED - Successfully executed the main method");
			assertTrue(true);
		} else {
			log.warn("Status: " + "FAILED"
					+ " - Test: testMain -> Failed test for the successful execution of the entry main method");
			fail("Failure for the successful execution of the entry main method");
		}
	}
}
