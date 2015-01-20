package org.usfirst.frc.team61.robot.subsystems;

import org.usfirst.frc.team61.robot.RobotMap;

import edu.wpi.first.wpilibj.command.Subsystem;
import edu.wpi.first.wpilibj.Solenoid;

/**
 *
 */
public class Claw extends Subsystem {
    
    // Put methods for controlling this subsystem
    // here. Call these from Commands.
	private static Solenoid open = new Solenoid(RobotMap.openSolenoid);
	private static Solenoid close = new Solenoid(RobotMap.closeSolenoid);
	
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
}

