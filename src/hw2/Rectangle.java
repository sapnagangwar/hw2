/**
 * Defines a reusable class Rectangle. One object of class Rectangle stores
 * the height and width of a Rectangle.
 */
package hw2;

public class Rectangle {
	private int height; // height is a data member
	private int width; // width is a data member
	
	/*default constructor*/
	public Rectangle(){
		System.out.println("Inside the constructor");
		height=1;
		width=1;
	}
	/*constructor taking parameters-parameterized constructor to make a square*/
	public Rectangle(int side){
		System.out.println("Inside Rectangle (int)");
		height=side;
		width=side;
	}

	/*constructor taking parameters-parameterized constructor*/
	public Rectangle(int h,int w){
		System.out.println("Inside Rectangle (int,int)");
		height=h;
		width=w;
	}


	/**
	 * Sets the value for height to "newHeight".
	 */
	public void setHeight(int newHeight) { // newHeight is a parameter
		height = newHeight;
	}

	/**
	 * Sets the value for width to "newWidth".
	 */
	public void setWidth(int newWidth) { // newWidth is a parameter
		width = newWidth;
	}

	/**
	 * Returns the value of height.
	 */
	public int getHeight() {
		return height;
	}

	/**
	 * Returns the value of width.
	 */
	public int getWidth() {
		return width;
	}

	/**
	 * Returns a String containing the height and width of the Rectangle
	 */
	public String toString() {
		return "height = " + height + ", " + "width = " + width;
	}
	
	
	/**
	 * define drawRectangle();prints the rectangle in whatever symbolthe main() sends in
	 */
	public void drawRectangle(char symbol) {
		for (int j = 1; j <= this.height; j++) {
			for (int i = 1; i <= this.width; i++) {
				System.out.print(symbol);
			}
			System.out.println();
		}
	}
	/**
	 * define drawRectangle();prints the rectangle in *
	 */
	public void drawRectangle() {
	/*	for (int j = 1; j <= height; j++) {
			for (int i = 1; i <= width; i++) {
				System.out.print("*");
			}
			System.out.println();
		}
	}
	*/
		this.drawRectangle('*');//"this." is optional
	}

}

