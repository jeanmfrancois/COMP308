/**
 *   File Name: CircleInterface.java
 *
 *   Jean-francois Nepton
 *   COMP 308 Java for Programmers
 *   Cordinator: Dr. Xiaokun Zhang
 *   Student ID# 2358976
 *   Created: Sep 18, 2014
 *   
 */
package com.jfbuilds.tme1.program1;

/**
 * Circle represents a simple shape of Euclidean geometry that is the 
 * set of all points in a plane that are at a given distance 
 * from a given point, the centre
 * <p>
 * Various methods are used to calculate derivated values for a circle
 * such as the circumference and area, to move the centre's location, and
 * to set the radius while checking it is within a range of values
 * 
 * @author      Jean-francois Nepton
 * @version     %I%, %G%
 * @since       1.0
 *
 */
public interface CircleInterface {
	
	/**
	 * Circumference of the circle
	 */
	public double circumference();
	
	/**
	 * Area of the circle
	 */
	public double area();
	
	/**
	 * Checks the radius against a maximum. 
	 * If the radius is greater than the maximum, resets it to the maximum 
	 * (using the ternary conditional operator)
	 * 
	 * @param r length of the center of a circle to it's edge to set
	 */
	public void setRadius(double r);
	
	/**
	 * Prints the coordinates, the radius, the circumference, and the area
	 * using log4j2 with info level logging 
	 */
	public void printAttributes();
	
	/**
	 * Checks if a point represented in the parameters falls inside the circle
	 * 
	 * @param x horizontal point coordinate
	 * @param y vertical point coordinate
	 */
	public boolean isInside(double x, double y);
	
	/**
	 * Moves the origin of the circle by a specified int type amount
	 * 
	 * @param x horizontal point coordinate
	 * @param y vertical point coordinate
	 */
	public void move(int x, int y);
	
	/**
	 * Moves the origin of the circle by a specified double type amount 
	 * 
	 * @param x horizontal point coordinate
	 * @param y vertical point coordinate
	 */
	public void move(double x, double y);
}
