package Factory;
/** 
 * Date: July 16 2022
 * Factory class Shape.
 * @author Shannon
 *
 */
public class ShapeFactory {
	
	/**
	 * Method that returns the shape specified.
	 * @param shapeType specifies the shape to be returned
	 * @return Shape returns the shape specified
	 */
	public Shape getShape(String shapeType) {
		if(shapeType == null) {
			return null;
		}
		
		if(shapeType.equalsIgnoreCase("CIRCLE")) {
			return new Circle();
		}
		
		if(shapeType.equalsIgnoreCase("SQUARE")) {
			return new Square();
		}
		
		if(shapeType.equalsIgnoreCase("RECTANGLE")) {
			return new Rectangle();
		}
		
		return null;
	}

}
