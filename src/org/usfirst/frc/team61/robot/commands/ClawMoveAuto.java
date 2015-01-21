package org.usfirst.frc.team61.robot.commands;

import edu.wpi.first.wpilibj.command.Command;

public class ClawMoveAuto extends CommandBase {

	private double vel = .2;
	private double time = 1;
	
	public ClawMoveAuto(double time, double vel){
		requires(claw);
		this.vel = vel;
		this.time = time;
	}
	
	protected void end() {
		// TODO Auto-generated method stub

	}

	protected void execute() {
		// TODO Auto-generated method stub
		claw.clawDrive(vel,false);
		setTimeout(time);
	}

	protected void initialize() {
		// TODO Auto-generated method stub

	}

	protected void interrupted() {
		// TODO Auto-generated method stub

	}

	protected boolean isFinished() {
		// TODO Auto-generated method stub
		return isTimedOut();
	}

}
