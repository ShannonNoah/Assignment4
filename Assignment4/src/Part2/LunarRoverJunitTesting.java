package Part2;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

class LunarRoverJunitTesting {

	
	// When the left pedal was pressed once it accelerates the buggy forward.
	@Test
	void test1() {
		LunarRoverContext lunarRover = new LunarRoverContext();
		lunarRover.l1();
		String output = lunarRover.getState().toString();
		assertEquals(output, "Accelerating Forwards State");
	}
	
	//If accelerating forward and you press right pedal twice it deaccelerates.
	@Test
	void test2() {
		LunarRoverContext lunarRover = new LunarRoverContext();
		lunarRover.l1();
		lunarRover.r2();
		String output = lunarRover.getState().toString();
		assertEquals(output, "Deaccelerating State");
	}
	
	
	//To achieve constant forward speed press the right pedal for more than 5 seconds.
	@Test
	void test3() {
		LunarRoverContext lunarRover = new LunarRoverContext();
		lunarRover.l1();
		lunarRover.rm5();
		String output = lunarRover.getState().toString();
		assertEquals(output, "Constant Forward Speed State");
	}
	
	//If  the  buggy  is  at  rest  and  the  left  pedal  is  pressed  for  more  than  5  seconds,  it  will 
	//accelerate backwards.
	@Test
	void test4() {
		LunarRoverContext lunarRover = new LunarRoverContext();
		lunarRover.lm5();
		String output = lunarRover.getState().toString();
		assertEquals(output, "Accelerating Backwards State");
	}
	


}
