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
	Button clawButton = new JoystickButton(jLeft,1);
	Button spinButton = new JoystickButton(jClaw,1);
	
    public OI() {
    	// Triggers ClawToggle command when the jClaw trigger is pressed.
		clawButton.whenPressed(new ClawToggle());
    }
    
    /**
     * Gets the state of the jClaw Trigger
     * @return true (pressed) or false
     */
    public boolean getSpinButton(){
    	return (spinButton.get());
    }
    
    /**
     * Gets the position of the jLeft Y Axis
     * @return joystick value scaled -1 to 1
     */
    public double getLeftSpeed() {
        return (jLeft.getY()); 
    }

    /** 
     * Gets the position of the jRight Y Axis
     * @return joystick value scaled -1 to 1
     */
    public double getRightSpeed() {
        return (jRight.getY());
    }
    
    /** 
     * Gets the position of the jClaw Y Axis
     * @return joystick value scaled -1 to 1
     */
    public double getClawSpeed(){
    	return (jClaw.getY());
    }
    
    /** 
     * Gets the position of the jElev Y Axis
     * @return joystick value scaled -1 to 1
     */
    public double getElevSpeed() {
        return (jElev.getY());
    }
    
    /** 
     * Gets the position of the jElev Z Axis
     * @return joystick value scaled -1 to 1
     */
    public double getElevSense() {
        return ((jElev.getZ()+1)/2);
    }
}

