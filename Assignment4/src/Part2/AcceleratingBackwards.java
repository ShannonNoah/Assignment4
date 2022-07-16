package Part2;

public class AcceleratingBackwards implements LunarRoverState{

	LunarRoverContext lunarRover;
	
	public AcceleratingBackwards(LunarRoverContext newLunarRover) {
		lunarRover = newLunarRover;
		
	}
	
	@Override
	public void lr() {
		System.out.println("Rover is at rest");
		lunarRover.setState(lunarRover.getAtRestState());
		
	}
	 

	@Override
	public void l1() {
		System.out.println("Rover cannot accelerate forward right now");
		
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
		System.out.println("Rover is already accelerating backwards");
		
	}
	
	public String toString() {
		return "Accelerating Backwards State";
	}
	
}
