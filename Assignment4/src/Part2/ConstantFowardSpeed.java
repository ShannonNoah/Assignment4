package Part2;

public class ConstantFowardSpeed implements LunarRoverState{

	LunarRoverContext lunarRover;
	
	public ConstantFowardSpeed(LunarRoverContext newLunarRover) {
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
		System.out.println("Rover cannot deaccelerate right now");
		
	}

	@Override
	public void rm5() {
		System.out.println("Rover is already accelerating forward");
		
	}

	@Override
	public void lm5() {
		System.out.println("Rover cannot accelerate backwards right now");
		
	}
	
	public String toString() {
		return "Constant Forward Speed State";
	}
}
