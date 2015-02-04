package org.usfirst.frc.team61.robot.commands;


public class ClawMoveAuto extends CommandBase {

	private double vel = .2;
	
	public ClawMoveAuto(double time, double vel){
		requires(claw);
		this.vel = vel;
		setTimeout(time);
	}
	
	protected void end() {

	}

	protected void execute() {
		claw.clawDrive(vel,false);
	}

	protected void initialize() {

	}

	protected void interrupted() {

	}

	protected boolean isFinished() {
		return isTimedOut();
	}

}
