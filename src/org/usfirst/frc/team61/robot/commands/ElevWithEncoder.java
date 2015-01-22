package org.usfirst.frc.team61.robot.commands;


public class ElevWithEncoder extends CommandBase {
	private double speed = 0.9;
	private double target = 0;
	private double position;
	private double error;
	private static final double threshold = 5;

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
		double vel = (error > 0) ? speed : -speed;
		lift.moveElev(vel);
		 System.out.print(position+" units ");
	     System.out.println(error+" units to go");

	}

	protected void initialize() {
		//lift.resetEncoder();
		position = lift.getLiftEncoder();
		error = target - position;
	}

	protected void interrupted() {

	}

	protected boolean isFinished() {
		return Math.abs(error)<threshold;
	}

}
