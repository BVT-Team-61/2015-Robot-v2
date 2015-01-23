package org.usfirst.frc.team61.robot.commands;

/**
 * Move the elevator to a specific position based on encoder value.
 * @author Team-61
 */
public class ElevWithEncoder extends CommandBase {
	private double speed = 0.4;
	private double target = 0;
	private double position;
	private double error;
	private static final double threshold = 1.5;

	public ElevWithEncoder(double target, double speed){
		requires(lift);
		
		this.speed = speed;
		this.target = target;
		
	}
	protected void end() {
		lift.moveElev(0.0);
	}

	protected void execute() {
		position = lift.getLiftEncoder();
		error = target - position;
		double vel;
		if (error >= 5) vel = -speed;
		else if(error < 5 && error >= 2) vel = -speed/2;
		else if(error < 2 && error >= 0) vel = -speed/4;
		else if(error < 0 && error >= -2) vel = speed/4;
		else if(error < -2 && error >= -5) vel = speed/2;
		else if(error < -5) vel = speed;
		else vel = 0;
		lift.moveElev(vel);
		System.out.print(position+" units ");
	    System.out.println(error+" units to go @ "+vel);

	}

	protected void initialize() {
		//lift.resetEncoder();
		position = lift.getLiftEncoder();
		error = target - position;
	}

	protected void interrupted() {

	}

	protected boolean isFinished() {
		return Math.abs(error)<threshold || lift.getLiftLimit();
	}

}
