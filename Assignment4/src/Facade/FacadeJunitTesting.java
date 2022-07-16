package Facade;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

import Singleton.SingleObject;

class FacadeJunitTesting {

	@Test
	void test1() {
		
		Circle circle = new Circle();
		assertTrue(circle instanceof Shape);
		
	}

	@Test
	void test2() {
		
		Rectangle rectangle = new Rectangle();
		assertTrue(rectangle instanceof Shape);
		
	}
	
	@Test
	void test3() {
		
		Square square = new Square();
		assertTrue(square instanceof Shape);
		
	}
}
