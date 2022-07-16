package Part2;

public class AtRest implements LunarRoverState{
	
	LunarRoverContext lunarRover;
	
	public AtRest(LunarRoverContext newLunarRover) {
		lunarRover = newLunarRover;
		
	}

	@Override
	public void lr() {
		System.out.println("Rover is already at rest");
		
	} 

	@Override
	public void l1() {
		System.out.println("Rover is accelerating forward");
		lunarRover.setState(lunarRover.getAcceleratingForwardsState());
		
	}

	@Override
	public void r2() {
		System.out.println("Rover cannot deaccelerate right now");
		
	}

	@Override
	public void rm5() {
		System.out.println("Rover cannot achieve constant forward speed right now");
		
	}

	@Override
	public void lm5() {
		System.out.println("Rover is accelerating backwards");
		lunarRover.setState(lunarRover.getAcceleratingBackwardsState());
		
	}
	
	public String toString() {
		return "Rest State"; 
	}

}
