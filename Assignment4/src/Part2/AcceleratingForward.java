package Part2;

public class AcceleratingForward implements LunarRoverState {
	
	LunarRoverContext lunarRover;
	
	public AcceleratingForward(LunarRoverContext newLunarRover) {
		lunarRover = newLunarRover;
		
	}
	
	@Override
	public void lr() {
		System.out.println("Rover is at rest");
		lunarRover.setState(lunarRover.getAtRestState());
		
	} 

	@Override
	public void l1() {
		System.out.println("Rover is already accelerating forward");
		
	}

	@Override
	public void r2() {
		System.out.println("Rover is deaccelerating");
		lunarRover.setState(lunarRover.getDeacceleratingState());
		
	}

	@Override
	public void rm5() {
		System.out.println("Rover is achieving constant forward speed");
		lunarRover.setState(lunarRover.getConstantForwardSpeedState());
		
	}

	@Override
	public void lm5() {
		System.out.println("Rover cannot accelerate backwards right now");
		
	}
	
	public String toString() {
		return "Accelerating Forwards State";
	}
	
	

}
