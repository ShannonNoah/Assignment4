package Facade;


/**
 * Date: July 16 2022
 * Demo to draw various shapes.
 * @author Shannon
 *
 */
public class FacadePatternDemo {
	
	public static void main(String[] args) {
		
		ShapeMaker shapeMaker = new ShapeMaker();
		 
		shapeMaker.drawCircle();
		shapeMaker.drawRectangle();
		shapeMaker.drawSquare();
		
	}

}

