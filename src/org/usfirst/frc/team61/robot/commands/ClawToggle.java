package org.usfirst.frc.team61.robot.commands;

/**
 * Switches the state of the claw.
 * @author Team-61
 */
public class ClawToggle extends CommandBase {

    public ClawToggle() {
        // Use requires() here to declare subsystem dependencies
        // eg. requires(chassis);
    	requires(claw);
    }

    // Called just before this Command runs the first time
    protected void initialize() {
    	claw.setState(!claw.getState()); // Set the claw to the opposite state
    }

    // Called repeatedly when this Command is scheduled to run
    protected void execute() {
    }

    // Make this return true when this Command no longer needs to run execute()
    protected boolean isFinished() {
        return true;
    }

    // Called once after isFinished returns true
    protected void end() {
    }

    // Called when another command which requires one or more of the same
    // subsystems is scheduled to run
    protected void interrupted() {
    }
}
