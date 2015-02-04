/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package org.usfirst.frc.team61.robot.commands;

/**
 * Turn the robot for a specific amount of degrees based on the gyro reading.
 * @author Team-61
 */
public class TurnForDegrees extends CommandBase {
    
    private static final double kThresh = 3.0;
    private double target;
    private double angle;
    private double error;
    private double speed = 0.2;
    
    public TurnForDegrees(double angle, double speed) {
        requires(drivetrain);
        //setTimeout(600); // If turning for more than 600 seconds, somethings wrong.
        this.angle = angle;
        this.speed = speed;
    }

    // Called just before this Command runs the first time
    protected void initialize() {
    	drivetrain.resetGyro();
        target = drivetrain.getGyroAngle() + angle;
    }

    // Called repeatedly when this Command is scheduled to run
    protected void execute() {
    	double angle = drivetrain.getGyroAngle();
        error = target - angle;
        System.out.println("T "+target+" - A "+angle+" = E "+error);
        double vel = (error > 0) ? speed : -speed;
        System.out.println(-vel + " " + vel);
        drivetrain.tankDrive(-vel, vel);
        System.out.println(error);
    }

    // Make this return true when this Command no longer needs to run execute()
    protected boolean isFinished() {
        return ((Math.abs(error) < kThresh));
        //return ((Math.abs(error) < kThresh) || isTimedOut());
    }

    // Called once after isFinished returns true
    protected void end() {
    	System.out.println("DONE");
    }

    // Called when another command which requires one or more of the same
    // subsystems is scheduled to run
    protected void interrupted() {
    }
}
