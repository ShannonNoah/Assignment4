package Part2;

public class Deaccelerating implements LunarRoverState{
	
	LunarRoverContext lunarRover;
	
	public Deaccelerating(LunarRoverContext newLunarRover) {
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
		System.out.println("Rover is already deaccelerating");
		
	}

	@Override
	public void rm5() {
		System.out.println("Rover cannot acheive constant forward speed right now");
		
	}

	@Override
	public void lm5() {
		System.out.println("Rover cannot accelerate backwards right now");
		
	}
	
	public String toString() {
		return "Deaccelerating State";
	}


}
