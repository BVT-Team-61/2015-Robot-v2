/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package org.usfirst.frc.team61.robot.commands;

/**
 * Drive for a specified distance (backwards) according to rotary encoder.
 * Should be replaced by a command that drives for a distance in both directions eventually.
 * @author Team-61
 */
public class ReverseDriveForDistance extends CommandBase {
    
    private static final double threshold = 2.0;
    private double speed = -0.1;
    private double traveled = 0;
    private double target = 0;
    
    public ReverseDriveForDistance( double target, double speed ) {
        // Use requires() here to declare subsystem dependencies
        // eg. requires(chassis);
        requires(drivetrain);
        
        this.target = target;
        this.speed = -1*speed;
    }

    // Called just before this Command runs the first time
    protected void initialize() {
        drivetrain.resetRightEncoder();
        drivetrain.resetLeftEncoder();
    }

    // Called repeatedly when this Command is scheduled to run
    protected void execute() {
        drivetrain.tankDrive(speed, speed);
        traveled = -1.0*((drivetrain.getLeftEncoder()+drivetrain.getRightEncoder())/2);
        System.out.println("######S"+speed+" L"+drivetrain.getLeftEncoder()+" R"+drivetrain.getRightEncoder());
    }

    // Make this return true when this Command no longer needs to run execute()
    protected boolean isFinished() {
        return (target - traveled) < threshold;
    }

    // Called once after isFinished returns true
    protected void end() {
        drivetrain.tankDrive(0.0, 0.0);
    }

    // Called when another command which requires one or more of the same
    // subsystems is scheduled to run
    protected void interrupted() {
    }
}
