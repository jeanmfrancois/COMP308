/**
 *   File Name: Circle.java
 *
 *   Jean-francois Nepton
 *   COMP 308 Java for Programmers
 *   Cordinator: Dr. Xiaokun Zhang
 *   Student ID# 2358976
 *   Created: Sep 16, 2014
 *   
 */
package com.jfbuilds.tme1.program1;

/**
 * Circle represents a simple shape of Euclidean geometry that is the 
 * set of all points in a plane that are at a given distance 
 * from a given point, the centre
 * <p>
 * Double typed fields are used to hold values such as the radius and the
 * circle's center location on a plane
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
public class Circle implements CircleInterface {
	
	/**
	 * Maximum radius allowed
	 */
	static final double MAX_RADIUS = 50;
	
	/**
	 * Horizontal coordinate
	 */
	private double x = 0;
	
	/**
	 * Vertical coordinate
	 */
	private double y = 0;

	/**
	 * Radius of circle
	 */
	private double r;
	

	/**
	 * Default Constructor
	 */
	public Circle() {
		//CircleTests.log.info("Created a Circle");
		move(10,10);
		setRadius(5);
	}
	
	/**
	 * Constructor with specific values defined for the circle
	 */
	public Circle(double x, double y, double r) {
		move(x,y);
		setRadius(r);
	}
	
	/* (non-Javadoc)
	 * @see com.jfbuilds.tme1.program1.CircleInterface#circumference()
	 */
	public double circumference() {
		double diameter = 2 * r;
		double circumference = Math.PI * diameter;
		return circumference;
	}

	/* (non-Javadoc)
	 * @see com.jfbuilds.tme1.program1.CircleInterface#area()
	 */
	public double area() {
		double area = (Math.PI * Math.sqrt(r));
		return area;
	}

	/* (non-Javadoc)
	 * @see com.jfbuilds.tme1.program1.CircleInterface#setRadius(double)
	 */
	public void setRadius(double r) {
		this.r = r < MAX_RADIUS ?  r : MAX_RADIUS;
	}

	/* (non-Javadoc)
	 * @see com.jfbuilds.tme1.program1.CircleInterface#printAttributes()
	 */
	public void printAttributes() {
		System.out.println("Coordinates:(" + this.x + ", " + this.y + ")");
		System.out.println("Radius:" + this.r);
		System.out.println("Circumference:" + circumference());
		System.out.println("Area:" + area());
	}

	/* (non-Javadoc)
	 * @see com.jfbuilds.tme1.program1.CircleInterface#isInside(double, double)
	 */
	public boolean isInside(double x, double y) {
		if ((Math.sqrt(x - this.x) + Math.sqrt(y - this.y)) < Math.sqrt(r))
			return true;
		else 
			return false;
	}

	/* (non-Javadoc)
	 * @see com.jfbuilds.tme1.program1.CircleInterface#move(int, int)
	 */
	public void move(int x, int y) {
		this.x = x;
		this.y = y;		
	}
	
	/* (non-Javadoc)
	 * @see com.jfbuilds.tme1.program1.CircleInterface#move(double, double)
	 */
	public void move(double x, double y) {
		this.x = x;
		this.y = y;
	}
}
