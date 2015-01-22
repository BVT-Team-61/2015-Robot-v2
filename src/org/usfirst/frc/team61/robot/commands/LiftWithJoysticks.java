package org.usfirst.frc.team61.robot.commands;

/**
 * Lift using the the jElev speed.
 * @author Team-61
 */
public class LiftWithJoysticks extends CommandBase {

	public LiftWithJoysticks(){
		requires(lift);
	}
	
	protected void end() {

	}

	protected void execute() {
		lift.moveElev(oi.getElevSpeed());
	}

	protected void initialize() {
		System.out.println("Lifting");
	}

	protected void interrupted() {

	}

	protected boolean isFinished() {
		return false;
	}

}
