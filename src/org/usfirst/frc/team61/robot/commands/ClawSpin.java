package org.usfirst.frc.team61.robot.commands;


/**
 * Spins the claw motors based on joystick speed.
 * Spin button reverses direction of one motor.
 * @author Team-61
 */
public class ClawSpin extends CommandBase {

    public ClawSpin() {
        // Use requires() here to declare subsystem dependencies
        // eg. requires(chassis);
    	requires(claw);
    }

    // Called just before this Command runs the first time
    protected void initialize() {
    }

    // Called repeatedly when this Command is scheduled to run
    protected void execute() {
    	claw.clawDrive( oi.getClawSpeed(),oi.getSpinButton() );
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
