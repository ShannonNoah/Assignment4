package Facade;


/**
 * Date: July 16 2022
 * Facade class used to make shapes.
 * @author Shannon
 *
 */
public class ShapeMaker {
	
	private Shape circle;
	private Shape rectangle;
	private Shape square;
	
	/**
	 * Constructor for ShapeMaker.
	 */
	public ShapeMaker() {
		circle = new Circle();
		rectangle = new Rectangle();
		square = new Square();
	}

	/**
	 * Method that draws a circle.
	 */
	public void drawCircle() {
		circle.draw();
	} 
	
	/**
	 * Method that draws a square.
	 */
	public void drawSquare() {
		square.draw();
	}
	
	/**
	 * Method that draws a rectangle.
	 */
	public void drawRectangle() {
		rectangle.draw();
	}
	
	
	
}

