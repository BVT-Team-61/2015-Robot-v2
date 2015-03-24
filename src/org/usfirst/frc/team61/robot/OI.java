package org.usfirst.frc.team61.robot;

import edu.wpi.first.wpilibj.Joystick;
import edu.wpi.first.wpilibj.buttons.Button;
import edu.wpi.first.wpilibj.buttons.JoystickButton;

import org.usfirst.frc.team61.robot.RobotMap;
import org.usfirst.frc.team61.robot.commands.ClawToggle;
import org.usfirst.frc.team61.robot.commands.ElevWithEncoder;
import org.usfirst.frc.team61.robot.commands.ElevEncoderReset;

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
	
	Button elevPosAButton = new JoystickButton(jElev,6);
	Button elevPosBButton = new JoystickButton(jElev,7);
	
	Button elevResetButton = new JoystickButton(jElev,8);
	Button elevResetBButton = new JoystickButton(jElev,9);

	Button elevPosDButton = new JoystickButton(jElev,10);
	Button elevPosCButton = new JoystickButton(jElev,11);
	
	Button BucketLift = new JoystickButton (jElev,1);
	/**
	 * OI Constructor - Define button to command mappings here.
	 */
    public OI() {
    	// Triggers ClawToggle command when the jClaw trigger is pressed.
		clawButton.whenPressed(new ClawToggle());
		
		// Elevator levels defined here. Uses base buttons.
		elevPosAButton.whenPressed(new ElevWithEncoder(0,0.4));
		elevPosBButton.whenPressed(new ElevWithEncoder(13,0.4));
		elevPosCButton.whenPressed(new ElevWithEncoder(26,0.4));
		elevPosDButton.whenPressed(new ElevWithEncoder(39,0.4));
		elevResetButton.whenPressed(new ElevEncoderReset());
		elevResetBButton.whenPressed(new ElevEncoderReset());
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

