package org.usfirst.frc.team61.robot.subsystems;

import edu.wpi.first.wpilibj.command.Subsystem;
import org.usfirst.frc.team61.robot.RobotMap;
import edu.wpi.first.wpilibj.SpeedController;
import edu.wpi.first.wpilibj.Talon;
import org.usfirst.frc.team61.robot.commands.LiftWithSense;
import edu.wpi.first.wpilibj.Encoder;

public class Lift extends Subsystem {
	
	SpeedController elevMotor = new Talon(RobotMap.elevMotor);
	Encoder liftEncoder = new Encoder(RobotMap.elevEncoderA, RobotMap.elevEncoderB);

	protected void initDefaultCommand() {
		setDefaultCommand(new LiftWithSense());

	}
	public void moveElev(double vel){
		elevMotor.set(vel);
	}
	public double getLiftEncoder(){
		return liftEncoder.getDistance();
	}
	public void resetEncoder(){
		liftEncoder.reset();
	}

}
