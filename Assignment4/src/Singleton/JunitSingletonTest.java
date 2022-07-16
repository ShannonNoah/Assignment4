package Singleton;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

class JunitSingletonTest {

	@Test
	public void test() {
		SingleObject object = SingleObject.getInstance(); 
		assertTrue(object instanceof SingleObject);
		
	}

}
