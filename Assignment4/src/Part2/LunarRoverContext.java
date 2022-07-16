package Part2;

public class LunarRoverContext {
	
	LunarRoverState acceleratingBackwards;
	LunarRoverState acceleratingForwards;
	LunarRoverState atRest;
	LunarRoverState constantForwardSpeed;
	LunarRoverState deaccelerating;

	
	private LunarRoverState state;
	
	
	public LunarRoverContext(){ 
		acceleratingBackwards = new AcceleratingBackwards(this);
		acceleratingForwards = new AcceleratingForward(this);
		atRest = new AtRest(this);
		constantForwardSpeed = new ConstantFowardSpeed(this);
		deaccelerating = new Deaccelerating(this);
		
		state = atRest;
		
	}
	
	public void setState(LunarRoverState state) {
		this.state = state;
	}
	
	public LunarRoverState getAtRestState() {
		return atRest;
	}
	
	public LunarRoverState getState() {
		return state;
	}
	
	public void displayState() {
		System.out.println(state);
	}

	
	public LunarRoverState getAcceleratingBackwardsState() {
		return acceleratingBackwards;
	}
	
	public LunarRoverState getAcceleratingForwardsState() {
		return acceleratingForwards;
	}
	
	public LunarRoverState getConstantForwardSpeedState() {
		return constantForwardSpeed;
	}
	public LunarRoverState getDeacceleratingState() {
		return deaccelerating;
	}
	
	public void lr() {
		state.lr();
	}

	public void l1() {
		state.l1();
		
	}

	public void r2() {
		state.r2();
	}

	public void rm5() {
		state.rm5();
	}

	public void lm5() {
		state.lm5();
		
	}
	
}
