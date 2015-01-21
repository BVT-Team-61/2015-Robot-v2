package org.usfirst.frc.team61.robot.commands;


public class ElevWithEncoder extends CommandBase {
	private double vel =.5;
	private double dist = 0;
	private double traveled = 0;
	private static final double threshold= 0.1;

	public ElevWithEncoder(double dist, double vel){
		requires(lift);
		
		this.vel = vel;
		this.dist = dist;
		
	}
	protected void end() {
		lift.moveElev(0.0);

	}

	protected void execute() {
		lift.moveElev(vel);
		traveled = -1.0*(lift.getLiftEncoder());
		 System.out.print(traveled+" units ");
	     System.out.println((dist - traveled)+" units to go");

	}

	protected void initialize() {
		lift.resetEncoder();
	}

	protected void interrupted() {

	}

	protected boolean isFinished() {
		return (dist - traveled)<threshold;
	}

}
