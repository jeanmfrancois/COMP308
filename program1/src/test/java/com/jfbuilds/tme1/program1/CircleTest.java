package com.jfbuilds.tme1.program1;

import org.apache.log4j.Logger;

import junit.framework.Test;
import junit.framework.TestCase;
import junit.framework.TestSuite;

/**
 * Unit test for simple App.
 */
public class CircleTest 
    extends TestCase
{
	private static final Logger log = Logger.getLogger(CircleTest.class);
	
    /**
     * Create the test case
     *
     * @param testName name of the test case
     */
    public CircleTest( String testName )
    {
        super( testName );
    }

    /**
     * @return the suite of tests being tested
     */
    public static Test suite()
    {
        return new TestSuite( CircleTest.class );
    }

    /**
     * Rigourous Test :-)
     */
    public void testCircle()
    {
    	log.info("Lets use the logger!");
    	
        assertTrue( true );
    }
}
