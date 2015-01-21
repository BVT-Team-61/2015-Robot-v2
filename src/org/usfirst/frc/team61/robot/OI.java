package org.usfirst.frc.team61.robot;

import edu.wpi.first.wpilibj.Joystick;
import edu.wpi.first.wpilibj.buttons.Button;
import edu.wpi.first.wpilibj.buttons.JoystickButton;

import org.usfirst.frc.team61.robot.RobotMap;
import org.usfirst.frc.team61.robot.commands.ClawToggle;

/**
 * This class is the glue that binds the controls on the physical operator
 * interface to the commands and command groups that allow control of the robot.
 */
public class OI {
   
   // Define Joystick Objects
   Joystick jLeft = new Joystick(RobotMap.leftStick);    
   Joystick jRight = new Joystick(RobotMap.rightStick); 
   Joystick jElev = new Joystick(RobotMap.elevStick);
   Joystick jClaw = new Joystick(RobotMap.clawStick);
   
   // Define Joystick Buttons
   Button clawButton = new JoystickButton (jLeft,1);
   Button spinButton = new JoystickButton (jClaw,1);
   
   public OI() {
	   clawButton.whenPressed(new ClawToggle());
   }
    
    // Method to return the left joystick Y Axis.
    public double getLeftSpeed() {
        return (jLeft.getY()); 
    }
    public boolean getSpinButton(){
    	return (spinButton.get());// gets the speed for the wheels on the side of the arms
    }
    public double getClawSpeed(){
    	return (jClaw.getY());
    }
    // Same thing but for the right joystick Y Axis.
    public double getRightSpeed() {
        return (jRight.getY());
    }
    
    // Same thing but for the right joystick Y Axis.
    public double getElevSpeed() {
        return (jElev.getY());
    }

    // Same thing but for the right joystick Z Axis.
    public double getElevSense() {
        return ((jElev.getZ()+1)/2);
    }
}

