package org.usfirst.frc.team61.robot.subsystems;

import org.usfirst.frc.team61.robot.RobotMap;
import org.usfirst.frc.team61.robot.commands.ClawSpin;

import edu.wpi.first.wpilibj.command.Subsystem;
import edu.wpi.first.wpilibj.Solenoid;
import edu.wpi.first.wpilibj.SpeedController;
import edu.wpi.first.wpilibj.Talon;

/**
 * Subsystem that controls the claw solenoids (open/close)
 * and controls SpeedControllers for suck motors.
 * @author Team-61
 */
public class Claw extends Subsystem {
    
    // Solenoid declarations.
	private Solenoid open = new Solenoid(RobotMap.openSolenoid);
	private Solenoid close = new Solenoid(RobotMap.closeSolenoid);
	
	// SpeedController declarations.
	private SpeedController leftClawMotor = new Talon(RobotMap.leftClawMotor);
	private SpeedController rightClawMotor = new Talon(RobotMap.rightClawMotor);
	
    public void initDefaultCommand() {
    	setDefaultCommand(new ClawSpin());
    }
    
    /**
     * Sets the claw state to open.
     */
    public void openClaw() {
    	close.set(false);
    	open.set(true);
    }
    
    /**
     * Sets the claw state to closed.
     */
    public void closeClaw() {
    	open.set(false);
    	close.set(true);
    }
    
    /**
     * Sets the claw state
     * @param state - true (open) or false
     */
    public void setState(boolean state) {
    	if(state) {
        	openClaw();
    	} else {
    		closeClaw();
    	}
    }
    
    /**
     * returns the state of the claw pnuematics
     * @return true (open) or false
     */
    public boolean getState() {
    	return open.get();
    }
    
	/**
	 * Controls claw motors
	 * @param speed - rate that the motors spin
	 * @param spin - if true, right motor direction is reversed.
	 */
    public void clawDrive(double speed, boolean spin) {
		moveLeftMotor(speed);
		if (spin) {
			moveRightMotor(-speed);
		} else {
			moveRightMotor(speed);
		}

	}
    
    
    /**
     * 
     * @param speed 
     */
    private void moveLeftMotor(double speed)
    {
        speed = speed*-1.0;
        leftClawMotor.set(speed);
    }
    
    /**
     * 
     * @param speed 
     */
    private void moveRightMotor(double speed)
    {
        rightClawMotor.set(speed);
    }
}

