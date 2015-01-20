package org.usfirst.frc.team61.robot.subsystems;

import org.usfirst.frc.team61.robot.RobotMap;

import edu.wpi.first.wpilibj.command.Subsystem;
import edu.wpi.first.wpilibj.Solenoid;
import edu.wpi.first.wpilibj.SpeedController;
import edu.wpi.first.wpilibj.Talon;

/**
 *
 */
public class Claw extends Subsystem {
    
    // Put methods for controlling this subsystem
    // here. Call these from Commands.
	private Solenoid open = new Solenoid(RobotMap.openSolenoid);
	private Solenoid close = new Solenoid(RobotMap.closeSolenoid);
	// declaring object For claw wheels
	private SpeedController leftClawMotor = new Talon(RobotMap.leftClawMotor);
	private SpeedController rightClawMotor = new Talon(RobotMap.rightClawMotor);
    public void initDefaultCommand() {
        // Set the default command for a subsystem here.
        //setDefaultCommand(new MySpecialCommand());
    	System.out.println("Claw Started");
    }
    
    public void openClaw() {
    	close.set(false);
    	open.set(true);
    }
    
    public void closeClaw() {
    	open.set(false);
    	close.set(true);
    }
    
    public void setState(boolean state) {
    	if(state) {
        	openClaw();
    	} else {
    		closeClaw();
    	}
    }
    
    public boolean getState() {
    	return open.get();
    }
    // put functions for the Claw wheels here
    // when x button is pressed the wheels spin inward.
    // when x button is pressed again the wheels spin outward.
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

