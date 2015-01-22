/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package org.usfirst.frc.team61.robot.commands;

/**
 * Set the velocity of the drive motors based on the value of the joysticks.
 * @author Team-61 
 */
public class DriveWithJoysticks extends CommandBase {
        
    public DriveWithJoysticks() {
        // Use requires() here to declare subsystem dependencies
        // eg. requires(chassis);
        requires(drivetrain);
    }

    // Called just before this Command runs the first time
    protected void initialize() {
    	System.out.println("Driving");
    }

    // Called repeatedly when this Command is scheduled to run
    protected void execute() {
        // Pass joystick values to drivetrain subsystem.
    	drivetrain.tankDrive(oi.getLeftSpeed(),oi.getRightSpeed());
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
