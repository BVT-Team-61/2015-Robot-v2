package org.usfirst.frc.team61.robot.commands;

import edu.wpi.first.wpilibj.command.Command;
import edu.wpi.first.wpilibj.command.CommandGroup;
//IMPORTANT. I didnt exactly know how the ElevWithEncoders worked going down since we have
// never used it. be careful i dont want to break the robot. -Jake
public class AutonomousThreeStack extends CommandGroup {
	public AutonomousThreeStack(){
			addParallel(new ClawMoveAuto(15,1));
			addSequential(new BucketLift());
			addSequential(new ElevWithEncoder(30,.4));
			addSequential(new TurnForDegrees(160,.3));
			addSequential(new DriveForDistance(4,-.3));
			addSequential(new ClawToggle());
			addSequential(new ElevWithEncoder(0,.5));//probaly need an increase in speed. Also is their a program to just go to zero?
			addSequential(new WaitForTime(1));
			addSequential(new ElevWithEncoder(30,.4));
			addSequential(new ClawToggle());
			addSequential(new DriveForDistance(12,-.3));
			addSequential(new ClawToggle());
			addSequential(new TurnForDegrees(-80,.3));
			addSequential(new DriveForDistance(136,-.4));
			addSequential(new ElevWithEncoder(0,.5));//speed change again.
			addSequential(new TurnForDegrees(80,.3));
			addSequential(new BucketLift());
			addSequential(new ClawToggle());
		}

	
	}
	

