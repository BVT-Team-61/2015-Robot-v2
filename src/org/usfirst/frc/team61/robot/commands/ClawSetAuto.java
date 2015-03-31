package org.usfirst.frc.team61.robot.commands;


public class ClawSetAuto extends CommandBase {

	private double vel = .2;
	
	public ClawSetAuto(double vel){
		requires(claw);
		this.vel = vel;
	}
	
	protected void end() {
	}

	protected void execute() {
	}

	protected void initialize() {
		claw.clawDrive(vel,false);
	}

	protected void interrupted() {

	}

	protected boolean isFinished() {
		return true;
	}

}
