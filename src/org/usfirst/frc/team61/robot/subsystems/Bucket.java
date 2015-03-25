package org.usfirst.frc.team61.robot.subsystems;
import org.usfirst.frc.team61.robot.RobotMap;
import edu.wpi.first.wpilibj.command.Subsystem;
import edu.wpi.first.wpilibj.Solenoid;

public class Bucket extends Subsystem {
	private Solenoid Up = new Solenoid(RobotMap.upSolenoid);
	private Solenoid Down = new Solenoid(RobotMap.downSolenoid);

	public void BucketUp() {
		Down.set(false);
		Up.set(true);
	}
	public void BucketDown() {
		Down.set(true);
		Up.set(false);
	}
	public void setState(boolean state) {
		if (state) {
			BucketUp();
		}else {
			BucketDown();
		}
	}
	public boolean getState(){
		return Up.get();
	}
	@Override
	protected void initDefaultCommand() {
		// TODO Auto-generated method stub
		
	}
}
	