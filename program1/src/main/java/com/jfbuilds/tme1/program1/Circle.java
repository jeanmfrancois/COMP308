/**
 * File Name: Circle.java<br>
 * Jean-francois Nepton<br>
 * COMP 308 Java for Programmers<br>
 * Cordinator: Dr. Xiaokun Zhang<br>
 * Student ID# 2358976<br>
 * Created: Sep 16, 2014
 */
package com.jfbuilds.tme1.program1;

/**
 * Circle represents a simple shape of Euclidean geometry that is the set of all
 * points in a plane that are at a given distance from a given point, the centre
 * <p>
 * Double typed fields are used to hold values such as the radius and the
 * circle's center location on a plane
 * <p>
 * Various methods are used to calculate derivated values for a circle such as
 * the circumference and area, to move the centre's location, and to set the
 * radius while checking it is within a range of values
 * 
 * @author Jean-francois Nepton
 * @version %I%, %G%
 * @since 1.0
 */
public class Circle implements CircleInterface {

	/**
	 * Maximum radius allowed
	 */
	static final double MAX_RADIUS = 50;

	/**
	 * Horizontal coordinate
	 */
	double x = 0;

	/**
	 * Vertical coordinate
	 */
	double y = 0;

	/**
	 * Radius of circle
	 */
	double r;

	/**
	 * Default Constructor
	 */
	public Circle() {
		move(10, -10);
		setRadius(8);
	}

	/**
	 * Constructor with specific values defined for the circle
	 */
	public Circle(double x, double y, double r) {
		move(x, y);
		setRadius(r);
	}

	/**
	 * @see com.jfbuilds.tme1.program1.CircleInterface#circumference()
	 */
	@Override
	public double circumference() {
		double diameter = 2 * r;
		double circumference = Math.PI * diameter;
		return circumference;
	}

	/**
	 * @see com.jfbuilds.tme1.program1.CircleInterface#area()
	 */
	@Override
	public double area() {
		double area = (Math.PI * (r * r));
		return area;
	}

	/**
	 * @see com.jfbuilds.tme1.program1.CircleInterface#setRadius(double)
	 */
	@Override
	public void setRadius(double r) {
		this.r = r < MAX_RADIUS ? r : MAX_RADIUS;
	}

	/**
	 * @see com.jfbuilds.tme1.program1.CircleInterface#printAttributes()
	 */
	@Override
	public void printAttributes() {
		System.out.println(getAttributes());
	}

	/**
	 * @see com.jfbuilds.tme1.program1.CircleInterface#isInside(double, double)
	 */
	@Override
	public boolean isInside(double x, double y) {
		if ((((x - this.x) * (x - this.x)) + ((y - this.y) * (y - this.y))) < r * r)
			return true;
		else
			return false;
	}

	/**
	 * @see com.jfbuilds.tme1.program1.CircleInterface#move(int, int)
	 */
	@Override
	public void move(int x, int y) {
		this.x += x;
		this.y += y;
	}

	/**
	 * @see com.jfbuilds.tme1.program1.CircleInterface#move(double, double)
	 */
	@Override
	public void move(double x, double y) {
		this.x += x;
		this.y += y;
	}

	/**
	 * @see com.jfbuilds.tme1.program1.CircleInterface#getAttributes()
	 */
	@Override
	public String getAttributes() {
		String message =
				"Coordinates:(" + this.x + ", " + this.y + ")\n" + "Radius:" + Math.round(this.r) + "\n"
						+ "Circumference:" + ((double) Math.round(circumference() * 100) / 100) + "\n" + "Area:"
						+ ((double) Math.round(area() * 100) / 100);
		return message;
	}

	/**
	 * Main method to offer generic execution
	 * 
	 * @param args
	 *            No parameters are currently supported.
	 */
	public static void main(String[] args) {
		System.out.println("Hello Circle!\n" + new Circle().getAttributes());
		new Circle(56d, 398d, 42d).printAttributes();
	}
}
