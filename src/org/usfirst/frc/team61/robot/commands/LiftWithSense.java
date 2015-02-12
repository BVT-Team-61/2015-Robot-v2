package org.usfirst.frc.team61.robot.commands;

/**
 * Lift motor at a specific speed with sensitivity adjustment.
 * @author Team-61
 */
public class LiftWithSense extends CommandBase {

    public LiftWithSense() {
        requires(lift);
        requires(serial);
    }

    // Called just before this Command runs the first time
    protected void initialize() {
		System.out.println("Lifting w/ Sense Started");
		System.out.println("With Serial Output");
    }

    // Called repeatedly when this Command is scheduled to run
    protected void execute() {
		lift.moveElev(oi.getElevSpeed()*oi.getElevSense());
		serial.sendByte((byte)lift.getLiftEncoder());
    }

    // Make this return true when this Command no longer needs to run execute()
    protected boolean isFinished() {
        return false;
    }

    // Called once after isFinished returns true
    protected void end() {
    }

    // Called when another command which requires one or more of the same
    // subsystems is scheduled to run
    protected void interrupted() {
    }
}
