/**
 * HillClimbers move two steps across for each step of rise
 * 
* @author <Andre Purits>
* @version <...>
 * 
 */

import edu.fcps.karel2.Display;

public class HillClimber extends Climber {

	public HillClimber(int x) {
		super(x);
	}
	
	public void climbUpRight() {
   turnLeft();
   move();
   turnRight();
   move();
   move();
   }
	
	public void climbUpLeft() {
		//TODO Climb up one and across two
      turnRight();
      move();
      turnLeft();
      move();
      move();
	}
	
	public void climbDownRight() {
		//TODO Climb down one and across two 
      move();
      move();
      turnRight();
      move();
      turnLeft();
	}
	
	public void climbDownLeft() {
		//TODO Climb down one and across two
      move();
      move();
      turnLeft();
      move();
      turnRight();
	}
}
