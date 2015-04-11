package org.usfirst.frc.team61.robot.subsystems;

import org.usfirst.frc.team61.robot.RobotMap;

import edu.wpi.first.wpilibj.command.Subsystem;
import edu.wpi.first.wpilibj.DigitalInput;

public class ToggleSwitch extends Subsystem {

	private DigitalInput switchA = new DigitalInput(RobotMap.autoSwitchA);
	private DigitalInput switchB = new DigitalInput(RobotMap.autoSwitchB);
	
	protected void initDefaultCommand() {

	}
	
	public boolean getSwitchA(){
		return !switchA.get();
	}
	
	public boolean getSwitchB(){
		return !switchB.get();
	}
}