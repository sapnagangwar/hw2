/**
 * What happens if we print a Rectangle object before setting any values inside of it?
 */
package hw2;

public class TestRectangle1 {
	public static void main(String args[]) {
		Rectangle floor;
		floor = new Rectangle(); // calls the default constructor
		System.out.println("Here is the floor:" + floor);
	}
}
