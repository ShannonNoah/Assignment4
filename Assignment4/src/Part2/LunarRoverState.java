package Part2;

public interface LunarRoverState {
	
	/**
	 * Action where left and right pedal are pressed at same time.
	 */
	void lr();
	/**
	 * Action where left pedal is pressed once.
	 */
	void l1();
	/**
	 * Action where right pedal is pressed twice.
	 */
	void r2();
	/**
	 * Action where right pedal is pressed for more than 5 seconds.
	 */
	void rm5();
	/**
	 * Action where left pedal is pressed for more  than 5 seconds.
	 */
	void lm5();
	
}
