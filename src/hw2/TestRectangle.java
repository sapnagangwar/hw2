/**
 * Creates two objects of class Rectangle, setting values for their height and
 * width, and then printing those values to see that everything works for both
 * objects.
 */

package hw2;

import hw2.Rectangle;

public class TestRectangle {
	public static void main(String args[]) {
		Rectangle floor;
		floor = new Rectangle(); // constructs (allocates space for) an object
		System.out.println(floor);
		floor.setHeight(3);
		floor.setWidth(2);
		System.out.println("height should be 3: " + floor.getHeight());
		System.out.println("width should be 2: " + floor.getWidth());
		System.out.println("Here is the floor:" + floor.toString());
		floor.drawRectangle('+');//rectangle drawn in "+"
		
		Rectangle ceiling;
		ceiling = new Rectangle(); // constructs a second Rectangle object
		ceiling.setHeight(5);
		ceiling.setWidth(6);
		System.out.println("height should be 5: " + ceiling.getHeight());
		System.out.println("width should be 6: " + ceiling.getWidth());
		System.out.println("Here is the ceiling:" + ceiling.toString());
		ceiling.drawRectangle('*');
		Rectangle wall;
		wall=new Rectangle();//constructs(allocates space for) an object
		wall.setHeight(7);
		wall.setWidth(4);
		System.out.println("height should be 7: " + wall.getHeight());
		System.out.println("width should be 4: "+ wall.getWidth());
		System.out.println("Here is the wall: "+ wall.toString());
		wall.drawRectangle();//default when parameter is not defined-eg of method name overloading
		
		Rectangle wall1;
		wall1=new Rectangle(5);//expect 5 by 5 rectangle
		System.out.println(wall);
	}
}
