/**
 * StepClimbers climb steeply rising mountains, one step across for every step of rise

* @author <Andre Purits>
* @version <...>
 * 
 */
import edu.fcps.karel2.Display;

public class StepClimber extends Climber {

	public StepClimber(int x) {
		super(x);
	}
	
	public void climbUpRight() {
		//TODO Climb one step up and one across
      turnLeft();
      move();
      turnRight();
      move();
	}
	
	public void climbUpLeft() {
		//TODO Climb one step up and one across
      turnRight();
      move();
      turnLeft();
      move();
	}
	
	public void climbDownRight() {
		//TODO Climb one step down and one across
      move();
      turnRight();
      move();
      turnLeft();
	}
	
	public void climbDownLeft() {
		//TODO Climb one step down and one across
      move();
      turnLeft();
      move();
      turnRight();
	}
}
