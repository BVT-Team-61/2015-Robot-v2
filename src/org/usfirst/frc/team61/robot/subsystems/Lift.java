package org.usfirst.frc.team61.robot.subsystems;

import edu.wpi.first.wpilibj.command.Subsystem;
import org.usfirst.frc.team61.robot.RobotMap;
import edu.wpi.first.wpilibj.SpeedController;
import edu.wpi.first.wpilibj.Talon;
import org.usfirst.frc.team61.robot.commands.LiftWithSense;
import edu.wpi.first.wpilibj.Encoder;

/**
 * Subsystem to control the motor that lifts the totes up and down.
 * @author Team-61
 */
public class Lift extends Subsystem {
	
	SpeedController elevMotor = new Talon(RobotMap.elevMotor);
	Encoder liftEncoder = new Encoder(RobotMap.elevEncoderA, RobotMap.elevEncoderB);
	
	private static final double dp = 0.02625; // 100 pulses = 2 5/8 (2.625) inches

	public Lift(){
		liftEncoder.setDistancePerPulse(dp);
		//liftEncoder.setReverseDirection(true);
	}
	
	protected void initDefaultCommand() {
		setDefaultCommand(new LiftWithSense());

	}
	
	/**
	 * Move the elevator at a specific velocity.
	 * @param vel - elevator velocity
	 */
	public void moveElev(double vel){
		elevMotor.set(vel);
	}
	
	/**
	 * Gets the current value of the lift encoder
	 * @return number of pulses
	 */
	public double getLiftEncoder(){
		return liftEncoder.getDistance();
	}
	
	/**
	 * Resets lift encoder
	 */
	public void resetEncoder(){
		liftEncoder.reset();
	}

}
