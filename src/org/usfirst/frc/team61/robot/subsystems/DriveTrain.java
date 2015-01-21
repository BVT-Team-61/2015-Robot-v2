/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package org.usfirst.frc.team61.robot.subsystems;

import org.usfirst.frc.team61.robot.RobotMap;
import org.usfirst.frc.team61.robot.commands.DriveWithJoysticks;

import edu.wpi.first.wpilibj.Encoder;
import edu.wpi.first.wpilibj.Gyro;
import edu.wpi.first.wpilibj.SpeedController;
import edu.wpi.first.wpilibj.Talon;
//import edu.wpi.first.wpilibj.Compressor;
//import edu.wpi.first.wpilibj.Talon;
import edu.wpi.first.wpilibj.command.Subsystem;

/**
 *
 * @author Team-61
 */
public class DriveTrain extends Subsystem {
    
    // Distance traveled per encoder pulse
    // pi * diameter of wheel / pulses per rotation
    private static final double dp = (3.14*8.5)/360; // scaled to inches
    
    //Define Encoders
    private Encoder leftEncoder = new Encoder(RobotMap.leftEncoderA, RobotMap.leftEncoderB);
    private Encoder rightEncoder = new Encoder(RobotMap.rightEncoderA, RobotMap.rightEncoderB);

    private Gyro mainGyro = new Gyro(RobotMap.mainGyro);

    private SpeedController leftMotor = new Talon(RobotMap.leftMotor);
    private SpeedController rightMotor = new Talon(RobotMap.rightMotor);

    // Initialize your subsystem here
    public DriveTrain() {
        super("DriveTrain");  
        leftEncoder.setDistancePerPulse(dp);
        rightEncoder.setDistancePerPulse(dp);
        //System.out.println("DriveTrain Started");
    }
    
    public void initDefaultCommand() {
        // Set the default command for a subsystem here.
        setDefaultCommand(new DriveWithJoysticks());
    }
    
    // -- Motors
    
    /**
     * Tank drive for main drivetrain.
     * @param left Left motor value
     * @param right Right motor value
     */
    public void tankDrive(double left, double right) {
        moveLeftMotor(left);
        moveRightMotor(right);
    }
    
    /**
     * 
     * @param speed 
     */
    private void moveLeftMotor(double speed)
    {
        leftMotor.set(speed);
    }
    
    /**
     * 
     * @param speed 
     */
    private void moveRightMotor(double speed)
    {
        speed = speed*-1.0;
        rightMotor.set(speed);
    }
    
    // -- Encoder
    
    /**
     * Reset Right Encoder
     * Resets the right encoder counter to 0
     */
    public void resetRightEncoder()
    {
        rightEncoder.reset();
    }
    
    /**
     * Reset Left Encoder
     * Resets the left encoder counter to 0
     */
    public void resetLeftEncoder()
    {
        leftEncoder.reset();
    }
    
    /**
     * Get Right Encoder Distance
     * Returns scaled value of right encoder
     * 
     * @return distance since last reset of right encoder
     */
    public double getRightEncoder()
    {
        return rightEncoder.getDistance();
    }
    
    /**
     * Get Left Encoder Distance
     * Returns scaled value of left encoder
     * 
     * @return distance since last reset of left encoder
     */
    public double getLeftEncoder()
    {
        return leftEncoder.getDistance();
    }
    
    // -- Gyroscope
    
    /**
     * Resets Gyro to 0
     */
    public void resetGyro(){
        mainGyro.reset();
    }
    
    /**
     * Get Gyro Angle
     * Positive is clockwise
     * @return scaled angle in degrees
     */
    public double getGyroAngle(){
        return mainGyro.getAngle();
    }
    
    public double getGyroRate(){
        return mainGyro.getRate();
    }
}
 