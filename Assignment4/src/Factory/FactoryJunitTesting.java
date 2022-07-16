package Factory;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

import Singleton.SingleObject;

class FactoryJunitTesting {

	@Test
	void test1() {
		
		ShapeFactory shapeFactory = new ShapeFactory();
		
		Shape shape = shapeFactory.getShape("CIRCLE");
		
		assertTrue(shape instanceof Circle);
	}

	@Test
	void test2() {
		
		ShapeFactory shapeFactory = new ShapeFactory();
		
		Shape shape = shapeFactory.getShape("RECTANGLE");
		
		assertTrue(shape instanceof Rectangle);
	}

	
	@Test
	void test3() {
		
		ShapeFactory shapeFactory = new ShapeFactory();
		
		Shape shape = shapeFactory.getShape("SQUARE");
		
		assertTrue(shape instanceof Square);
	}

}
